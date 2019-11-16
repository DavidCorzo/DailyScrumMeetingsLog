public class ExplainMethods {
    // Método que retorna un valor
    static int value_return( /* Los parámetros van aquí */ ) {
        // Hagámos el cálculo de un número al cuadrado...
        int numero = 8;
        int square = numero * numero; // Respuesta 64
        return square;
    }

    // Este método no imprimirá nada en pantalla
    // Pero sí retorna un valor
    // Ahora un void
    static void no_value_return(/* Parámetros van aquí */) {
        // Hagamos un cálculo de un número
        int numero = 5;
        System.out.println(numero + 8); // Respuesta 13
    }

    // El punto de entrada a mi programa es el método main
    public static void main(String[] args) {
        System.out.println("Return method");
        // Como el método devuelve algo no imprimirá nada, veámoslo:
        System.out.println(value_return());
        System.out.println("Void method");
        no_value_return();
    }
}
