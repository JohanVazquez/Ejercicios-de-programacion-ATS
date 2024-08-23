/*Ejercicio 1: hacer un programa que lea un numero entero y muestre si el numero 
es multiplo de 10*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        System.out.print("digita un numero ");
        int numero = jin.nextInt();
        
        if (numero%10 == 0){
            System.out.println("el numero " + numero +" es multiplo de 10 ");
        }else{
            System.out.println("el numero " + numero +" NO es multiplo de 10 ");
        }
    }
}
