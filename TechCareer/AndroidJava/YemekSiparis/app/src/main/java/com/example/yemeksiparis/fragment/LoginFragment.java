package com.example.yemeksiparis.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.yemeksiparis.R;
import com.example.yemeksiparis.databinding.FragmentLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginFragment extends Fragment {
    private FragmentLoginBinding tasarim;
    private FirebaseAuth auth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
        tasarim.setLoginFragment(this);
        auth = FirebaseAuth.getInstance();

        tasarim.toolbarLogin.setTitle("Giriş Yap");

        return tasarim.getRoot();
    }

    public void loginUser(String email, String password){
        if (TextUtils.isEmpty(email)){
            Toast.makeText(requireContext(), "Email Alanı Boş Olamaz", Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(password)){
            Toast.makeText(requireContext(), "Şifre Alanı Boş Olamaz", Toast.LENGTH_LONG).show();
        }else{
            tasarim.btnLogin.setEnabled(false);

            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(requireContext(), "Giriş Başarılı !", Toast.LENGTH_LONG).show();
                        Navigation.findNavController(requireView()).navigate(R.id.anasayfaGecis);

                    }else{
                        Toast.makeText(requireContext(), "Giriş Başarısız !", Toast.LENGTH_LONG).show();
                        tasarim.btnLogin.setEnabled(true);
                    }
                }
            });
        }
    }

    public void goToRegisterFragment() {
        Navigation.findNavController(requireView()).navigate(R.id.registerGecisLogin);
    }
}