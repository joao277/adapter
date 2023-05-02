package com.example;

public class Input {
    iComandos comandos;
    ComandosAdapter comandosAdapter;

    public Input(){
        comandos = new ComandosControle();
        comandosAdapter = new ComandosAdapter(comandos);
    }

    public void setComandos(String comando){
        comandos.setComandos(comando);
        comandosAdapter.mapComandos();
    }

    public String getComandos(){
       return  comandosAdapter.getMappedComandos();
    }

    public String getComandosControle(){
        String output = "Controle:";
        for(String comando: comandosAdapter.getComandos()){
            output = output +  " - " + comando;
        }
        return output;
    }
}