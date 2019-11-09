package com.example.lenovo.pokedexv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.lenovo.pokedexv2.Models.PokemonDetalle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PokemonDetalleActivity extends AppCompatActivity {
    TextView tvNombre;
    TextView tvBase;
    TextView tvAlto;
    TextView tvPeso;
    TextView tvTipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_detalle);

        tvNombre=findViewById(R.id.tvNombre);
        tvBase=findViewById(R.id.tvBase);
        tvAlto=findViewById(R.id.tvAlto);
        tvPeso=findViewById(R.id.tvPeso);
        tvTipo=findViewById(R.id.tvTipo);

        Retrofit retrofit=new PokemonAdapter().getAdapter();
        PokemonApi pokemonApi=retrofit.create(PokemonApi.class);

        Call<PokemonDetalle> pokemonDetalleCall=pokemonApi.getPokemonDetalle("venusaur");

        pokemonDetalleCall.enqueue(new Callback<PokemonDetalle>() {
            @Override
            public void onResponse(Call<PokemonDetalle> call, Response<PokemonDetalle> response) {
                tvNombre.setText("Nombre: "+response.body().getName());
                tvBase.setText("Base: "+response.body().getBase_experience());
                tvAlto.setText("Alto: "+response.body().getHeight());
                tvPeso.setText("Peso: "+response.body().getWeight());
                tvTipo.setText("Tipo: "+response.body().getType());
            }

            @Override
            public void onFailure(Call<PokemonDetalle> call, Throwable t) {

            }
        });
    }
}
