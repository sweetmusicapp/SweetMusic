package com.br.sweetmusic.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.br.sweetmusic.data.DatabaseSweet;
import com.br.sweetmusic.data.SweetDao;
import com.br.sweetmusic.pojos.Track;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class FavoritosViewModel extends AndroidViewModel {

    private MutableLiveData<List<Track>> tracksMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<String> tracksLiveDataError = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private SweetDao dao = DatabaseSweet.getDatabase(getApplication()).sweetDao();
    private MutableLiveData<Track> trackMutableLiveData = new MutableLiveData<>();


    public LiveData<List<Track>> retornaTracks() {
        return this.tracksMutableLiveData;
    }

    public FavoritosViewModel(@NonNull Application application) {
        super(application);
    }

    public void getFavoritos() {
        disposable.add(
                dao.getFavoritesTracks()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(tracks -> {
                            tracksMutableLiveData.setValue(tracks);
                        }, throwable -> {
                            Log.i("LOG", "erro: " + throwable.getMessage());
                        })
        );
    }

    public void deleteTrack(Track track) {
        new Thread(() -> {
            if (track != null) {
                dao.deleteTrack(track);
            }
        }).start();

        this.trackMutableLiveData.setValue(track);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
