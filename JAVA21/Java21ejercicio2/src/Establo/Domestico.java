package Establo;

public class Domestico extends Animales {
    
    private String tipoDomestico;

    public Domestico(String tipoAnimal, int edad, String tipoDomestico){
        super(tipoAnimal, edad);
        this.tipoDomestico = tipoDomestico;
    }

    public Domestico(String tipoDomestico) {
        this.tipoDomestico = tipoDomestico;
    }

    public String getTipoDomestico() {
        return this.tipoDomestico;
    }

    public void setTipoDomestico(String tipoDomestico) {
        this.tipoDomestico = tipoDomestico;
    }

    @Override
    public String toString() {
        return "{" +
            " tipoAnimal='" + getTipoAnimal() + "'" +
            ", edad='" + getEdad() + "'" + getTipoDomestico() + "'" +
            "}";
    }
}