package com.br.sweetmusic.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.br.sweetmusic.pojos.Track;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

import static com.br.sweetmusic.network.RetrofitService.getApiService;

public class TracksViewModel extends AndroidViewModel {

    private MutableLiveData<List<Track>> tracksLiveData = new MutableLiveData<>();
    private MutableLiveData<String> tracksLiveDataError = new MutableLiveData<>();
    private MutableLiveData<Boolean> isLoading = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();

    public MutableLiveData<List<Track>> getTracksLiveData() {
        return tracksLiveData;
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
                    tracksLiveData.setValue(tracks.getTrack());
                }, throwable -> {
                    tracksLiveDataError.setValue(throwable.getMessage());
                })
        );
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
