package com.CARCx00015319;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        String palabra;
        System.out.print("Ingrese una frase: ");
        palabra=usuario.nextLine();
        String str1 = palabra.replace('a','b');
        System.out.println(str1);


    }
}
