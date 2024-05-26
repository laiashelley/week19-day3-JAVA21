package Establo;

public class Salvaje extends Animales {
    
    private String origen;

    public Salvaje(String tipoAnimal, int edad, String origen){
        super(tipoAnimal, edad);
        this.origen = origen;
    }

    public Salvaje(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "{" +
            " tipoAnimal='" + getTipoAnimal() + "'" +
            ", edad='" + getEdad() + "'" + getOrigen() + "'" +
            "}";
    }
}
