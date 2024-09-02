/*Ejercicio 5: un obrero necesita calcular su salario semanal
el cual se obtiene de la siguiente manera: si trabaja 40 horas
o menos, se le paga 16 por hora, si trabaja mas de 40 horas se
le paga 16 por cada una de las primeras 40 horas y 20 por cada
hora extra*/

package ejercicio5;

import java.util.Scanner;

    
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner jin = new Scanner (System.in);
        
        int horasTrabajadas;
        float salarioTotal;
        
        System.out.print("Digita las horas trabajadas\n->");
        horasTrabajadas = jin.nextInt();
        
        if(horasTrabajadas <= 40){
            salarioTotal = horasTrabajadas * 16;
        }else{
            salarioTotal = (40*16) + ((horasTrabajadas - 40) * 20);
        }
        
        System.out.println("Su salario es de: " + salarioTotal);
        
    }
    
}
