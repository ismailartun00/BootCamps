package com.example.kisileruygulamasi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kisileruygulamasi.databinding.CardTasarimBinding;
import com.example.kisileruygulamasi.entity.Kisiler;

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
    }

    @Override
    public int getItemCount() {
        return kisilerListesi.size();
    }
}
