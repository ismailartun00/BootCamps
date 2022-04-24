package com.example.detaylirecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.detaylirecyclerview.R;
import com.example.detaylirecyclerview.entity.Filmler;
import com.example.detaylirecyclerview.databinding.CardTasarimBinding;
import com.example.detaylirecyclerview.fragment.AnasayfaFragmentDirections;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class FilmlerAdapter extends RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu> {
        private Context mContext;
        private List<Filmler> filmlerListesi;

        public FilmlerAdapter(Context mContext, List<Filmler> filmlerListesi) {
            this.mContext = mContext;
            this.filmlerListesi = filmlerListesi;
        }

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
            CardTasarimBinding tasarim = CardTasarimBinding.inflate(layoutInflater,parent,false);
            return new CardTasarimTutucu(tasarim);
        }

        @Override
        public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
            Filmler film = filmlerListesi.get(position);
            CardTasarimBinding t = holder.tasarim;

            t.imageViewFilmResim.setImageResource(
                    mContext.getResources().getIdentifier(film.getFilmResimAdi(),"drawable",mContext.getPackageName()));

            t.textViewFilmAdi.setText(film.getFilmAdi());
            t.textViewFilmFiyat.setText(film.getFilmFiyat()+" ₺");
            t.buttonSepeteEkle.setOnClickListener(view -> {
                Snackbar.make(view,film.getFilmAdi()+" sepete eklendi",Snackbar.LENGTH_SHORT).show();
            });

            t.imageViewDahaFazla.setOnClickListener(view -> {
                PopupMenu popup = new PopupMenu(mContext, view);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
                popup.show();
                popup.setOnMenuItemClickListener(menuItem -> {
                    switch (menuItem.getItemId()){
                        case R.id.action_haber_ver:
                            Snackbar.make(view, film.getFilmAdi() + " haberdar edilmek için eklendi", Snackbar.LENGTH_SHORT).show();
                            return true;
                        case R.id.action_favorilere_ekle:
                            Snackbar.make(view, film.getFilmAdi() + " favorilere eklendi", Snackbar.LENGTH_SHORT).show();
                            return true;
                        default:
                            return false;
                    }
                });
            });

            t.cardViewFilm.setOnClickListener(view -> {
                AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(film);
                Navigation.findNavController(view).navigate(gecis);
            });
        }

        @Override
        public int getItemCount() {
            return filmlerListesi.size();
        }
    }
