package com.yetsdmr.retrofitjava.service;

import com.yetsdmr.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET, POST, UPDATE, DELETE

    @GET("prices?key=2187154b76945f2373394aa34f7dc98a")
    Observable<List<CryptoModel>> getData();

    //Call<List<CryptoModel>> getData();
}
