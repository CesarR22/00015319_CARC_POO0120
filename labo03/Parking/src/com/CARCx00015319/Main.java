package com.CARCx00015319;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Factura> Facturas = new ArrayList<>();
        double montoTotal=0;

        boolean on = true;
        do{
            switch (printMenu()){
                case 1:
                    String placa = JOptionPane.showInputDialog("ADD PLaca de su vehivulo: ");
                    Facturas.add(new Factura(placa));
                    JOptionPane.showMessageDialog(null, "Pase Adelante...");
                    break;

                case 2:
                    int pos=0;
                    boolean placaOkay= false;
                    do{
                        String plate = JOptionPane.showInputDialog("ADD placa de su Vehiculo: ");
                        for (int i = 0; i < Facturas.size(); i++) {
                            if (Facturas.get(i).getPlaca().equals(plate)) {
                                pos = i;
                                placaOkay = true;
                            }
                        }
                        if(!placaOkay) {JOptionPane.showMessageDialog(null, "PLACA NO ENCONTRADA\nINTENTE NUEVAMENTE");}

                    }while(!placaOkay);
                    double hrs = Facturas.get(pos).getPago();
                    double monto = montoPago(hrs);
                    inputPago(monto);
                    Facturas.remove(pos);

                    montoTotal += monto;
                    break;
                case 3:
                    int p=0;
                    boolean plateOkay= false;
                    do{
                        String plate = JOptionPane.showInputDialog("ADD placa de su Vehiculo: ");
                        for (int i = 0; i < Facturas.size(); i++) {
                            if (Facturas.get(i).getPlaca().equals(plate)) {
                                p = i;
                                plateOkay = true;
                            }
                        }
                        if(!plateOkay) {JOptionPane.showMessageDialog(null, "PLACA NO ENCONTRADA\nINTENTE NUEVAMENTE");}

                    }while(!plateOkay);
                    Facturas.get(p).estado();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "El monto del Parqueo es de:\n$"+ montoTotal);
                    on = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCION INVALIDA, INTENTE NUEVAMENTE!");
            }


        }while (on);

    }

    public static int printMenu(){
        int x=0;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "BIENVENIDO AL PARQUEO\nIngrese la opcion deseada\n1- Ingresar al Parqueo" +
                "\n2- Salir del Parqueo\n3- Consultar Factura\n4- SALIR"));
        return x;
    }

    public static double montoPago(double hrs){
        double monto=0;
        if(hrs <0.5){
            monto = 0.00;
        }
        else if(hrs < 1){
            monto = 0.50;
        }
        else if(hrs < 2){
            monto = 1.00;
        }
        else if(hrs > 2){
            monto = 5.00;
        }
        return monto;
    }

    public static void inputPago(double monto){
        boolean sumOkay = false;


        do{
            int centavo=0;
            int cinco =0;
            int diez=0;
            int cora =0;
            int dolar=0;
            boolean ingresando = true;

            do{

                int x = Integer.parseInt(JOptionPane.showInputDialog(null, " MONTO A PAGAR : $"+ monto +" \nMONEDA A INGRESAR:"+
                        "\n1- Centavo\n2- Cinco Centavos\n3- Diez Centavos\n4- Veinticinco Centavos\n5- Dolar\n6- LISTO"));
                switch (x){
                    case 1:
                        centavo++;
                        break;
                    case 2:
                        cinco++;
                        break;
                    case 3:
                        diez++;
                        break;
                    case 4:
                        cora++;
                        break;
                    case 5:
                        dolar++;
                        break;
                    case 6:
                        ingresando = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "NUMERO INVALIDO, INTENTE NUEVAMENTE!");
                }

            }while(ingresando);
            Moneda monedas = new Moneda(centavo, cinco, diez, cora, dolar);
            double insertando= monedas.getSum();
            if(insertando < monto){
                JOptionPane.showMessageDialog(null, "MONTO INSUFICIENTE, INGRESE DE NUEVO SUS MONEDAS!\nMONTO INGRESADO: $"+ insertando);
            }
            else if(insertando >= monto){
                double vuelto = (insertando - monto);
                JOptionPane.showMessageDialog(null, "Su cambio es : $"+ vuelto+ ". \nMANEJE CON CUIDADO!");
                sumOkay = true;
            }
        }while(!sumOkay);

    }
}