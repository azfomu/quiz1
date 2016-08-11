package com.uip;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

        public static void main(String[] args) throws Exception {
            double tempC; // Temperatura en grado Celsius
            double tempF; // Temperatura en grado Farenheit
            BufferedReader k = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Temperatura en Celsius: "); //Mensaje de ayuda
            tempC = Double.parseDouble(k.readLine()); //Lectura de dato

            //tempC = 25.0; // Asignacion de valor punto-flotante
            tempF = tempC * 9 / 5 + 32; //Expresion

            System.out.println("Temperatura: " + tempC + "C"); //Salida en Celsius
            System.out.println("Temperatura: " + tempF + "F"); //Salida en Farenheit
    }
}
