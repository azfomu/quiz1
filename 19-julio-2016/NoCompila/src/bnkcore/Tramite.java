package bnkcore;


public class Tramite {

    private int numcuenta;
    private int numtramite;
    private String tipo;
    private double monto;
    private String descripcion;
    private Cuenta cta_origen;
    private Cuenta cta_destino;

    public Tramite() {
        this.numcuenta = numcuenta;
        this.numtramite = numtramite;
        this.tipo = tipo;
        this.monto = monto;
        this.descripcion = descripcion;
        this.cta_origen = cta_origen;
        this.cta_destino = cta_destino;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public int getNumtramite() {
        return numtramite;
    }

    public void setNumtramite(int numtramite) {
        this.numtramite = numtramite;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cuenta getCta_origen() {
        return cta_origen;
    }

    public void setCta_origen(Cuenta cta_origen) {
        this.cta_origen = cta_origen;
    }

    public Cuenta getCta_destino() {
        return cta_destino;
    }

    public void setCta_destino(Cuenta cta_destino) {
        this.cta_destino = cta_destino;
    }

    public double depositar(double s){

        double total = 0;

        if(tipo == "deposito") {
            s = s + monto;
            total = s;
        }
        return total;

    }

    public double retirar(double s){

        double total = 0;

        if(tipo == "retirar") {
            s = s - monto;
            total = s;
        }
        return total;
    }

    public double transferir () {

        double saldo_origen = 0;
        double saldo_destino = 0;

        if (tipo == "transferencia") {

            saldo_origen = cta_origen.getSaldo() - monto;
            saldo_destino = cta_destino.getSaldo() + monto;

        }

        return saldo_origen;
    }
}
