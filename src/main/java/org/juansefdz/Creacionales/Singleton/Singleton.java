package org.juansefdz.Creacionales.Singleton;

// Singleton

// El patrón Singleton es un patrón de diseño creacional que garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a ella.

//creamos la clase Singleton
public class Singleton {
    // creamos una variable de tipo Singleton

    private static Singleton instancia;

    // creamos un constructor privado
    private Singleton() {
        System.out.println("----------------------------------");
        System.out.println("ejemplo Patron Singleton");
        System.out.println("Conectando a la base de datos...");
        System.out.println("----------------------------------");
    }

    // creamos un método estático que nos devolverá la instancia de la clase
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

}
