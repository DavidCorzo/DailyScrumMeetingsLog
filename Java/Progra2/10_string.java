import java.util.Scanner;
/// method 2
import java.io.Console;


class stringexercise {
  public static void main(String[] args) 
  {

    //scanner nos permite leer del teclado.
  Scanner myObj = new 
  Scanner(System.in);
      
  System.out.println("Ingrese una oración: "); 
  //pedimos el string llamado "in"
  String in = myObj.nextLine();
  // int i = scan.nextInt();
  // String o = myObj.nextLine();
  //lo convertimos a uppercase
  String out = in.toUpperCase();

  System.out.println(out);
  // System.out.println(o);
  ///////////////////////////////////////////////// method 2
  Console console = System.console();
  String s = console.readLine();
  // int i = Integer.parseInt(console.readLine());
  String salida = s.toUpperCase();
  System.out.println(salida);
  
}
}
