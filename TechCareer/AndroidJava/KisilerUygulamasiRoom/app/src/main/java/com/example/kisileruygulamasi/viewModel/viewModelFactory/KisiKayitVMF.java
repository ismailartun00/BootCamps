package com.example.kisileruygulamasi.viewModel.viewModelFactory;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.kisileruygulamasi.viewModel.KisiKayitFragmentViewModel;

// View Model Factory
public class KisiKayitVMF extends ViewModelProvider.NewInstanceFactory {
    private final Application application;

    public KisiKayitVMF(Application application) {
        this.application = application;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new KisiKayitFragmentViewModel(application);
    }
}
