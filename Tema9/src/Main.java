public class Main {
    public static void main(String[] args) {


        Cliente cliente = new Cliente();
        cliente.setNombre("Pepe");
        cliente.setEdad(27);
        cliente.setTelefono(111111111);
        cliente.setCredito(30000.0f);
        cliente.show();

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Juan");
        trabajador.setEdad(30);
        trabajador.setTelefono(22222222);
        trabajador.setSalario(10000.0f);
        trabajador.show();
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public Persona() {}

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


}

class Cliente extends Persona {
    private float credito;

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
    public void show() {
        System.out.println("Cliente:");
        System.out.println("\tNombre: %s".formatted(this.getNombre()));
        System.out.println("\tEdad: %d".formatted(this.getEdad()));
        System.out.println("\tTelefono: %d".formatted(this.getTelefono()));
        System.out.println("\tCredito: %.2f".formatted(this.getCredito()));
    }
}

class Trabajador extends Persona {
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void show() {
        System.out.println("Trabajador:");
        System.out.println("\tNombre: %s".formatted(this.getNombre()));
        System.out.println("\tEdad: %d".formatted(this.getEdad()));
        System.out.println("\tTelefono: %d".formatted(this.getTelefono()));
        System.out.println("\tSalario: %.2f".formatted(this.getSalario()));
    }
}