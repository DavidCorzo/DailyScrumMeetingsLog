import java.io.PrintStream;//appends to lists, println and others ***
import java.util.ArrayList; //create lists
import java.util.List; //lists
import java.util.Random; //generate random numbre
import java.util.Scanner; //scanner ***
import java.math.*; //math stuff
import java.text.DecimalFormat; //Round decimals
///lector files
import java.security.Principal;
import java.io.File;
/////////////////////////////////////////////////////////////////////
//7)	Solicite dos números, súmelos e imprimir el resultado en pantalla.
class sumanumeros {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero1 = numero.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2 = numero.nextInt();
        int suma = numero1 + numero2;

        System.out.println("el resultado de la suma es: " + suma);

    }

}

// 8) Solicitar un número y si es igual a 7, imprimir "numero de la suerte"
class luckynumber {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int testnumber = numero.nextInt();
        if (testnumber == 7) {
            System.out.println("Numero de la suerte");
        }

    }

}

// 9) Solicite dos números e imprimir si los números son iguales
class equalnumbers {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("ingrese un numero:");
        int numero1 = numero.nextInt();
        System.out.println("ingrese otro numero");
        int numero2 = numero.nextInt();

        if (numero1 == numero2) {
            System.out.println("son iguales");
        }
    }

}
// 10) Solicitar dos números e imprimir el mayor de los dos

class biggernumber {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("ingrese un numero:");
        int numero1 = numero.nextInt();
        System.out.println("ingrese otro numero");
        int numero2 = numero.nextInt();

        if (numero1 > numero2) {
            System.out.println("el mayor es: " + numero1);
        } else {
            System.out.println(numero2);
        }
    }

}
// 11) Pedir un número y mostrar en pantalla si es par o impar

class paroimpar {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = numero.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es Par");
        } else {
            System.out.println("Es Impar");
        }

    }
}
// 12) Solicite un número, y verificar si dicho número se encuentra en el rango
// de 20 a 100.

class rango20a100 {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = numero.nextInt();
        if (num > 20 & num < 100) {
            System.out.println("Se encuentra en el rango de 20 a 100");
        } else {
            System.out.println("No se encuentra en el rango");
        }

    }
}
// 13) Hacer un algoritmo que solicite un año al usuario, y que indique si dicho
// año es bisiesto o no (Definamos año bisiesto si es múltiplo de 4).

class bisiesto {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Ingrese el año: ");
        int year = obj.nextInt();
        if (year % 4 == 0) {
            System.out.println("Es Bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }

    }
}
// 14) Realizar un algoritmo que calcule el factorial de un número.

class factorial {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Calculo de Factorial");
        System.out.println("Ingrese el numero: ");
        int numero = obj.nextInt();
        for (int i = 1; i <= numero; i++) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print("X" + i);
            }

        }

    }
}

// 15) Solicitar un número al usuario e Imprimir las tablas de multiplicar para
// ese numero
class tablasmultiplicar {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int numero = obj.nextInt();
        System.out.println("Tabla del numero:");
        for (int j = 1; j <= 10; j++) {
            int multi = numero * j;
            System.out.println(numero + " x " + j + " = " + multi);
        }

    }
}

// 16) Imprimir las tablas de multiplicar del 1 al 10
class tablasmultiplicar1al10 {
    public static void main(String[] args) {
        System.out.println("TABLAS DE MULTIPLICAR DEL 1 AL 10");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int multi = i * j;
                System.out.println(i + " x " + j + " = " + multi);
            }
        }
    }

}

// 17) Solicite dos números y calcular su multiplicación como sumas sucesivas
class multicomosumas {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("MULTIPLICACION DE DOS NUMEROS COMO SUMAS CONSECUTIVAS");
        System.out.println("Ingresa el primer numero ");
        int numero1 = obj.nextInt();
        System.out.println("Ingresa el segundo numero ");
        int numero2 = obj.nextInt();
        int multi = numero1 * numero2;
        for (int i = 1; i <= numero2; i++) {
            if (i == 1) {
                System.out.print(numero1);
            } else {
                System.out.print(" X " + numero1 + "");
            }
        }
        System.out.print(" = " + multi + " ");
    }

}

// 18) Hacer un algoritmo que solicite un número al usuario e indique si este es
// primo o no.
class primo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("PRUEBA DE NUMEROS PRIMOS");
        System.out.println("Ingresa el numero: ");
        int numero = obj.nextInt();
        int divisores = 0;
        int j = 1;
        for (int i = 1; i <= numero; i++) {
            if (numero % j == 0) {
                divisores = divisores + 1;
                // System.out.println("residuo cero");
            }
            j = j + 1;
        }

        if (divisores == 2) {
            System.out.println("Es Primo");
        }

    }
}

// 19) Hacer un programa que pida un número n del teclado y calcular la suma de
// los números de 1 a n.
class suma_a_n_numeros {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("SUMA A N NUMEROS (EMPEZANDO EN 1)");
        System.out.println("Ingrese un numero del teclado: ");
        int n = obj.nextInt();
        int suma = 0;
        int numero = 0;
        for (int i = 1; i <= n; i++) {
            numero = numero + 1;
            suma = suma + numero;
            if (numero == 1) {
                System.out.print(numero + "");
            } else {
                System.out.print(" + " + numero);
            }
        }
        System.out.print(" = " + suma);

    }
}

// 20) Hacer un programa que imprima a pantalla los primeros n números impares.
class n_numerosimpares {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("LOS PRIMEROS N NUMEROS IMPARES");
        System.out.println("Ingrese un numero del teclado: ");
        int n = obj.nextInt();
        int j = 0;
        int numeros = 0;
        List numerosimpares = new ArrayList();
        while (numeros < n) {
            j = j + 1;
            if (j % 2 != 0) {
                numerosimpares.add(j);
                numeros = numeros + 1;
            }
        }
        System.out.println(numerosimpares);
    }
}

// 21) Escribir un programa que lea números del teclado, el programa se detiene
// hasta que ingresen el numero 0 y luego debe calcular el promedio de los
// números
class promedio_n {
    public static void main(String[] args){
        Scanner obj=new
        Scanner (System.in);

        System.out.println("PROMEDIO N NUMEROS");
        System.out.println("Ingrese un numero del teclado: ");
        int n = obj.nextInt();
        List lista = new ArrayList();
        lista.add(n);
        while(n!=0){
            n=obj.nextInt();
            if (n!=0){
                lista.add(n);
            }
        }
        int range=lista.size();
        int suma=0;
        for (int i=1;i<=range;i++){
            int numeroactual= (int) lista.get(i-1);
            suma=suma+numeroactual;
        }
        int promedio=suma/range;
        System.out.println("El Promedio es: "+promedio);


    }

}
// 22) Compárelos (mayor que, menor que, o igual) y despliegue el resultado de la comparación.
class mayor_menor_igual {
    public static void main(String[] args){
        Scanner obj=new
        Scanner (System.in);

        System.out.println("MAYOR QUE, MENOR QUE, IGUAL QUE");
        System.out.println("Ingrese un numero: ");
        int n1 = obj.nextInt();
        System.out.println("Ingrese otro numero: ");
        int n2=obj.nextInt();
        if (n1>n2){
            System.out.println(n1+" es mayor que "+n2);
            System.out.println(n2+" es menor que "+n1);
        }
        if(n1<n2){
            System.out.println(n2+" es mayor que "+n1);
            System.out.println(n1+" es menor que "+n2);
        }
        else{
            System.out.println(n1+" es igual que "+n2);
        }
    }
}
//23)	Un negocio de deportes hace un 25 % de descuento en pelotas
// de fútbol y de béisbol. Se requiere escribir un programa que le 
//permita a un empleado ingresar los precios originales de las pelotas.
// El programa deberá usar esta entrada de datos para calcular el precio rebajado.
// La salida del programa deberá mostrar, en líneas separadas, el precio original 
//y el precio con descuento. 
class sports
{
    public static void main(String[] args){
        System.out.println("CALCULO DE DESCUENTOS ");
        Scanner obj=new
        Scanner(System.in);
        System.out.print("Ingrese el precio original de las pelotas: $");
        int price=obj.nextInt();
        System.out.println("Ingrese la cantidad de pelotas vendidas: ");
        int q=obj.nextInt();        double total_without_discount=price*q;
        double descuento=total_without_discount*0.4;
        double total=total_without_discount-descuento;
        System.out.println("El Total original es: $"+total_without_discount);
        System.out.println("El descuento fue de: $"+descuento);
        System.out.println("El Total con descuento es: $"+total);
        
        
}
}
//24)	La fórmula de la desviación estándar normal z, usada en aplicaciones de estadística es z = (X-m) / s, 
//donde m es el valor medio y s es la desviación estándar. Usando esta fórmula, escriba un programa que 
//calcule y despliegue el valor de la desviación estándar normal cuando X = 85.3, m = 80 y s = 4.
class deviacionestandar{
    public static void main(String[] args){
        double x=85.3;
        double m=80;
        double s=4;
        System.out.println("DEVIACION ESTANDAR NORMAL Z, CUANDO X = 85.3, m = 80 y s = 4 : ");
        double z=(x-m)/s;
        System.out.println(z);
    }
}
//25)	Escribir un programa que lea un número entero positivo e imprima los números naturales impares menores a él.
class numerosnaturalesmenores{
    public static void main(String[] args){
        Scanner obj=new
        Scanner (System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int numero=obj.nextInt();
        List impares= new ArrayList();
        if (numero>0){
            for (int i=1;i<=numero;i++){
                if (i%2!=0){
                    impares.add(i);
                }
            }
        }
        System.out.println(impares);

    }
}
//26)	Haga un algoritmo que calcule la división de dos números, pero sin utilizar los operadores /, div y mod.
class division{
    public static void main(String[] args){
        System.out.println("-- DIVISION DE DOS NUMEROS --");
        Scanner obj=new
        Scanner (System.in);
        System.out.println("Ingrese el dividendo: ");
        int dividendo=obj.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divisor=obj.nextInt();
        int residuo=dividendo-divisor;
        int cociente=1;
        while (residuo>=divisor){
            residuo=residuo-divisor;
            cociente=cociente+1;
        }
        System.out.println("El resultado es: "+cociente);
        System.out.println("Con residuo: "+residuo);
    }
}

//27 imprima sus iniciales en pantalla, pero utilizando el carácter *. Su texto debe tener 7 líneas de alto y 5 caracteres de ancho. 
class letras{
    public static void main(String[] args){
        System.out.println(" "+
        "*****      *        *     **   **\n"+
        "*     *    * *      * *    * * * *\n"+  
        "*          * *      * *    * * * *\n"+ 
        " *****    *   *    *   *   * * * *\n"+  
        "      *   *****    *****   *  *  *\n"+  
        "*     *  *     *  *     *  *  *  *\n"+  
        " *****   *     *  *     *  *     *  ");
    }
}

//28) Construya un programa que simule un dado. Pruebe lanzar el dado 3 veces y debe mostrar en pantalla cada lanzamiento y la suma total de los lanzamientos.
class dado{
    public static void main(String[] args)
    {
        System.out.println("Lanzamiento de dados");
        //import java.math.*;
        Random rand=new Random();
        int suma=0;
        int numero_de_lanzamientos=3;
        for (int i=0;i<numero_de_lanzamientos;i++){
            int lado=rand.nextInt(6)+1;
            System.out.println("Lanzamiento: "+lado);
            suma=suma+lado;
        }
        System.out.println("Suma: "+suma);
        // int lado1=rand.nextInt(6)+1;
        // int lado2=rand.nextInt(6)+1;
        // int lado3=rand.nextInt(6)+1;
        // int suma=lado1+lado2+lado3;
        // System.out.println("Primer lanzamiento: "+lado1);
        // System.out.println("Segundo Lanzamiento: "+lado2);
        // System.out.println("Tercer Lanzamiento: "+lado3);
        // System.out.println("Total: "+suma);
    }
    
}

//29)El banco le ha solicitado diseñar un programa para ayudar a los cajeros. 
//Como entrada debe recibir cuantas monedas tiene el cajero en las manos, 
//es decir, cuantas monedas tiene de 50, 25, 10 y 1 centavo. El programa debe 
//indicar cuanto dinero en Quetzales representan las monedas contabilizadas.
class Banco{
    public static void main(String[] args){
        Scanner myobj=new
        Scanner (System.in);
        System.out.println("Ingrese cuantas monedas de 1 centavo tiene: ");
        int pennys=myobj.nextInt();
        System.out.println("Ingrese cuantas monedas de 10 centavo tiene: ");
        int dime=myobj.nextInt();
        System.out.println("Ingrese cuantas monedas de 25 centavo tiene: ");
        int quarter=myobj.nextInt();
        System.out.println("Ingrese cuantas monedas de 50 centavo tiene: ");
        int halfdollar=myobj.nextInt();
        double total=0;
        for (int i=1;i<=halfdollar;i++){
            total=total+0.5;
        }
        for (int i=1;i<=quarter;i++){
            total=total+0.25;
        }
        for (int i=1;i<=dime;i++){
            total=total+0.10;
        }
        for (int i=1;i<=pennys;i++){
            total=total+0.01;
        }
        //////////////////////////////// rounded answer!!!!!!!!!!
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println(f.format(total));
        System.out.print("El total es de: Q"+total);
    }
}

//30)	El departamento de apoyo al estudiante requiere de nuestra ayuda para 
//implementar un programa que solicite el nombre completo del estudiante y luego
// imprima en pantalla cada nombre y cada apellido separado contabilizando 
//la cantidad de letras que tiene cada una de las palabras. Por ejemplo:
// El usuario ingresa el nombre de : Anastasia Clementina Puffendorf
// Luego el programa muestra en pantalla:
// Anastasia contiene: 9 letras.
// Clementina contiene: 10 letras.
// Puffendorf contiene: 10 letras.
class nombre{
    public static void main(String[] args)
    {
        Scanner obj=new
        Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String fullnombre=obj.nextLine();
        System.out.println("----------------------");
        // creamos array en la q dividimos el nombre
        String[] name = fullnombre.split(" ");
        int range=name.length;///length del array, size es para listas.
        for (int i=0;i<=range-1;i++){
            int letter_ammount=name[i].length();
            System.out.println(name[i]+" contiene: "+letter_ammount+" letras.");
        }


    }
}

// 31)	Ahora el departamento de catedráticos de la facultad requiere apoyo 
//para otro programa que facilite el seguimiento de los estudiantes. 
//Solicitan que se diseñe un programa que reciba como input un archivo .txt 
//el cual tiene el siguiente formato:
// <nombre de estudiante><crlf>
// <nota 1><crlf>
// <nota 2><crlf>
// <nota 3><crlf>
// <eof>
// Con la información proveída, debe mostrar en pantalla el nombre del estudiante 
//y el promedio de las notas obtenidas.
class lectordetexto{
    public static void main(String[] args){
        try {
            String filename, text, name;
            int resultado=0;
            int notas = 0;
            System.out.println("Ingresa nombre del archivo, (archivo.txt)");
            //Scans the filename
            Scanner file = new Scanner(System.in);
            filename = file.next();
            //assigns the file found to scanner variable
            Scanner scanner = new Scanner(new File(filename));
            //obtenemos el nombre del alumno, el nombre esta en la primera linea.
            text = scanner.nextLine();
            while (scanner.hasNextLine() & text.isEmpty()) {
                text = scanner.nextLine();
            }
            name = text;
            //promedio de notas
            while (scanner.hasNextLine()) {
                text = scanner.nextLine();
                while (scanner.hasNextLine() & text.isEmpty()) {
                    text = scanner.nextLine();
                }
                if(text!=""){
                    notas++;
                    resultado+= Integer.parseInt(text);
                }   
            }
            System.out.printf("\n"+name+" tiene un promedio de "+resultado/notas+"\n");
            scanner.close();
        } 
        //catch exception for try
        catch (Exception e) {
                System.out.println(e); 
        }
}
}