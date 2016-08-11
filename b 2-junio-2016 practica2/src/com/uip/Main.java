package com.uip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void convMedida(double medCm) {
            double medPlg;
            medPlg = medCm / 2.54;
            System.out.print("Medida en plg: " + medPlg);

        }
        public static void main(String[] args) throws IOException {
            double medCm;
            BufferedReader k = new BufferedReader (new InputStreamReader(System.in));

            System.out.print("Medida en cm: "); //Medida en centrimetro
            medCm = Double.parseDouble(k.readLine()); //Lectura de dato
            if (medCm > 0) {
                convMedida(medCm);
            }else System.out.print("valor negativo no es valido");
    }
}
