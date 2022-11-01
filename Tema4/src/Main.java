public class Main {
    public static void main(String[] args) {

        int numeroIf = 0;

        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        if (numeroIf > 0) {
            System.out.println("[IF] La variable numero es positiva");
        }
        else if (numeroIf < 0) {
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

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("[WHILE] La variable numero es %d".formatted(numeroWhile));
        }

        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println("[DO-WHILE] La variable numero es %d".formatted(numeroDoWhile));
        } while (numeroDoWhile < numeroDoWhile-1);

        /*
            Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
            y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute
            y deberá mostrarse por pantalla.
        */
        //for(int numero = 0; numero <= 3; numero++) {

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("[FOR] La variable numero es %d".formatted(numeroFor));
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