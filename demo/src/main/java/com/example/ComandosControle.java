package com.example;


import java.util.ArrayList;
import java.util.List;

public class ComandosControle implements iComandos{

    private List<String> comandos = new ArrayList<String>();

    @Override
    public List<String> getComandos() {
        return this.comandos;
    }

    @Override
    public void setComandos(String comando) {
        this.comandos.add(comando);
    }
}