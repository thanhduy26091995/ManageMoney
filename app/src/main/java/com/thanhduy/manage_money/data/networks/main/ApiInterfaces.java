package com.thanhduy.manage_money.data.networks.main;

import com.thanhduy.manage_money.data.models.Home;
import com.thanhduy.manage_money.data.responses.BaseResponseObject;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by buivu on 20/09/2017.
 */

public interface ApiInterfaces {
    @GET("api/home")
    Call<BaseResponseObject<Home>> getHome();
}
