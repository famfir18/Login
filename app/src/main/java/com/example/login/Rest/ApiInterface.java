package com.example.login.Rest;

import com.example.login.Model.Data;
import com.example.login.Model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("login/{email}/{password}")
    Call<Result> login(@Path("email") String email, @Path("password") String password);

}