/*Ejercicio 3: luis tiene la mitad de lo que posee guillermo
Juan tiene la mitad de lo que poseen luis y guillermo.
Hacer un programa que calcule e imprima la cantidad de dinero
que tienen entre los 3*/

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner jin = new Scanner (System.in);
        
        float guillermo, luis, juan, total;
        
        System.out.print("digite la cantidad que tiene guillermo\n->");
        guillermo = jin.nextInt();
        
        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;
        
        total = guillermo + juan+ luis; 
        System.out.println("la cantidad de dinero entre los 3 es: " + total);
      
    }
    
}
