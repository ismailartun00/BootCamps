package com.example.todo.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.todo.repo.YapilacaklarDaoRepository;

public class DetayFragmentVM extends AndroidViewModel {
    private YapilacaklarDaoRepository yrepo;

    public DetayFragmentVM(@NonNull Application application) {
        super(application);
        this.yrepo = new YapilacaklarDaoRepository(application);
    }

    public void guncelle(int yapilacak_id, String yapilacak_is){
        yrepo.yapilacakGuncelle(yapilacak_id, yapilacak_is);
    }
}
