import java.util.Scanner; 

class Perfect {
  public static void main(String[] args) {
  Scanner myObj = new 
  Scanner(System.in);
      
  System.out.println("Ingrese un numero "); 
  int num1 = myObj.nextInt();
  
  int num2 = num1;
  int divisor = 1;
  int sum = 0;
  while (num2 != 0){
    while (divisor < num2){
      if (num2 % divisor != 0){
        divisor++;
      }
      else {
        sum = sum + divisor;
        divisor++;
      }
      }
    if (num2 == sum){
      System.out.println(num2 + " es perfecto");  
    }
    num2 = num2 - 1;
    sum = 0;
    divisor = 1;
  }
  }
}

// 2)	¿Qué sucede cuando el numero ingresado es muy grande?, por ejemplo 1,000,000:
  // En teoría, el programa debería poder realizar el código sin importar el tamaño del número ingresado.
  // Sin embargo, el programa falla si se ingresa un numero tan grande por los tipos de datos ingresados. 
  // Ya que el numero ingresado es mayor al límite del tipo de dato, Java no reserva el tamaño de memoria
  // suficiente para realizar el programa.

// 3)	¿Cuál es el orden del algoritmo implementado? (Es más, ¿Qué es el orden de un algoritmo?)
  // 

// 4)	¿Qué características del programa generan los comportamientos experimentados?
// 

// 5)	Actualmente se están destinando esfuerzos para el desarrollo de Quantum Computing, si implementáramos una solución como un algoritmo en Quantum Computing, ¿Podría mejorar la ejecución del programa?
  // Yeah.
