package app.upc.com.appsql;

public class Telefono {

    private String titulo;
    private String telefono;

    public Telefono(String titulo, String telefono) {
        this.titulo = titulo;
        this.telefono = telefono;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
