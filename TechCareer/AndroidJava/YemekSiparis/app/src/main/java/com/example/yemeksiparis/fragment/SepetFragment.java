package com.example.yemeksiparis.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.yemeksiparis.R;
import com.example.yemeksiparis.adapter.SepetAdapter;
import com.example.yemeksiparis.databinding.FragmentSepetBinding;
import com.example.yemeksiparis.viewmodel.SepetFragmentVM;

public class SepetFragment extends Fragment {

    private FragmentSepetBinding tasarim;
    private SepetFragmentVM viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_sepet, container, false);
        tasarim.setSepetToolbarBaslik("Sepet");
        tasarim.setSepetFragment(this);
        ((AppCompatActivity)getActivity()).setSupportActionBar(tasarim.toolbarSepet);
        viewModel.sepetYemeklerListesi.observe(getViewLifecycleOwner(),liste -> {
            SepetAdapter sepetAdapter = new SepetAdapter(requireContext(), liste, viewModel);
            tasarim.setSepetAdapter(sepetAdapter);
        });


        return tasarim.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(SepetFragmentVM.class);
    }
}