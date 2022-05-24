package com.example.yemeksiparis.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.yemeksiparis.R;
import com.example.yemeksiparis.databinding.FragmentRegisterBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterFragment extends Fragment {
    private FragmentRegisterBinding tasarim;
    private FirebaseAuth auth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        auth = FirebaseAuth.getInstance();
        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_register, container, false);
        tasarim.setRegisterFragment(this);

        tasarim.toolbarRegister.setTitle("Hesap Oluştur");

        return tasarim.getRoot();
    }

    public void createNewAccount(String email, String password, String username) {
        if (TextUtils.isEmpty(email)){
            Toast.makeText(requireContext(), "Email Alanı Boş Olamaz !", Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(password)){
            Toast.makeText(requireContext(), "Şifre Alanı Boş Olamaz !", Toast.LENGTH_LONG).show();
        }else{
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(requireContext(), "Hesabınız Başarılı Bir Şekilde Oluşturuldu", Toast.LENGTH_LONG).show();
                        Navigation.findNavController(requireView()).navigate(R.id.loginGecisRegister);
                    }else{
                        Toast.makeText(requireContext(), "Bir Hata Oluştu !!", Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
    }

    public void goToLoginFragment() {
        Navigation.findNavController(requireView()).navigate(R.id.loginGecisRegister);
    }
}