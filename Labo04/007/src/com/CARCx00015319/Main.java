package com.CARCx00015319;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        ArrayList<Item> PersonalItems = new ArrayList<>();
        ArrayList<Item> CommonItems = new ArrayList<>();


        JOptionPane.showMessageDialog(null, "->MENU DE ITEMS<-");


        boolean opc = true;

        do {

            switch (menu()) {


                case 1:

                    int type = 0;

                    JOptionPane.showMessageDialog(null, "Ingresando Item");
                    type = Integer.parseInt(JOptionPane.showInputDialog("Que tipo de item es? \n1 -Potion \n2 -Elixir \n3 -Ammo\n4 -Weapon\n"));


                    if (type == 1) {

                        String namePotion = nombreItem();
                        int weightPotion = pesoItem();
                        String descPotion = descripcionItem();
                        int reuTimePotion = reusarItem();
                        String levelPotion = nivelItem();
                        String typePotion = typeItem();
                        int amountPotion = cantItem();

                        PersonalItems.add(new Potion(namePotion, weightPotion, descPotion, reuTimePotion, levelPotion, typePotion, amountPotion));
                    }


                    if (type == 2) {
                        String nameElixir = nombreItem();
                        int weightElixir = pesoItem();
                        String descElixir = descripcionItem();
                        int reuTimeElixir = reusarItem();
                        String levelElixir = nivelItem();
                        String typeElixir = typeItem();
                        int amountElixir = cantItem();
                        int timeElixir = timeItem();

                        PersonalItems.add(new Elixir(nameElixir, weightElixir, descElixir, reuTimeElixir, levelElixir, typeElixir, amountElixir, timeElixir));

                    }


                    if (type == 3) {
                        String nameAmmo = nombreItem();
                        int weightAmmo = pesoItem();
                        String descAmmo = descripcionItem();
                        int usosAmmo = remainingUsesItem();
                        boolean equiparAmmo = equiparItem();

                        PersonalItems.add(new Ammo(nameAmmo, weightAmmo, descAmmo, usosAmmo, equiparAmmo));

                    }


                    if (type == 4) {
                        String nameWeapon = nombreItem();
                        int weightWeapon = pesoItem();
                        String descWeapon = descripcionItem();
                        int usosWeapon = remainingUsesItem();
                        String typeWeapon = typeItem();
                        double speedWeapon = rapidezItem();
                        double damageWeapon = dañoItem();
                        String wieldWeapon = empuñaduraItem();
                        String levelWeapon = nivelItem();

                        PersonalItems.add(new Weapon (nameWeapon, weightWeapon, descWeapon, usosWeapon, typeWeapon, speedWeapon, damageWeapon, wieldWeapon,levelWeapon));


                    }


                    break;


                case 2:

                    int searchId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de lo que desea buscar"));

                    PersonalItems.forEach(obj -> {
                        if (obj.getId() == searchId) {
                            CommonItems.add(obj);

                        }

                    });

                    break;


                case 3:

                    char op;

                    op = JOptionPane.showInputDialog(" Que listas desea buscar?\na)personalItems.\nb)CommonItems.").charAt(0);

                    if (op == 'a') {


                        int i = Integer.parseInt(JOptionPane.showInputDialog("ID que desea buscar: "));

                        PersonalItems.forEach(obj -> {
                            if (obj.getId() == i);


                        });


                    }

                    if (op == 'b') {

                        int j = Integer.parseInt(JOptionPane.showInputDialog(" ID que desea buscar"));

                        PersonalItems.forEach(obj -> {
                            if (obj.getId() == j);
                        });
                    }

                    break;


                case 4:

                    char x;

                    x = JOptionPane.showInputDialog("Que listas desea buscar?\na)personalItems.\nb)CommonItems.").charAt(0);

                    if (x == 'a') {

                        String item = JOptionPane.showInputDialog(" nombre del item a Buscar: ");

                        PersonalItems.forEach(t -> {
                            if (item.equalsIgnoreCase("Potion")){
                                if (t instanceof Potion);
                            }

                            if (item.equalsIgnoreCase("Elixir")){
                                if (t instanceof Elixir);
                            }

                            if (item.equalsIgnoreCase("Ammo")){
                                if (t instanceof Ammo);
                            }

                            if (item.equalsIgnoreCase("Weapon")){
                                if (t instanceof Weapon);
                            }


                        });
                    }


                    if (x == 'b') {


                        String item2 = JOptionPane.showInputDialog(" nombre del item a Buscar: ");

                        PersonalItems.forEach(g -> {
                            if (item2.equalsIgnoreCase("Potion")){
                                if (g instanceof Potion);
                            }


                            if (item2.equalsIgnoreCase("Elixir")) {
                                if (g instanceof Elixir) ;
                            }


                            if (item2.equalsIgnoreCase("Ammo")){
                                if (g instanceof Ammo);
                            }


                            if (item2.equalsIgnoreCase("Weapon")){
                                if (g instanceof Weapon);
                            }


                        });
                    }
                    break;


                case 5:

                    char d;

                    d = JOptionPane.showInputDialog("Que listas desea buscar?\na)personalItems.\nb)CommonItems.").charAt(0);

                    if (d == 'a') {

                        int idBuscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite ID  que desea eliminar: "));

                        PersonalItems.removeIf(r -> (r.getId() == idBuscar));

                    }


                    if (d == 'b') {

                        int idBuscar2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite ID que desea eliminar: "));

                        CommonItems.removeIf(w -> (w.getId() == idBuscar2));

                    }


                    break;


                case 6:

                    char h;

                    h = JOptionPane.showInputDialog("Que listas desea buscar?\na)personalItems.\nb)CommonItems.").charAt(0);

                    if (h == 'a') {

                        String item2 = JOptionPane.showInputDialog("Ingrese el nombre del Tipo a eliminar: ");

                        PersonalItems.removeIf(o -> {
                            if (item2.equalsIgnoreCase("Potion")) {
                                if (o instanceof Potion);

                            }
                            if (item2.equalsIgnoreCase("Elixir")) {
                                if (o instanceof Elixir);
                            }

                            if (item2.equalsIgnoreCase("Ammo")) {
                                if (o instanceof Ammo);
                            }
                            if (item2.equalsIgnoreCase("Weapon")) {
                                if (o instanceof Weapon);
                            }

                            return true;
                        });

                    }



                    if (h == 'b') {

                        String item3 = JOptionPane.showInputDialog("nombre del Tipo a eliminar: ");

                        PersonalItems.removeIf(p -> {
                            if (item3.equalsIgnoreCase("Potion")){
                                if (p instanceof Potion);
                            }

                            if (item3.equalsIgnoreCase("Elixir")){
                                if (p instanceof Elixir);
                            }


                            if (item3.equalsIgnoreCase("Ammo")){
                                if (p instanceof Ammo);
                            }


                            if (item3.equalsIgnoreCase("Weapon")){
                                if (p instanceof Weapon);
                            }


                            return true;
                        });


                    }


                    break;



                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida, digite otra opcion");

            }


        } while (opc);
    }




    public static int menu() {
        int x = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "BIENVENIDO AL ARSENAL\nIngrese el numero de la opcion que desea realizar.\n1-Agregar Item." +
                "\n2-Compartir Item.\n3-Buscar Item por ID.\n4-Buscar Item por Tipo\n5-Borrar Item por ID.\n6-Borrar Item por Tipo.<" ));
        return x;
    }


    public static String nombreItem() {

        String p = JOptionPane.showInputDialog("Ingrese el nombre del Item .");

        return p;

    }


    public static int pesoItem() {

        int p = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del Item."));

        return p;

    }


    public static String descripcionItem() {

        String d = JOptionPane.showInputDialog("Ingrese la descripcion del Item.");

        return d;
    }


    public static int reusarItem() {

        int r = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de reutilizacion del Item."));

        return r;

    }


    public static String nivelItem() {

        String l = JOptionPane.showInputDialog("Ingrese el nivel del Item.");

        return l;

    }


    public static String typeItem() {

        String t = JOptionPane.showInputDialog("Ingrese el tipo del Item.");

        return t;
    }


    public static int cantItem() {

        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del Item."));

        return c;

    }


    public static int timeItem() {

        int ti = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de duracion del Item."));

        return ti;

    }


    public static int remainingUsesItem() {

        int rem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los usos restantes del Item."));

        return rem;
    }


    public static boolean equiparItem() {

        boolean recargar = false;
        int cant = 0;


        int rem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de municiones que posee."));
        do {

            if (cant >= 30) {
                JOptionPane.showMessageDialog(null, "Su arma esta recargada");
                recargar = true;
            } else {
                JOptionPane.showMessageDialog(null, "Su arma no tiene municiones para ser recargada");
            }

        } while (!recargar);

        return recargar;

    }


    public static double rapidezItem() {

        double rap = Double.parseDouble(JOptionPane.showInputDialog("rapidez del Item."));

        return rap;

    }


    public static double dañoItem() {

        double daño = Double.parseDouble(JOptionPane.showInputDialog("Danio que hace."));

        return daño;

    }


    public static String empuñaduraItem() {

        String emp = JOptionPane.showInputDialog("empuñadura del Item.");

        return emp;

    }
}