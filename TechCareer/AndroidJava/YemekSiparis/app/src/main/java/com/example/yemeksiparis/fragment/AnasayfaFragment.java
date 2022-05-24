package com.example.yemeksiparis.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.yemeksiparis.R;
import com.example.yemeksiparis.adapter.YemeklerAdapter;
import com.example.yemeksiparis.databinding.FragmentAnasayfaBinding;
import com.example.yemeksiparis.viewmodel.AnasayfaFragmentVM;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding tasarim;
    private AnasayfaFragmentVM viewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_anasayfa, container, false);
        tasarim.toolbarAnasayfa.setTitle("Anasayfa");
        tasarim.setAnasayfaFragment(this);
        ((AppCompatActivity)getActivity()).setSupportActionBar(tasarim.toolbarAnasayfa);
        viewModel.yemeklerListesi.observe(getViewLifecycleOwner(), liste -> {
            YemeklerAdapter yemeklerAdapter = new YemeklerAdapter(requireContext(), liste);
            tasarim.setYemeklerAdapter(yemeklerAdapter);
        });

        return tasarim.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(AnasayfaFragmentVM.class);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.anasayfa_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.cart:
                sepeteGit(requireView());
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void sepeteGit(View view){
        Navigation.findNavController(view).navigate(R.id.sepetGecis);
    }

}