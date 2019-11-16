import java.util.Scanner;

/*
 * recursividad_6
 * 41) Realizar una función que calcule el numero n elementos de la serie Fibonacci 
 */
public class recursividad_41 {

    public static void main(String[] args) {
        //
        System.out.println("Ingrese el numero de numeros de fibonacci: ");
        Scanner obj = new Scanner(System.in);
        int fib = obj.nextInt();
        System.out.println("El " + fib + "uavo numero en la secuencia fibonacci es: " + fibonacci(fib));
    }

    public static int fibonacci(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1 || x == 2) {
            return 1;
        }
        return fibonacci(x - 2) + fibonacci(x - 1);
    }
}
