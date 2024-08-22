/*Ejercicio 7: construir un programa que, dado un numero total de horas
devuelve el numero de semanas, dias y horas equivalentes*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        int horastotales, semanas, dias, horas;
        
        System.out.print("digita el numero de horas\n->");
        horastotales = jin.nextInt();
        
        semanas = horastotales / 168;
        
        dias = horastotales % 168 / 24;
        
        horas = horastotales%24;
        
        System.out.println("El equivalente es: "
                + "\nsemanas: "+ semanas
                + "\nDias: " + dias
                + "\nHoras: " + horas);
    }
    
}
