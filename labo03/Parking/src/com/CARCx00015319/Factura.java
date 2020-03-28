package com.CARCx00015319;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private Tiempo tiempo;
    private Auto automovil;

    public Factura(String placa){
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
        Date entrada = null;
        boolean inOkay = false;

        do {
            String ingreso = JOptionPane.showInputDialog("ENCARGADO:\nIngrese Hora de entrada (Formato HH:mm): ");
            try {
                entrada = hora.parse(ingreso);
                inOkay = true;
            } catch (ParseException e) {
                System.out.println("Hora mal formateada");
                JOptionPane.showMessageDialog(null, "Hora Mal Formateada!\nIntentelo de nuevo.");
            }
        }while(!inOkay);

        System.out.println("Su hora de ingreso es: ");
        System.out.print(entrada);

        this.tiempo = new Tiempo(entrada);
        this.automovil = new Auto(placa);
    }

    public void estado(){
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
        Date entrada = tiempo.getEntrada();
        JOptionPane.showMessageDialog(null, "Hora de Ingreso: "+ hora.format(entrada) + "\nCon placa: "+ automovil.getPlaca());
    }

    public double getPago(){
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
        Date salida = null;
        float tTotal=0;
        double total =0;
        boolean hrOkay = false;

        do{
            String s = JOptionPane.showInputDialog(null, "Ingrese la hora actual (formato 'HH:mm'): ");
            try{
                salida = hora.parse(s);
                hrOkay = true;

            }catch (ParseException e){
                System.out.println("\nHora mal formateada");
                JOptionPane.showMessageDialog(null, "FORMATO INVALIDO, INTENTELO DE NUEVO");

            }
            if(hrOkay) {
                do {
                    tTotal = tiempo.getTSalida(salida);
                    if(tTotal==-1){
                        s = JOptionPane.showInputDialog(null, "Ingrese la hora actual (formato 'HH:mm'): ");
                        try{
                            salida = hora.parse(s);
                            hrOkay = true;

                        }catch (ParseException e) {
                            System.out.println("\nHora mal formateada");
                            JOptionPane.showMessageDialog(null, "FORMATO INVALIDO, INTENTELO DE NUEVO");
                        }
                    }
                }while (tTotal == -1);
            }

        } while(!hrOkay);

        total = tTotal;
        total = total * 0.0000002778;

        return total;

    }

    public String getPlaca(){
        return automovil.getPlaca();
    }


}