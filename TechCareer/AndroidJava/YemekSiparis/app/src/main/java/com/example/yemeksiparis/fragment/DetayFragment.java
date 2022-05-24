package com.example.yemeksiparis.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.yemeksiparis.R;
import com.example.yemeksiparis.databinding.FragmentDetayBinding;
import com.example.yemeksiparis.entity.Yemekler;
import com.example.yemeksiparis.retrofit.ApiUtils;
import com.example.yemeksiparis.viewmodel.DetayFragmentVM;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class DetayFragment extends Fragment {
    private FragmentDetayBinding tasarim;
    private DetayFragmentVM viewModel;
    private FirebaseAuth auth = FirebaseAuth.getInstance();
    private FirebaseUser currentUser = auth.getCurrentUser();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_detay, container, false);
        tasarim.setDetayFragment(this);

        tasarim.setDetayToolbarBaslik("Detay");

        DetayFragmentArgs bundle = DetayFragmentArgs.fromBundle(getArguments());
        Yemekler gelenYemek = bundle.getYemek();

        tasarim.setYemekNesnesi(gelenYemek);
        tasarim.setKullaniciAdi(currentUser.getEmail());


        String url = ApiUtils.SEPET_URL + gelenYemek.getYemek_resim_adi();
        Picasso.get().load(url).into(tasarim.ivYemekResmi);

        tasarim.buttonAzalt.setOnClickListener(view -> {
            int b = Integer.parseInt(tasarim.textViewYemekAdedi.getText().toString());
            if (b >= 2)
                b--;
            String adet = String.valueOf(tasarim.textViewYemekAdedi.getText().toString());
            tasarim.textViewYemekAdedi.setText(adet);
            int fiyat = b * gelenYemek.getYemek_fiyat();
            tasarim.textViewYemekFiyati.setText(String.valueOf(fiyat) + " ₺");
        });

        tasarim.buttonArttir.setOnClickListener(view -> {
            String a = tasarim.textViewYemekAdedi.getText().toString();
            int b = Integer.parseInt(a);
            if (b >= 1)
                b++;
            String adet = String.valueOf(b);
            tasarim.textViewYemekAdedi.setText(adet);
            int fiyat = b * gelenYemek.getYemek_fiyat();
            tasarim.textViewYemekFiyati.setText(String.valueOf(fiyat) + " ₺");
        });

        return tasarim.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(this).get(DetayFragmentVM.class);
        super.onCreate(savedInstanceState);
    }

    public void buttonEkle(String yemek_adi, String yemek_resim_adi, int yemek_fiyat, int yemek_siparis_adet, String kullanici_adi){
        viewModel.sepeteYemekEkle(yemek_adi,yemek_resim_adi,yemek_fiyat,yemek_siparis_adet,kullanici_adi);
        Toast.makeText(requireContext().getApplicationContext(), yemek_siparis_adet + " adet " + yemek_adi + " sepete eklendi.", Toast.LENGTH_LONG).show();
    }
}