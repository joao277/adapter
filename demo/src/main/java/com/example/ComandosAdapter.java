package com.example;

public class ComandosAdapter extends ComandosTeclado {

    private iComandos comandosControle;

    public ComandosAdapter(iComandos comandosControle){
        this.comandosControle = comandosControle;
    }

    public String getMappedComandos(){
        String output = "COMANDOS: ";
        for(String comando: this.getComandos()){
            if(comando.equals("W")){
                output += "- UP";
            } else if (comando.equals("A")){
                output += "- LEFT";
            }else if (comando.equals("D")){
                output += "- RIGHT";
            } else {
                output += "- DOWN";
            }
        }
        return output;
    }


    public void mapComandos(){
        for(String comando: this.comandosControle.getComandos()){
            if(comando.equals("UP")){
                this.setComandos("W");
            } else if (comando.equals("LEFT")){
                this.setComandos("A");
            }else if (comando.equals("RIGHT")){
                this.setComandos("D");
            } else {
                this.setComandos("S");
            }
        }
    }
}