package com.CARCx00015319;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<herramientasMinecraft> Mochila = new ArrayList<>();
        System.out.println("----MINECALV MOCHILA----");
        boolean on = true;

        do{

            switch (Menu()){
                case 1:
                    System.out.println("\nAGREGANDO HERRAMIENTA...");
                    int Tipo= KITTipo();
                    int Ataque= KITAtaque(Tipo);
                    int Material = KITMaterial();
                    boolean Encantado = AEncantado();
                    int Usos = KITUsoss(Material, Encantado);

                    Mochila.add(new herramientasMinecraft(Tipo, Material, Usos, Ataque, Encantado));

                    break;
                case 2:
                    System.out.println("\nMOSTRANDO MOCHILA...");
                    Mochila.forEach(s-> System.out.println(s.toString()));
                    break;
                case 3:
                    System.out.println("\nMOSTRANDO HERRAMIENTAS...");
                    int aux= Searchtipo();
                    System.out.println("EN SU MOCHILA ESTAN: ");
                    int arr=0, a=0;
                    for(int i=0; i< Mochila.size(); i++){
                        a= Mochila.get(i).Material;
                        if(a== aux) {
                            System.out.println(Mochila.get(i).toString());
                            arr++;
                        }
                    }
                    System.out.println("");
                    System.out.println("POSSEE :"+ arr);
                    break;
                case 4:

                    System.out.println("\nA ENCANTAR...");
                    Mochila.forEach(herramientasMinecraft::HerrEncantada);
                    System.out.println("encantadas!!! ");
                    break;
                case 5:
                    System.out.println("\nA REPARAR...");
                    Mochila.forEach(herramientasMinecraft::RepararHerr);
                    System.out.println("reparadas!!! ");
                    break;
                case 6:
                    on = false;
                    break;
                default:
                    System.out.println(" INTENTELO DE NUEVO!!!");
            }

        }while(on);



    }

    public static int Menu(){
        Scanner scan = new Scanner(System.in);
        int x=0;
        System.out.println("\n");
        System.out.println("    MENU PRINCIPAL:");
        System.out.println("1- Agregar Herramientas a Mochila.");
        System.out.println("2- Mostrar Mochila.");
        System.out.println("3- Consultar herramientas de un tipo (HACHA, PALA, ESPADA, PICO, HOZ)");
        System.out.println("4- Encantar Herramienta (Aumenta Ataque en 7)");
        System.out.println("5- Reparar Herramienta (Recupera total de vida)");
        System.out.println("6- Exit...");
        System.out.print("Su opcion es: ");
        x= scan.nextInt(); scan.nextLine();
        return x;
    }

    public static int KITTipo(){
        Scanner scan = new Scanner(System.in);
        int Tipo=0;

        System.out.println("Herramienta? \n1- Hoz\n2- Pala\n3- Pico\n4-Hacha\n5-Espada");
        System.out.print("Tipo: ");Tipo=scan.nextInt();scan.nextLine();

        return Tipo;

    }

    public static int KITAtaque(int Tipo){
        int damage =0;
        switch (Tipo){
            case 1:
                damage= 5;
                break;
            case 2:
                damage = 10;
                break;
            case 3:
                damage= 15;
                break;
            case 4:
                damage= 20;
                break;
            case 5:
                damage= 25;
                break;
        }
        return damage;
    }

    public static int KITMaterial(){
        Scanner scan = new Scanner(System.in);
        int Material =0;

        System.out.println("De que esta hecha? \n1- Madera\n2- Piedra\n3- Hierro\n4-Oro\n5-Diamante");
        System.out.print("Material: ");Material=scan.nextInt();scan.nextLine();
        return Material;

    }

    public static int KITUsoss(int Material, boolean enchant){
        int Usoss =0;
        switch (Material){
            case 1:
                Usoss= 150;
                break;
            case 2:
                Usoss = 250;
                break;
            case 3:
                Usoss= 350;
                break;
            case 4:
                Usoss= 450;
                break;
            case 5:
                Usoss= 550;
                break;
        }

        if(enchant){
            return Usoss+=50;
        }
        else{
            return Usoss;
        }
    }

    public static boolean AEncantado(){
        Scanner scan = new Scanner(System.in);
        boolean Encantado = false; int aux=0;

        System.out.print("Esta encantada? (1 = true | 2 = false): " );
        aux=scan.nextInt();scan.nextLine();
        if(aux==1){
            Encantado=true;
        }

        return Encantado;
    }

    public static int Searchtipo(){
        Scanner scan = new Scanner(System.in);
        int Tipo=0;
        System.out.println("tipo de herramienta: \n1- Hoz\n2- Pala\n3- Pico\n4-Hacha\n5-Espada");
        System.out.print("Tipo: ");Tipo=scan.nextInt();scan.nextLine();

        return Tipo;
    }
}

