package com.example.maps.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiCall {
    @GET("json?")
    Call<ModelApi> getData(@Query("lat") double lat, @Query("lng") double lng);



}
