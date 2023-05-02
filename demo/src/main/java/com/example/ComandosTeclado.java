package com.example;

import java.util.ArrayList;
import java.util.List;

public class ComandosTeclado implements iComandos {
    private List<String> comandos = new ArrayList<String>();

    @Override
    public List<String> getComandos() {
        return comandos;
    }

    public void setComandos(String comandos) {
        this.comandos.add(comandos);
    }
}