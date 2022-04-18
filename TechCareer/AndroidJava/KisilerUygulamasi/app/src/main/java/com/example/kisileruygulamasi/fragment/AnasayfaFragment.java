package com.example.kisileruygulamasi.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.kisileruygulamasi.R;
import com.example.kisileruygulamasi.adapter.KisilerAdapter;
import com.example.kisileruygulamasi.databinding.FragmentAnasayfaBinding;
import com.example.kisileruygulamasi.entity.Kisiler;

import java.util.ArrayList;

public class AnasayfaFragment extends Fragment implements SearchView.OnQueryTextListener {
    private FragmentAnasayfaBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false);

        tasarim.toolbarAnasayfa.setTitle("Kişiler");

        ((AppCompatActivity)getActivity()).setSupportActionBar(tasarim.toolbarAnasayfa);

        tasarim.rv.setLayoutManager(new LinearLayoutManager(requireContext()));

        ArrayList<Kisiler> kisilerListesi = new ArrayList<>();

        Kisiler k1 = new Kisiler(1, "Ahmet", "111111");
        Kisiler k2 = new Kisiler(2, "Zeynep", "222222");
        Kisiler k3 = new Kisiler(3, "Beyza", "333333");
        kisilerListesi.add(k1);
        kisilerListesi.add(k2);
        kisilerListesi.add(k3);

        KisilerAdapter adapter = new KisilerAdapter(requireContext(), kisilerListesi);
        tasarim.rv.setAdapter(adapter);

        tasarim.fab.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.kisiKayitGecis);
        });

        return tasarim.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.toolbar_menu, menu);

        MenuItem item = menu.findItem(R.id.action_ara);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(this);

        super.onCreateOptionsMenu(menu, inflater);
    }

    /*@Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_ara:
                Log.e("Kişi Ara Icon", "Seçildi");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/

    @Override
    public boolean onQueryTextSubmit(String query) {
        ara(query);
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        ara(newText);
        return true;
    }

    public void ara(String aramaKelimesi){
        Log.e("Kişi Ara", aramaKelimesi);
    }
}