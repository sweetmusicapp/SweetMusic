package com.br.sweetmusic.viewmodel;

import android.app.Application;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.br.sweetmusic.data.DatabaseSweet;
import com.br.sweetmusic.data.SweetDao;
import com.br.sweetmusic.pojos.Track;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

import static com.br.sweetmusic.network.RetrofitService.getApiService;

public class TracksViewModel extends AndroidViewModel {

    private MutableLiveData<List<Track>> tracksMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<String> tracksLiveDataError = new MutableLiveData<>();
    private MutableLiveData<Boolean> isLoading = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private MutableLiveData<Track> trackMutableLiveData = new MutableLiveData<>();
    private SweetDao dao = DatabaseSweet.getDatabase(getApplication()).sweetDao();

    public MutableLiveData<List<Track>> getTracksMutableLiveData() {
        return tracksMutableLiveData;
    }

    public MutableLiveData<Track> getTrackMutableLiveData() {
        return trackMutableLiveData;
    }

    public TracksViewModel(@NonNull Application application) {
        super(application);
    }

    public void getTracks(String albumId) {
        disposable.add(
                getApiService().getTracksByAlbumId(albumId)
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe(disposable1 -> {
                            isLoading.setValue(true);
                        }).doOnTerminate(() -> {
                    isLoading.setValue(false);
                }).subscribe(tracks -> {
                    tracksMutableLiveData.setValue(tracks.getTrack());
                }, throwable -> {
                    tracksLiveDataError.setValue(throwable.getMessage());
                })
        );
    }

    public void insertTrack(Track track) {
        new Thread(() -> {
            if (track != null) {
                dao.insertTrack(track);
            }
        }).start();

        this.trackMutableLiveData.setValue(track);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
