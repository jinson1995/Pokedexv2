package com.example.lenovo.pokedexv2;

import com.example.lenovo.pokedexv2.Models.PokemonDetalle;
import com.example.lenovo.pokedexv2.Models.Pokemons;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokemonApi {
    //get pokemon
    @GET("pokemon")
    Call<Pokemons> getDataPokemons();

    //get
    @GET("pokemon/{nombre}")
    Call<PokemonDetalle> getPokemonDetalle(@Path("nombre") String nombre);



}
