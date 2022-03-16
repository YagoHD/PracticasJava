public class PruebaPersona {
    public static void main(String[] args) {
        //Declaracion de una variable
        Persona persona1;
        //Creacion de objetos
        persona1 = new Persona();
        Persona persona2 = new Persona();
        
        persona1.nombre = "Juan";
        persona2.nombre = "Karla";
        persona1.apellido = "Perez";
        persona2.apellido = "Ramos";
        //CORREMOS LOS METODOS
        persona1.desplegarInformacion();
        persona2.desplegarInformacion();
    }
}
