public class Main {
    public static void main(String[] args) {

        //Ejercicio 3.1
        int param1 = 3; int param2 = 105; int param3 = 1;
        int resultado = suma(param1, param2, param3);
        System.out.println("El resultado es: %d".formatted(resultado));

        //Ejercicio 3.2
        Coche miCoche = new Coche();
        miCoche.incPuertas();
        miCoche.mostrarPuertas();

    }

    /*
        Ejercicio 3.1.
        Primera parte:
            Crear una función con tres parámetros que sean números que se suman entre sí.
            Llamar a la función en el main y darle valores.
            Author: jcruzherrera.
            Función para sumar tres números.
    */
    public static int suma(int a, int b, int c) {
        return a+b+c;
    }
}

/*
    Ejercicio 3.2.
    Segunda parte:
        Crear una clase coche.
        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        Una función que incremente el número de puertas que tiene el coche.
        Crear un objeto miCoche en el main y añadirle una puerta.
        Mostrar el número de puertas que tiene el objeto.

 */
class Coche {

    public int puertas;
    public Coche() {
        this.puertas = 0;
    }
    /*
        Metodo que incrementa las puertas del coche
    */
    public void incPuertas() {
        this.puertas++;
    }
    public void mostrarPuertas() {
        System.out.println("El número de puertas es: %d".formatted(this.puertas));
    }
}
