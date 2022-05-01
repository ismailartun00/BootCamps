package com.example.todo.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todo.R;
import com.example.todo.databinding.FragmentKayitBinding;
import com.example.todo.viewModel.KayitFragmentVM;
import com.example.todo.viewModel.viewModelFactory.KayitFragmentVMF;

public class KayitFragment extends Fragment {
    private FragmentKayitBinding tasarim;
    private KayitFragmentVM viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_kayit, container, false);
        tasarim.setKayitFragment(this);
        tasarim.setKayitToolbarBaslik("Yapılacak Kayıt");
        return tasarim.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this, new KayitFragmentVMF(requireActivity().getApplication())).get(KayitFragmentVM.class);
    }

    public void buttonKaydetTikla(String yapilacak_is){
        viewModel.kayit(yapilacak_is);
    }
}