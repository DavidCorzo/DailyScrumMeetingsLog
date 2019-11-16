import java.util.Scanner;

/**
 * recursividad_2 37) Dado un numero ‘n’ se debe calcular el factorial del
 * numero
 */
public class recursividad_37 {
    // Calcular el factorial de n usando recursión
    public static void main(String[] args) {
        System.out.println("    37) Factorial");
        System.out.println("Ingrese un numero: ");
        Scanner obj = new Scanner(System.in);
        int numero = obj.nextInt();
        int resultado = factorial(numero);
        System.out.println("Resultado: " + resultado);
    }

    public static int factorial(int numero) {
        int facto;
        if (numero == 1) {
            return 1;
        } else {
            facto = numero * factorial(numero - 1);
        }
        return facto;
    }
}
