package com.example.yemeksiparis.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.yemeksiparis.R;
import com.example.yemeksiparis.databinding.FragmentWelcomeBinding;

public class WelcomeFragment extends Fragment {
    private FragmentWelcomeBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, container, false);

        tasarim.btnSignIn.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.loginGecis);
        });

        tasarim.btnSignUp.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.registerGecis);
        });

        return tasarim.getRoot();
    }
}