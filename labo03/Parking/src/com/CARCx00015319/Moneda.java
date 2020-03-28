package com.CARCx00015319;

public class Moneda {
    private int uCentavo;
    private int uCinco;
    private int uDiez;
    private int uCora;
    private int uDolar;

    public Moneda(int uCentavo, int uCinco, int uDiez, int uCora, int uDolar){
        this.uCentavo = uCentavo;
        this.uCinco = uCinco;
        this.uCora = uCora;
        this.uDiez = uDiez;
        this.uDolar= uDolar;
    }

    public double getSum(){

        return (uCentavo*0.010 + uCinco*0.050 + uDiez*0.10 + uCora*0.250 + uDolar*1.00);

    }

    public int getuCentavo(){
        return uCentavo;
    }

    public int getuCora() {
        return uCora;
    }

    public int getuCinco() {
        return uCinco;
    }

    public int getuDiez() {
        return uDiez;
    }

    public int getuDolar() {
        return uDolar;
    }
}