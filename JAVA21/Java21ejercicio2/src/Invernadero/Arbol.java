package Invernadero;

public class Arbol {
    
    public String tipoArbol;
    String color;
    private boolean esPerenne;

    public Arbol() {
    }

    public Arbol(String tipoArbol, String color, boolean esPerenne) {
        this.tipoArbol = tipoArbol;
        this.color = color;
        this.esPerenne = esPerenne;
    }

    public String getTipoArbol() {
        return this.tipoArbol;
    }

    public void setTipoArbol(String tipoArbol) {
        this.tipoArbol = tipoArbol;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsPerenne() {
        return this.esPerenne;
    }

    public boolean getEsPerenne() {
        return this.esPerenne;
    }

    public void setEsPerenne(boolean esPerenne) {
        this.esPerenne = esPerenne;
    }

    @Override
    public String toString() {
        return "{" +
            " tipoArbol='" + getTipoArbol() + "'" +
            ", color='" + getColor() + "'" +
            ", esPerenne='" + isEsPerenne() + "'" +
            "}";
    }

}
