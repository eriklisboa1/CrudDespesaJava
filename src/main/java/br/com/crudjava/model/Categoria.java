package br.com.crudjava.model;

public enum Categoria {
    ALIMENTACAO("alimentacao"),
    EDUCACAO("educacao"),
    SAUDE("saude"),
    TRANSPORTE("transporte"),
    MORADIA("moradia"),
    INVESTIMENTO("investimento"),
    OUTROS("outros");


    private String categoria;

    Categoria(String categoria) {
    this.categoria = categoria;
    }

    public String getCategoria(){
    return categoria;
    }
}

