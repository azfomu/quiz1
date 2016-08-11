package bnkui;

import bnkcore.Cuenta;
import bnkcore.Tramite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
            double opcion;
            double opcions;
            boolean trfal = true;
            boolean trfals = true;
            while (trfal) {
            System.out.println("Banco No Compila");
            System.out.println("Menu General");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Tramites");
            System.out.println("3. Salir");
            BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Escoja una opción: ");
            opcion = Double.parseDouble(k.readLine());
                    if (opcion == 1) {
                        System.out.print("Ingrese nombre: ");
                            int numcuenta;
                            numcuenta = Integer.parseInt(k.readLine());
                            Cuenta mi_cuenta = new Cuenta();
                            mi_cuenta.getNumcuenta();
                            trfal = true;
                    } else if (opcion == 2){
                        while (trfals) {
                            System.out.println("Menu de Tramites");
                            System.out.println("1. Depositar");
                            System.out.println("2. Retirar");
                            System.out.println("3. Transferir");
                            System.out.println("4. Salir");
                            BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
                            System.out.print("Escoja una opción: ");
                            opcions = Double.parseDouble(t.readLine());
                            if (opcions == 1) {
                                Tramite miTramite = new Tramite();
                                miTramite.depositar(20);
                                trfals = true;
                            } else if (opcions == 2) {
                                Tramite miTramite = new Tramite();
                                miTramite.retirar(20);
                                trfals = true;
                            } else if (opcions == 3) {
                                Tramite miTramite = new Tramite();
                                miTramite.transferir();
                                trfals = true;
                            } else if (opcions == 4) {
                                trfals = false;
                            } else if (opcions < 1 || opcions > 4) {
                                trfals = true;
                            }
                            trfal = true;
                        }
                    } else if (opcion == 3){
                            System.out.print("Finalizo");
                            trfal = false;
                    } else if (opcion < 1 || opcion > 3){
                            trfal = true;
                    }
            }
      }
}
