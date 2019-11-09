package com.example.lenovo.pokedexv2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokemonAdapter {
    Retrofit retrofit;

    public Retrofit getAdapter() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https:/pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }
}
