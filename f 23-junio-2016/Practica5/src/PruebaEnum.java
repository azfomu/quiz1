
public class PruebaEnum {
    Dia dia;

    public PruebaEnum(Dia dia) {
        this.dia = dia;
    }

    public void probarDia() {
        switch (dia) {
            case LUNES:
                System.out.println("Los lunes son aburridos");
                break;
            default:
                System.out.println("Da igual");
        }
    }
}

public static void main(String[] args){
    PruebaEnum primerDia= new PruebaEnum(Dia.LUNES);
    primerDia.probarDia();
}