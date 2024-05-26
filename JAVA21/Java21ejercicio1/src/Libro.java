public class Libro {
    
    public String nombre; // accesible desde cualquier clase
    private String autor; // solo accesible des de la clase Libro
    double precio; // este es el default, solo se usa des del mismo package.

    public Libro() {
    }

    public Libro(String nombre, String autor, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", autor='" + getAutor() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }

}
