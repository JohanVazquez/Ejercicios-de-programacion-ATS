/*Ejercicio 6: hacer un programa que tome dos numeros y diga
si ambos son pares o impares*/
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.print("digita dos numeros diferentes\n->");
        numero1 = jin.nextInt();
        numero2 = jin.nextInt();
        
        int auxiliar1 = numero1 % 2;
        int auxiliar2 = numero2 % 2;
        
        
        if (auxiliar1 == 0){
            System.out.println(numero1 + " es par");
        }else{
            System.out.println(numero1 + " es impar");
        }
        
        if (auxiliar2 == 0){
            System.out.println(numero2 + " es par");
        }else{
            System.out.println(numero2 + " es impar");
        }
        
    }
    
}
