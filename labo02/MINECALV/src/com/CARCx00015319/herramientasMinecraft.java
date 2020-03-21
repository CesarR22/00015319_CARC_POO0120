package com.CARCx00015319;

public class herramientasMinecraft {
    public int Tipo;
    public int Material;
    public int Usos;
    public int Ataque;
    public boolean Encantado;

    public herramientasMinecraft(int Tipo, int Material, int Usos, int Ataque, boolean Encantado){
        this.Tipo = Tipo;
        this.Material = Material;
        this.Usos = Usos;
        this.Ataque = Ataque;
        this.Encantado=Encantado;
    }

    public void HerrEncantada(){
        if(!Encantado) {
            Ataque += 7;
            Encantado = true;
        }
    }

    public void RepararHerr(){
        Usos+=50;

    }
    public String toString() {
        return "Herramienta: " + "[Tipo=" + Tipo + ", Material= "+ Material+", usos= " +Usos+ ", Ataque= "+ Ataque+ ", Encantado= "+ Encantado+"]";
    }

}
