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
import com.example.todo.databinding.FragmentDetayBinding;
import com.example.todo.entity.Yapilacaklar;
import com.example.todo.viewModel.DetayFragmentVM;
import com.example.todo.viewModel.viewModelFactory.DetayFragmentVMF;

public class DetayFragment extends Fragment {
    private FragmentDetayBinding tasarim;
    private DetayFragmentVM viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_detay, container, false);
        tasarim.setDetayFragment(this);
        tasarim.setDetayToolbarBaslik("Yapılacak Detay");

        DetayFragmentArgs bundle = DetayFragmentArgs.fromBundle(getArguments());
        Yapilacaklar gelenYapilacak = bundle.getYapilacak();
        tasarim.setYapilacakNesnesi(gelenYapilacak);

        return tasarim.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this, new DetayFragmentVMF(requireActivity().getApplication())).get(DetayFragmentVM.class);
    }

    public void buttonGuncelle(int yapilacak_id, String yapilacak_is){
        viewModel.guncelle(yapilacak_id, yapilacak_is);
    }
}