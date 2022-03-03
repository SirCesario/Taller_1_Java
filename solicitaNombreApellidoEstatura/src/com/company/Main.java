package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner dato = new Scanner (System.in);

        System.out.println("¿ Como te llamas?");
        String nombre = dato.next();

        System.out.println("¿ Como te apellidas ?");
        String apellido = dato.next();

        System.out.println("¿ Cual es tu edad ? ");
        int edad = Integer.parseInt(dato.next());

        System.out.println("¿ Cuanto Mides ? ");
        double estatura = Double.parseDouble(dato.next());


    }
}