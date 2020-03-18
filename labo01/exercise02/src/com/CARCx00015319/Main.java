package com.CARCx00015319;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Ingrese una palabra: ");
        Scanner palabra = new Scanner(System.in);
        String frase="";
        frase= palabra.nextLine();

        int ini =0;
        int fin = frase.length()-1;
        boolean Error = false;

        while((ini<fin) && (!Error)){

            if(frase.charAt(ini)==frase.charAt(fin)){

                ini++;
                fin --;
            }
            else{
                Error = true;
            }
            if(!Error)
                System.out.println(frase + " si es Palindrome");

            else {
                System.out.println(frase + " no es Palindrome");
            }

        }
    }
}
