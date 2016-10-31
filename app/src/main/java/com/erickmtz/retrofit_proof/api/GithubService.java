package com.erickmtz.retrofit_proof.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by erick on 31/10/16.
 */
public interface GithubService {
    @GET("users/{user}/repos")
    Call<List<Repository>> listRepo (@Path("user") String user);
}
