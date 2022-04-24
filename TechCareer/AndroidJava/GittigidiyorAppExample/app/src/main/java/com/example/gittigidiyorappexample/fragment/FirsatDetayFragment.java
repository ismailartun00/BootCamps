package com.example.gittigidiyorappexample.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gittigidiyorappexample.R;
import com.example.gittigidiyorappexample.databinding.FragmentFirsatDetayBinding;
import com.example.gittigidiyorappexample.entity.Firsatlar;
import com.google.android.material.snackbar.Snackbar;

public class FirsatDetayFragment extends Fragment {
    private FragmentFirsatDetayBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentFirsatDetayBinding.inflate(inflater, container, false);

        FirsatDetayFragmentArgs bundle = FirsatDetayFragmentArgs.fromBundle(getArguments());
        Firsatlar gelenFirsat = bundle.getFirsat();

        tasarim.toolbarDetay.setTitle(gelenFirsat.getFirsatAd());
        tasarim.ivFirsatResim.setImageResource(getResources().getIdentifier(gelenFirsat.getFirsatResimAd(), "drawable", requireContext().getPackageName()));
        tasarim.tvFirsatBaslik.setText(gelenFirsat.getFirsatAd());

        return tasarim.getRoot();
    }
}