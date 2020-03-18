package com.CARCx00015319;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int numero,fibo1,fibo2;

        do {
            System.out.println("Ingrese la cantidad de cifras que desea: ");
            numero = num.nextInt();
        }while (numero <= 1);

        System.out.println("Los" + numero + "primeros terminos de la serie de fibonacci son: ");

        fibo1=1;
        fibo2=1;

        System.out.println(fibo1 + " ");
        for(int i=2; i<=numero; i++){
            System.out.println(fibo2 + " ");
            fibo2= fibo1 + fibo2;
            fibo1= fibo2 - fibo1;
        }
        System.out.println();

    }
}