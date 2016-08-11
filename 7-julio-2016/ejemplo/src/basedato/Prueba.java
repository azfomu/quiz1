package basedato;


public class Prueba {
    public static void main(String args[]) {
        BaseDatos db = new BaseDatos();
        //bd.conectar("192.168.56.2","pepito","pepito","test");
        db.conectar("174.34.1.115","root","","got");
        /*
        db.obtener();
        db.cerrar();
        */
    }
}
