package com.example.todo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
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
            Snackbar.make(view, yapilacak.getYapilacak_is() + " silinsin mi?", Snackbar.LENGTH_LONG)
                    .setAction("Evet", v1 -> {
                        viewModel.sil(yapilacak.getYapilacak_id());
                    }).show();
        });
    }

    @Override
    public int getItemCount() { return yapilacaklarListesi.size(); }


}
