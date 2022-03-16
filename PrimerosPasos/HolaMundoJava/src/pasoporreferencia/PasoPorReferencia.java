package pasoporreferencia;

import clases.PersonaJava;

public class PasoPorReferencia {
    public static void main(String[] args) {
        PersonaJava persona1 = new PersonaJava();
        persona1.nombre = "Yago";
        System.out.println("persona1 nombre: " + persona1.nombre);
        persona1 = cambiaValor(persona1);
        System.out.println("persona1 nombre: " + persona1.nombre);
    }
    
    public static PersonaJava cambiaValor(PersonaJava personaJava){
        personaJava.nombre ="Karla";
        return personaJava;
    }
}
