public class Main {
    public static void main(String[] args) {

        int numero = 2;

        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        if (numero > 0) {
            System.out.println("[IF] La variable numero es positiva");
        }
        else if (numero < 0) {
            System.out.println("[IF]La variable numero es negativa");
        }
        else {
            System.out.println("[IF] La variable numero es cero");
        }

        /*
        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
            Incrementar el valor de la variable en uno cada vez que se ejecute.
            Mostrarlo por pantalla cada vez que se ejecute.
        */

        while (numero < 3) {
            numero++;
            System.out.println("[WHILE] La variable numero es %d".formatted(numero));
        }

        do {
            numero++;
            System.out.println("[DO-WHILE] La variable numero es %d".formatted(numero));
        } while (numero < numero-1);

        /*
            Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
            y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute
            y deberá mostrarse por pantalla.
        */
        //for(int numero = 0; numero <= 3; numero++) {
        for(numero = 0; numero <= 3; numero++) {
            System.out.println("[FOR] La variable numero es %d".formatted(numero));
        }
        /*
            Por último, para el Switch, deberás crear la variable estacion,
            y distintos case para las cuatro estaciones del año.
            Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando
            de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
         */
        String estacion = "otoño";
        switch (estacion.toLowerCase()) {
            case "invierno":
            case "otoño":
            case "primavera":
            case "verano":
                System.out.println("La estación es %s".formatted(estacion));
                break;
            default:
                System.out.println("La variable estación no contiene una estación del año y su valor es: %s".formatted(estacion));

        }

    }
}