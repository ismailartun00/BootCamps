package com.example.todo.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.todo.repo.YapilacaklarDaoRepository;

public class KayitFragmentVM extends AndroidViewModel {
    private YapilacaklarDaoRepository yrepo;

    public KayitFragmentVM(@NonNull Application application) {
        super(application);
        yrepo = new YapilacaklarDaoRepository(application);
    }

    public void kayit(String yapilacak_is){
        yrepo.yapilacakKayit(yapilacak_is);
    }
}
