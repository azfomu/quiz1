package com.uip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void cicloValidador(double numAdivinar) throws IOException {
        final double consT=26;
        int i=1, val=0;
        while (i < 4){
            BufferedReader k = new BufferedReader (new InputStreamReader(System.in));
            System.out.print("Adivine el numero : ");
            numAdivinar = Double.parseDouble(k.readLine()); //Lectura de dato
            if (numAdivinar < consT){
                System.out.println("Demasiado Bajo");
                }
                else if (numAdivinar > consT) {
                    System.out.println("Demasiado Alto");
                }else if(numAdivinar == consT) {
                    System.out.println("Bien lo adivinastes");
                    val = 1;
                    break;
                }
            i = i + 1;
            }
        if (i == 4 && val == 0) {
            System.out.print("Perdiste");
        }
    }
    public static void main(String[] args) throws IOException {
        double numAdivinar = 0;

        System.out.println("LABORATORIO"); //Titulo de programa
        System.out.println("Elaborado por: Azael Fonseca M"); //Nombre del creador
        cicloValidador(numAdivinar);
    }
}