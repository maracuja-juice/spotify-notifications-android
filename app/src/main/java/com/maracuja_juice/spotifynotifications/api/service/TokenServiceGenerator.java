package com.maracuja_juice.spotifynotifications.api.service;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class TokenServiceGenerator {

    private static final String BASE_URL = "https://refresh-token-spotify.herokuapp.com/api/";

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(
                            JacksonConverterFactory.create()
                    );

    private static Retrofit retrofit = builder.build();

    private static OkHttpClient.Builder httpClient =
            new OkHttpClient.Builder();

    public static TokenClient createService() {
        return retrofit.create(TokenClient.class);
    }
}