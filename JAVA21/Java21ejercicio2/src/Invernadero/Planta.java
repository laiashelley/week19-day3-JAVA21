package Invernadero;

public class Planta {
    
    public String tipoPlanta;
    String color;
    private boolean esToxica;

    public Planta() {
    }

    public Planta(String tipoPlanta, String color, boolean esToxica) {
        this.tipoPlanta = tipoPlanta;
        this.color = color;
        this.esToxica = esToxica;
    }

    public String getTipoPlanta() {
        return this.tipoPlanta;
    }

    public void setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsToxica() {
        return this.esToxica;
    }

    public boolean getEsToxica() {
        return this.esToxica;
    }

    public void setEsToxica(boolean esToxica) {
        this.esToxica = esToxica;
    }

    public void atributoArbol(Arbol arbol) {
        System.out.println("El tipo del arbol es: " + arbol.tipoArbol);
    }

    @Override
    public String toString() {
        return "{" +
            " tipoPlanta='" + getTipoPlanta() + "'" +
            ", color='" + getColor() + "'" +
            ", esToxica='" + isEsToxica() + "'" +
            "}";
    }

}
