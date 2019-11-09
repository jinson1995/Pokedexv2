package com.example.lenovo.pokedexv2.Models;

public class Pokemon {
    private int numero;
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumero() {
        return numero;
    }

    public int setNumero(int numero) {
        String[] urlpartes = url.split("/");
        return Integer.parseInt(urlpartes[urlpartes.length -1]);
    }
}
