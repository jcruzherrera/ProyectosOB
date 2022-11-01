/*
Para practicar la encapsulación:
        Crear clase Persona.
        Crear variables las privadas edad, nombre y telefono de la clase Persona.
        Crear gets y sets de cada propiedad.
        Crear un objeto persona en el main.
        Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
        
 */
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Juan Manuel");
        persona.setEdad(26);
        persona.setTelefono(627343636);

        System.out.println("Persona:");
        System.out.println("\tNombre: %s".formatted(persona.getNombre()));
        System.out.println("\tEdad: %d".formatted(persona.getEdad()));
        System.out.println("\tTelefono: %d".formatted(persona.getTelefono()));
    }
}



