package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner dato = new Scanner (System.in);


        System.out.println("Ingrese el nombre de una ciudad capital: ");
        String ciudadCapital = dato.next();

        System.out.println("¿ A que Pais corresponde ? ");
        String pais = dato.next();

        System.out.println(" La ciudad de  "  + ciudadCapital + " es la capital de " + pais);
    }
}
