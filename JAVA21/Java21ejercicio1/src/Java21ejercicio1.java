// 1- (fácil) probando metodos de acceso

// Crear una clase en el directorio principal (en el mismo nivel que la clase app.java) con los modificadores de acceso  public y private (y default) y ver como accedo a cada atributo.

// Ejemplo clase Libro:

// public nombre;

// private codigoisbn;

// (no poner nada) double precio;

// Desde la clase main, instancia un libro e intenta acceder a cada propiedad del libro instanciado por separado. ¿Cómo lo consigues?


public class Java21ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        // instanciamos libro

        Libro libro1 = new Libro("The Martian", "Andy Weir", 15);

        System.out.println("Nombre del libro: ");

        System.out.println();

        System.out.println(libro1.nombre);

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        System.out.println("Autor del libro: ");

        System.out.println();

        System.out.println(libro1.getAutor());

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        System.out.println("Precio del libro: ");

        System.out.println();

        System.out.println(libro1.precio);

        System.out.println();
        System.out.println("----------------");
        System.out.println();

    }
}
