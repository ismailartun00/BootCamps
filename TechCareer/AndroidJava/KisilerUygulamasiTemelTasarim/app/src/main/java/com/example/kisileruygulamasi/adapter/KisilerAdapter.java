package com.example.kisileruygulamasi.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kisileruygulamasi.databinding.CardTasarimBinding;
import com.example.kisileruygulamasi.entity.Kisiler;
import com.example.kisileruygulamasi.fragment.AnasayfaFragmentDirections;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class KisilerAdapter extends RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>{
    private Context mContext;
    private List<Kisiler> kisilerListesi;

    public KisilerAdapter(Context mContext, List<Kisiler> kisilerListesi) {
        this.mContext = mContext;
        this.kisilerListesi = kisilerListesi;
    }

    // card_tasarim.xml temsil ediyor.
    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarimBinding tasarim;

        public CardTasarimTutucu(CardTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        CardTasarimBinding tasarim = CardTasarimBinding.inflate(layoutInflater, parent, false);
        return new CardTasarimTutucu(tasarim);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Kisiler kisi = kisilerListesi.get(position);
        CardTasarimBinding t = holder.tasarim;

        t.textViewKisiBilgi.setText(kisi.getKisi_ad() + " - " + kisi.getKisi_tel());

        t.satirCard.setOnClickListener(view -> {
            AnasayfaFragmentDirections.KisiDetayGecis gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi);
            Navigation.findNavController(view).navigate(gecis);
        });

        t.imageViewSilResim.setOnClickListener(view -> {
            Snackbar.make(view, kisi.getKisi_ad() + " silinsin mi?", Snackbar.LENGTH_LONG)
                    .setAction("Evet", v1 -> {
                        Log.e("Kişi sil", String.valueOf(kisi.getKisi_id()));
                    }).show();
        });
    }

    @Override
    public int getItemCount() {
        return kisilerListesi.size();
    }
}
