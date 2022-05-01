package com.example.workmanagerkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.os.Bundle;
import android.util.Log;

import com.example.workmanagerkullanimi.databinding.ActivityMainBinding;
import com.example.workmanagerkullanimi.worker.MyWorker;
import com.example.workmanagerkullanimi.worker.MyWorkerNotification;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        tasarim.buttonYap.setOnClickListener(view -> {
            /*Constraints calismaKosulu = new Constraints.Builder()
                    .setRequiredNetworkType(NetworkType.CONNECTED)
                    .build();

            WorkRequest istek = new OneTimeWorkRequest.Builder(MyWorker.class)
                    .setInitialDelay(10, TimeUnit.SECONDS)
                    .setConstraints(calismaKosulu)
                    .build();

            WorkManager.getInstance(this).enqueue(istek);

            WorkManager.getInstance(this).getWorkInfoByIdLiveData(istek.getId())
                    .observe(this, workInfo -> {
                        String durum = workInfo.getState().name();
                        Log.e("Arkaplan İşlem Durumu", durum);
                    });*/
            Constraints calismaKosulu = new Constraints.Builder()
                    .setRequiredNetworkType(NetworkType.CONNECTED)
                    .build();

            WorkRequest request = new PeriodicWorkRequest
                    .Builder(MyWorkerNotification.class, 15, TimeUnit.MINUTES)
                    .setInitialDelay(10, TimeUnit.SECONDS)
                    .setConstraints(calismaKosulu)
                    .build();

            WorkManager.getInstance(this).enqueue(request);

        });
    }
}