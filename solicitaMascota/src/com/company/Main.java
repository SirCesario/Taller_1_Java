package com.company;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner dato = new Scanner (System.in);


        System.out.println("¿ Cual es tu Nombre Completo ? ");
        String nombreCompleto = dato.next();

        System.out.println(" ¿ Como se llama tu mascota ? ");
        String nombreMascota= dato.next();

        System.out.println("¿ Que edad tiene ? ");
        String edadMascota= dato.next();

        System.out.println(" ¿ Que tipo de Mascota es ?");
        String TipoMascota = dato.next();

        System.out.println("¿ Que raza es tu Mascota ? ");
        String Raza = dato.next();

        System.out.println(  nombreMascota + "   " + "es un " + TipoMascota+ " " + "quien tiene " + edadMascota
                +"   " + " años de edad"+ " "+ " es de raza "+ " " + Raza + "y" + nombreCompleto + " " + "es su dueño actualmente");

    }
}

