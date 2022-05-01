package com.example.todo.viewModel.viewModelFactory;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.todo.viewModel.DetayFragmentVM;

public class DetayFragmentVMF extends ViewModelProvider.NewInstanceFactory {
    private final Application application;

    public DetayFragmentVMF(Application application) {
        this.application = application;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new DetayFragmentVM(application);
    }
}
