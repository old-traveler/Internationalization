package com.hyc;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface Api {

    @GET("api")
    Call<Result> loadResult(@QueryMap Map<String, String> params);

}
