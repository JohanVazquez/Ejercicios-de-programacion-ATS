/*Ejercicio 2: Pedir 2 numeros y decir cual es el mayor o si son iguales*/
package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        System.out.print("digita 2 numeros\n->");
        int x = jin.nextInt(), y = jin.nextInt();
        
        if(x > y){
            System.out.println(x + " es mayor que " + y);
        }else if(x < y){
            System.out.println(x + " es menor que " + y);
            }else{
                System.out.println(x + " es igual a " + y);
            }
    }
    
}
