package com.example.gittigidiyorappexample.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gittigidiyorappexample.R;
import com.example.gittigidiyorappexample.adapter.FirsatlarAdapter;
import com.example.gittigidiyorappexample.databinding.FragmentAnasayfaBinding;
import com.example.gittigidiyorappexample.entity.Firsatlar;

import java.util.ArrayList;
import java.util.List;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false);

        tasarim.rv.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        ArrayList<Firsatlar> firsatlarListesi = new ArrayList<>();
        Firsatlar f1 = new Firsatlar(1, "Anneler Günü", "annelergunu");
        Firsatlar f2 = new Firsatlar(2, "Ev Dekorasyon", "evdekorasyon");
        Firsatlar f3 = new Firsatlar(3, "Cep Telefonu", "ceptelefonu");
        Firsatlar f4 = new Firsatlar(4, "Axess Kart Fırsatları", "axesscard");
        Firsatlar f5 = new Firsatlar(5, "Visa Kart Fırsatları", "visacard");
        Firsatlar f6 = new Firsatlar(6, "Bilgisayar Tablet", "bilgisayartablet");

        firsatlarListesi.add(f1);
        firsatlarListesi.add(f2);
        firsatlarListesi.add(f3);
        firsatlarListesi.add(f4);
        firsatlarListesi.add(f5);
        firsatlarListesi.add(f6);

        FirsatlarAdapter adapter = new FirsatlarAdapter(requireContext(), firsatlarListesi);
        tasarim.rv.setAdapter(adapter);

        return tasarim.getRoot();
    }
}