// 2 - Tienes una granja con un establo y un invernadero => 2 packages (paquetes de clases),

// Dentro de la carpeta src (donde se encuentra el main) tienes dos carpetas con archivos java (paquetes), donde cada uno de estos
// paquetes contienen al menos dos clases:


// - Package1: OK
// o Clase Arbol: atributos default, private y public (uno de cada)
// o Y clase Planta: atributos default, private y public (uno de cada)


// - Package2: OK

// o Crear clase madre Animales, y atributos protected. Las clases hijas son:
// o Clase AnimalSalvaje
// o Clase AnimalDomestico


// Desde la clase Principal, crear:
// - Un objeto de la clase Planta (o/y Arbol)
// - Un objeto de la clase AnimalSalvaje
// - Un objeto de la clase AnimalDomestico
// - (No hace falta instanciar la clase madre) (puede ser abstract) OK

// Como siempre, cuando instancias esos objetos desde el main, le pasas los valores para cada atributo. Estos atributos los inventas tú.

// Imprimes todos estos objetos, y propiedades de objetos de todas las clases desde la clase main. ¿De qué manera accedes a cada uno de ellos? Prueba a acceder a los atributos con modificadores protected, default, private y public desde el main.

// + EXTRA: probar a traer una clase que pertenezca a cualquier otro proyecto java realizado anteriormente. ¿Cómo la integras en un package determinado?

// +EXTRA: ¿Y podrías, por ejemplo acceder desde la clase Planta a algún atributo de la clase Arbol?

// Esto dependeria del modificador de acceso.

import Establo.Domestico;
import Establo.Salvaje;
import Invernadero.Arbol;
import Invernadero.Planta;
import OtroProyecto.Fruta;

public class Java21ejercicio2 {
    public static void main(String[] args) throws Exception {
        
    // Crear objeto de la clase Planta o Arbol
    
    Planta planta1 = new Planta("Margarita", "Amarilla", false);

    System.out.println(planta1);
    
    // Crear objeto de la clase Salvake

    Salvaje animalSalvaje1 = new Salvaje("Leon", 5, "Sabana");

    System.out.println(animalSalvaje1);

    // Crear objeto de la clase Domestico

    Domestico animalDomestico1 = new Domestico("Perro", 5, "Tranquilo");

    System.out.println(animalDomestico1);

    // Acceder a tipoAnimal de Salvaje (protected):

    System.out.println(animalSalvaje1.getTipoAnimal());

    // Acceder a color de la planta (default):

    System.out.println(planta1.getColor());

    // Acceder al tipoPlanta (public)
    
    System.out.println(planta1.tipoPlanta);

    // Acceder a tipoDomestico (private):

    System.out.println(animalDomestico1.getTipoDomestico());

    // instanciar objeto de la clase externa Fruta:

    Fruta fruta1 = new Fruta("Manzana", "Verde");

    System.out.println(fruta1);

    // accedemos a atributo arbol des de un metodo en planta:

    Arbol arbol1 = new Arbol("Pino", "Verde", true);
    System.out.println(arbol1);
    planta1.atributoArbol(arbol1);

    }
}
