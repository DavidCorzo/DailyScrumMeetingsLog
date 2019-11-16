/**
 * recursividad_7 42) Realice una función que calcule el entero más pequeño en
 * un arreglo de enteros.
 */
public class recursividad_42 {
    public static void main(String[] args) {
        int arreglo_de_enteros[] = { 0, 1, 2, 3, 4, -1000, 5, 6, 7, 8, -1000000 };
        int index = 0;
        int minimum = min(arreglo_de_enteros, index);
        System.out.println("Entero mas pequeno del arreglo es: " + minimum);
    }

    public static int min(int arreglo_de_enteros[], int index) {

        int l = arreglo_de_enteros.length;
        // System.out.println("Arreglo: " + l + " " + index);
        if (index == l - 1) {
            // System.out.println("Executed if index == lenght " + (l - 1) + " " + index);

            return arreglo_de_enteros[index];
        }

        // Despues del medio while que hace hasta que se cumple la condición de index ==
        // l - 1 agarra el último
        int suspect = min(arreglo_de_enteros, index + 1);
        // System.out.println("Suspect: " + suspect);

        // Determina si es más grande o más pequeño.
        if (arreglo_de_enteros[index] < suspect) {
            // System.out.println("Executed compare " + arreglo_de_enteros[index] + " " +
            // suspect);
            return arreglo_de_enteros[index];
        } else {
            // System.out.println("Else executed " + suspect);
            return suspect;
        }
    }
}
