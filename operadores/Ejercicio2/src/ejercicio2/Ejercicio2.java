/*Ejercicio 2: hacer un programa que calcule e imprima el salario
semanal de un empleado a partir de sus horas semanales trabajas y 
de su salario por hora*/
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        
        double dinero;
        int horas; // declaramos las variables
        
        System.out.print("digita cuanto ganas por hora \n->");
        dinero = jin.nextDouble();
        
        System.out.print("ahora digita cuantas horas trabajaste a la semana \n->");
        horas = jin.nextInt(); // metemos los datos
        
        double sueldo = dinero * horas; // multiplicamos las horas trabajadas por el salario por hora
        
        System.out.println("tu salario es: " + sueldo); 
    }
    
}
