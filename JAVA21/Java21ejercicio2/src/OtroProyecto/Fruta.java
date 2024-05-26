package OtroProyecto;

public class Fruta {

    private String nombre;
    private String color;

    public Fruta() {
    }

    public Fruta(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", color='" + getColor() + "'" +
            "}";
    }

}
