/*
 * recursividad
 * 36) Dado un numero ‘n’ se debe realizar una sumatoria recursiva de 0 hasta el número n 
 */
public class recursividad_36 {
    public static void main(String[] args) {
        int numero = 9;
        int resultado = sumatoria(numero);
        System.out.println("Resultado: " + resultado);
    }

    public static int sumatoria(int numero) {
        // ¿Cuándo queremos que termine de llamarse a sí misma?
        int argumento_cambiante;
        if (numero == 1) {
            return 1;
        } else {
            argumento_cambiante = numero + sumatoria(numero - 1);
        }
        return argumento_cambiante;
    }
}
