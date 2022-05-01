package com.example.workmanagerkullanimi.worker;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorker extends Worker {
    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        int toplam = 10 + 20;
        Log.e("Arkaplan İşlemi Sonucu", String.valueOf(toplam));
        return Result.success();
    }
}
