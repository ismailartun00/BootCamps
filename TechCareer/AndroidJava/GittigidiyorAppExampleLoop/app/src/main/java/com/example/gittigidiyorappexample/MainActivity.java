package com.example.gittigidiyorappexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleColorOfStatusBarIcons();

    }

    public void toggleColorOfStatusBarIcons(){
        if(Build.VERSION.SDK_INT >= 23){
            View decor = (MainActivity.this).getWindow().getDecorView();
            if(decor.getSystemUiVisibility() != View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR)
                decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            else
                decor.setSystemUiVisibility(0);
        }
    }
}