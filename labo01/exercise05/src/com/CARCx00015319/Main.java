package com.CARCx00015319;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner letra = new Scanner(System.in);


        System.out.println("Digite una palabra: ");
        String cadenaC = letra.nextLine();

        System.out.println("La palabra sin modificar es: " +cadenaC);

        String cadenaNueva = cadenaC.replaceAll("[b,c,d,f,g,h,j,k,l,m,n,ñ,p,q,r,s,t,v,w,x,y,z,B,C,D,F,G,H,J,K,L,M,N,Ñ,P,Q,R,S,T,V,W,X,Y,Z ]", "");

        ArrayList<String> listaVocales = new ArrayList<>();

        listaVocales.add(cadenaNueva);
        System.out.println("La cadena sin consonantes es: "+listaVocales);
    }
}