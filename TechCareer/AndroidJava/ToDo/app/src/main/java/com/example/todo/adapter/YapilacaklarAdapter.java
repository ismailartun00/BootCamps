package com.example.todo.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todo.R;
import com.example.todo.databinding.CardTasarimBinding;
import com.example.todo.entity.Yapilacaklar;
import com.example.todo.fragment.AnasayfaFragmentDirections;
import com.example.todo.viewModel.AnasayfaFragmentVM;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class YapilacaklarAdapter extends RecyclerView.Adapter<YapilacaklarAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Yapilacaklar> yapilacaklarListesi;
    private AnasayfaFragmentVM viewModel;

    public YapilacaklarAdapter(Context mContext, List<Yapilacaklar> yapilacaklarListesi, AnasayfaFragmentVM viewModel) {
        this.mContext = mContext;
        this.yapilacaklarListesi = yapilacaklarListesi;
        this.viewModel = viewModel;
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
        CardTasarimBinding tasarim = DataBindingUtil.inflate(layoutInflater, R.layout.card_tasarim, parent, false);
        return new CardTasarimTutucu(tasarim);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Yapilacaklar yapilacak = yapilacaklarListesi.get(position);
        CardTasarimBinding t = holder.tasarim;
        t.setYapilacakNesnesi(yapilacak);

        t.satirCard.setOnClickListener(view -> {
            AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(yapilacak);
            Navigation.findNavController(view).navigate(gecis);
        });

        t.imageViewSilResim.setOnClickListener(view -> {
            AlertDialog alertDialog = new AlertDialog.Builder(mContext)
                    .setIcon(R.drawable.splash).setTitle("To Do App").setMessage(yapilacak.getYapilacak_is() + " silinsin mi?")
                    .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            viewModel.sil(yapilacak.getYapilacak_id());
                            Toast.makeText(mContext.getApplicationContext(), yapilacak.getYapilacak_is() + " silindi.", Toast.LENGTH_LONG).show();
                        }
                    })
                    .setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(mContext.getApplicationContext(), "Hiç bir şey yapılmadı.", Toast.LENGTH_LONG).show();
                        }
                    }).show();
        });
    }

    @Override
    public int getItemCount() {
        return yapilacaklarListesi.size();
    }
}