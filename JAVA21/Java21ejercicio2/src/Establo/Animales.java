package Establo;

public abstract class Animales {
    
    protected String tipoAnimal;
    protected int edad;

    public Animales() {
    }

    public Animales(String tipoAnimal, int edad) {
        this.tipoAnimal = tipoAnimal;
        this.edad = edad;
    }

    public String getTipoAnimal() {
        return this.tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{" +
            " tipoAnimal='" + getTipoAnimal() + "'" +
            ", edad='" + getEdad() + "'" +
            "}";
    }

}
