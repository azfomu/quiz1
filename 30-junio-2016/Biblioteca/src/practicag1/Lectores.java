package practicag1;


public class Lectores {
    private String nombre;
    private String cedula;
    private int cantLibros;
    private boolean statusMulta;
    private boolean statusPrestamo;

    public void solicita(){

    }
    public void entregar(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public void setCantLibros(int cantLibros) {
        this.cantLibros = cantLibros;
    }

    public boolean isStatusMulta() {
        return statusMulta;
    }

    public void setStatusMulta(boolean statusMulta) {
        this.statusMulta = statusMulta;
    }

    public boolean isStatusPrestamo() {
        return statusPrestamo;
    }

    public void setStatusPrestamo(boolean statusPrestamo) {
        this.statusPrestamo = statusPrestamo;
    }
}
