package com.example.yemeksiparis.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemeksiparis.R;
import com.example.yemeksiparis.databinding.CardTasarimSepetBinding;
import com.example.yemeksiparis.entity.SepetYemekler;
import com.example.yemeksiparis.fragment.AnasayfaFragment;
import com.example.yemeksiparis.fragment.SepetFragment;
import com.example.yemeksiparis.repo.YemeklerDaoRepository;
import com.example.yemeksiparis.retrofit.ApiUtils;
import com.example.yemeksiparis.viewmodel.SepetFragmentVM;
import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SepetAdapter extends RecyclerView.Adapter<SepetAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<SepetYemekler> sepetYemeklerListesi;
    private SepetFragmentVM viewModel;

    public SepetAdapter(Context mContext, List<SepetYemekler> sepetYemeklerListesi, SepetFragmentVM viewModel) {
        this.mContext = mContext;
        this.sepetYemeklerListesi = sepetYemeklerListesi;
        this.viewModel = viewModel;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarimSepetBinding tasarim;

        public CardTasarimTutucu(CardTasarimSepetBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        CardTasarimSepetBinding tasarim = DataBindingUtil.inflate(layoutInflater, R.layout.card_tasarim_sepet, parent, false);
        return new CardTasarimTutucu(tasarim);
    }


    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        SepetYemekler sepetYemekler = sepetYemeklerListesi.get(position);
        CardTasarimSepetBinding t = holder.tasarim;

        t.setSepetNesnesi(sepetYemekler);
        // t.setSepetNesnesiId(sepetYemekler.getSepet_yemek_id());

        String url = ApiUtils.SEPET_URL + sepetYemekler.getYemek_resim_adi();
        Picasso.get().load(url).into(t.ivSepetResim);

        t.buttonSil.setOnClickListener(view -> {
            sepettenYemekSil(sepetYemekler.getYemek_adi(), sepetYemekler.getSepet_yemek_id(), sepetYemekler.getKullanici_adi());
            viewModel.sepettekiYemekleriYukle();
        });

        t.sepetCard.setBackgroundResource(R.drawable.customized_rounded_corner);
    }

    @Override
    public int getItemCount() {
        return sepetYemeklerListesi.size();
    }

    public void sepettenYemekSil(String yemek_adi, int sepet_yemek_id, String kullanici_adi) {

        AlertDialog alertDialog = new AlertDialog.Builder(mContext)
                .setIcon(R.drawable.food_logo).setTitle("To Do App").setMessage(yemek_adi + " silinsin mi?")
                .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        viewModel.sepettenYemekSil(sepet_yemek_id, kullanici_adi);
                        Toast.makeText(mContext.getApplicationContext(), yemek_adi + " silindi.", Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(mContext.getApplicationContext(), "Hiç bir şey yapılmadı.", Toast.LENGTH_LONG).show();
                    }
                }).show();
    }


}
