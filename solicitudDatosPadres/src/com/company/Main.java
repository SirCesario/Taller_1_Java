package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.println("¿ Como te llamas ? ");
        String nombre = dato.next();
        System.out.println("¿ Como te apellidas ?  ");
        String apellido = dato.next();
        System.out.println("¿ Como se llama tu Padre ? ");
        String NombrePadre = dato.next();
        System.out.println(" ¿ Como se apellida tu Padre ?");
        String ApellidoPadre = dato.next();
        System.out.println("¿ Como se llama tu Madre ? ");
        String NombreMadre = dato.next();
        System.out.println(" ¿ Como se apellida tu Madre ? ");
        String ApellidoMadre = dato.next();
        System.out.println(" Yo " + nombre + " " + apellido + " soy hijo de " + NombrePadre + " "+ ApellidoPadre
                + " y " + NombreMadre + " " + ApellidoMadre);
    }
}

