/*Ejercicio 1: hacer un programa que calcule e imprima la suma
de tres calificacion*/

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        float x, y, z, sumatoria; // declaramos las 3 notas y la sumatoria
        
        System.out.print("digite las 3 calificaciones \n->"); // metemos los datos
        x = jin.nextFloat();
        y = jin.nextFloat();
        z = jin.nextFloat();
        
        sumatoria = x+y+z; // creamos la variable de suma
        
        System.out.println("Sumatoria: " + sumatoria);
        
    }
    
}
