package com.br.sweetmusic.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.br.sweetmusic.pojos.Album;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static com.br.sweetmusic.network.RetrofitService.getApiService;


public class MainViewModel extends AndroidViewModel {
    private MutableLiveData<List<Album>> albunsLiveData = new MutableLiveData<>();
    private MutableLiveData<String> albunsLiveDataError = new MutableLiveData<>();
    private MutableLiveData<Boolean> isLoading = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<List<Album>> getAlbunsLiveData() {
        return albunsLiveData;
    }

    public MutableLiveData<String> getAlbunsLiveDataError() {
        return albunsLiveDataError;
    }

    public void getAlbuns(String artista) {

        disposable.add(
                getApiService().getAlbunsByArtist(artista)
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe((Disposable disposable) -> {
                            isLoading.setValue(true);
                        })
                        .doOnTerminate(() -> {
                            isLoading.setValue(false);
                        })
                        .subscribe(albuns ->
                                {
                                    albunsLiveData.setValue(albuns.getAlbum());
                                }
                                , throwable -> {
                                    albunsLiveDataError.setValue(throwable.getMessage());
                                })

        );


    }

    @Override
    protected void onCleared() {
        super.onCleared();
        disposable.clear();
    }
}
