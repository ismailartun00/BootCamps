package com.example.todo.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.todo.entity.Yapilacaklar;
import com.example.todo.repo.YapilacaklarDaoRepository;

import java.util.List;

public class AnasayfaFragmentVM extends AndroidViewModel {
    private YapilacaklarDaoRepository yrepo;
    public MutableLiveData<List<Yapilacaklar>> yapilacaklarListesi = new MutableLiveData<>();

    public AnasayfaFragmentVM(@NonNull Application application) {
        super(application);
        yrepo = new YapilacaklarDaoRepository(application);
        yapilacaklariYukle();
        yapilacaklarListesi = yrepo.yapilacaklariGetir();
    }

    public void ara(String aramaKelimesi){
        yrepo.yapilacakAra(aramaKelimesi);
    }

    public void sil(int yapilacak_id){
        yrepo.yapilacakSil(yapilacak_id);
    }

    public void yapilacaklariYukle(){
        yrepo.tumYapilacaklariAl();
    }
}
