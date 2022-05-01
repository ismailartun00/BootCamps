package com.example.todo.viewModel.viewModelFactory;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.todo.viewModel.AnasayfaFragmentVM;

public class AnasayfaFragmentVMF extends ViewModelProvider.NewInstanceFactory {
    private final Application application;

    public AnasayfaFragmentVMF(Application application) {
        this.application = application;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new AnasayfaFragmentVM(application);
    }
}
