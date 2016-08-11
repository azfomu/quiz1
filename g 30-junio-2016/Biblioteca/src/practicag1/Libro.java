    package practicag1;

public class Libro {
    private String nombre;
    private TipoLibro tipo;
    private int año;
    private Autores autor;
    private String id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public TipoLibro getTipo() {
        return tipo;
    }

    public void setTipo(TipoLibro tipo) {
        this.tipo = tipo;
    }

    public Autores getAutor() {
        return autor;
    }

    public void setAutor(Autores autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
