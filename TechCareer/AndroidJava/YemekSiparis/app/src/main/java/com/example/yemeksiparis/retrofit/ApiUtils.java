package com.example.yemeksiparis.retrofit;

public class ApiUtils {
    public static final String BASE_URL = "http://kasimadalan.pe.hu/";
    public static final String SEPET_URL = "http://kasimadalan.pe.hu/yemekler/resimler/";

    public static YemeklerDaoInterface getYemeklerDaoInterface(){
        return RetrofitClient.getClient(BASE_URL).create(YemeklerDaoInterface.class);
    }
}
