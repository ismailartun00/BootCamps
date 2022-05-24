package com.example.yemeksiparis.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yemeksiparis.R;
import com.example.yemeksiparis.databinding.CardTasarimBinding;
import com.example.yemeksiparis.databinding.FragmentAnasayfaBinding;
import com.example.yemeksiparis.databinding.FragmentDetayBinding;
import com.example.yemeksiparis.entity.Yemekler;
import com.example.yemeksiparis.fragment.AnasayfaFragment;
import com.example.yemeksiparis.fragment.AnasayfaFragmentDirections;
import com.example.yemeksiparis.fragment.DetayFragment;
import com.example.yemeksiparis.retrofit.ApiUtils;
import com.example.yemeksiparis.viewmodel.DetayFragmentVM;
import com.squareup.picasso.Picasso;

import java.util.List;

public class YemeklerAdapter extends RecyclerView.Adapter<YemeklerAdapter.CardTasarimTutucu>{
    private Context mContext;
    private List<Yemekler> yemeklerListesi;

    public YemeklerAdapter(Context mContext, List<Yemekler> yemeklerListesi) {
        this.mContext = mContext;
        this.yemeklerListesi = yemeklerListesi;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder{
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
        Yemekler yemek = yemeklerListesi.get(position);
        CardTasarimBinding t = holder.tasarim;

        t.setYemekNesnesi(yemek);
        String url = ApiUtils.SEPET_URL + yemek.getYemek_resim_adi();
        Picasso.get().load(url).into(t.imageViewYemekResmi);

        t.satirCard.setCardBackgroundColor(mContext.getResources().getColor(R.color.white));

        t.satirCard.setOnClickListener(view -> {
            /*AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(yemek);
            Navigation.findNavController(view).navigate(gecis);*/

            t.satirCard.setCardBackgroundColor(mContext.getResources().getColor(R.color.selectedrvColor));

            //t.satirCard.setCardBackgroundColor(R.color.black);


        });

        t.buttonIncele.setOnClickListener(view -> {
            AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(yemek);
            Navigation.findNavController(view).navigate(gecis);
        });
    }

    @Override
    public int getItemCount() {
        return yemeklerListesi.size();
    }


}
