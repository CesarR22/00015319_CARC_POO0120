package com.CARCx00015319;

import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        int num;
        sc = new Scanner(System.in);
        System.out.print("Introduce un número para invertir: ");
        num = sc.nextInt();
        sc.close();
        System.out.printf("%nEl número %d%s", num, invertirNumeroString(num));
        int numCifras = String.valueOf(num).length();

    }

    private static int invertirNumero(int num, int pos){
        if(num<10){
            return num;
        } else {
            return num%10 * (int)Math.pow(10, pos) + invertirNumero(num/10, pos-1);
        }
    }

    private static String invertirNumeroString(int num) {
        if(num<10){
            return String.valueOf(num);
        } else {
            return String.valueOf(num%10) + invertirNumeroString(num/10);
        }
    }
}