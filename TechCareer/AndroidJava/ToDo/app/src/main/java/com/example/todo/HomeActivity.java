package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.os.Bundle;

import com.example.todo.databinding.ActivityHomeBinding;
import com.example.todo.worker.MyWorkerNotification;

import java.util.concurrent.TimeUnit;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Worker();
    }

    public void Worker() {
        WorkRequest request = new PeriodicWorkRequest
                .Builder(MyWorkerNotification.class, 2, TimeUnit.HOURS)
                .setInitialDelay(10, TimeUnit.SECONDS)
                .build();

        WorkManager.getInstance(this).enqueue(request);
    }
}