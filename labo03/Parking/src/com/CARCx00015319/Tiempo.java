package com.CARCx00015319;

import javax.swing.*;
import java.util.Date;

public class Tiempo {

    private Date entrada;

    public Tiempo(Date entrada){
        this.entrada = entrada;
    }

    public float getTSalida(Date salida){
        long e = entrada.getTime();
        long s = salida.getTime();

        if(entrada.after(salida)){
            JOptionPane.showMessageDialog(null, "HORA INVALIDA; Ingerese la hora correcta!");
            return -1;
        }

        return s-e;

    }

    public Date getEntrada() {
        return entrada;
    }

}