package Termometro;


import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.TextField;

import java.io.*;

public class Controller {

    //private String ruta_archivo = "c:/Intel/Temperatura.dat";
    public TextField tftemperatura;

    BufferedReader br = new BufferedReader (new FileReader("Temperatura.dat"));
    Double s1 = Double.valueOf(br.readLine());

    public Controller() throws IOException {
    }

    public void actualizar(ActionEvent actionEvent) throws IOException {
        Double temp = s1;
        if (temp >= 36.0 && temp <= 37.2) {
            String diagnostico;
            diagnostico = ",OK";
            File archivo = new File("Temperatura.dat");
            if (archivo.exists()) {
                FileWriter fw = new FileWriter(archivo.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(diagnostico);
                bw.close();
            }
        } else if (temp > 37.2 && temp <= 40.0) {
            String diagnostico;
            diagnostico = ",Fiebre";
            File archivo = new File("Temperatura.dat");
            if (archivo.exists()) {
                FileWriter fw = new FileWriter(archivo.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(diagnostico);
                bw.close();
            }
        } else {
            String diagnostico;
            diagnostico = ",Convulsiona";
            File archivo = new File("Temperatura.dat");
            if (archivo.exists()) {
                FileWriter fw = new FileWriter(archivo.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(diagnostico);
                bw.close();
            }
        }
    }
    public void mostrar(Event event) {
        tftemperatura.setText(String.valueOf(s1));
    }
}
