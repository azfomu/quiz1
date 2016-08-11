package registro;


import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller{

    public TextField tfimpuesto;
    public TextField tfsubtotal;


    public void calcular(ActionEvent event) throws IOException {
        Double subtotal = Double.valueOf(tfsubtotal.getText());
        Double respuesta = (subtotal * 0.07);
        respuesta = respuesta*(java.lang.Math.pow(10, 2));
        respuesta = Double.valueOf(Math.round(respuesta));
        respuesta = respuesta/java.lang.Math.pow(10, 2);
        tfimpuesto.setText(String.valueOf(respuesta));
    }

    public void limpiar(ActionEvent actionEvent) {
        tfsubtotal.setText("");
        tfimpuesto.setText("");
    }
}
