package com.example.gittigidiyorappexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gittigidiyorappexample.databinding.FirsatCardTasarimBinding;
import com.example.gittigidiyorappexample.entity.Firsatlar;
import com.example.gittigidiyorappexample.fragment.AnasayfaFragment;
import com.example.gittigidiyorappexample.fragment.AnasayfaFragmentDirections;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class FirsatlarAdapter extends RecyclerView.Adapter<FirsatlarAdapter.FirsatlarCardTasarimTutucu> {
    private Context mContext;
    private List<Firsatlar> firsatlarListesi;

    public FirsatlarAdapter(Context mContext, List<Firsatlar> firsatlarListesi){
        this.mContext = mContext;
        this.firsatlarListesi = firsatlarListesi;
    }

    public class FirsatlarCardTasarimTutucu extends RecyclerView.ViewHolder{
        private FirsatCardTasarimBinding tasarim;
        public FirsatlarCardTasarimTutucu(FirsatCardTasarimBinding tasarim){
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public FirsatlarCardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        FirsatCardTasarimBinding tasarim = FirsatCardTasarimBinding.inflate(layoutInflater,parent,false);
        return new FirsatlarCardTasarimTutucu(tasarim);

    }

    @Override
    public void onBindViewHolder(@NonNull FirsatlarCardTasarimTutucu holder, int position) {
        Firsatlar firsat = firsatlarListesi.get(position);
        FirsatCardTasarimBinding t = holder.tasarim;

        t.imageViewFirsatResim.setImageResource(mContext.getResources().getIdentifier(firsat.getFirsatResimAd(), "drawable", mContext.getPackageName()));

        t.cardViewFirsat.setOnClickListener(view -> {
            Snackbar.make(view, firsat.getFirsatAd() + " ürünleri güncellenecektir.", Snackbar.LENGTH_SHORT).show();
            AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(firsat);
            Navigation.findNavController(view).navigate(gecis);
        });
    }

    @Override
    public int getItemCount() { return firsatlarListesi.size(); }
}
