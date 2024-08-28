/*Hacer un programa que lea un caracter por teclado y compruebe si es
una letra mayuscula*/
package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner jin = new Scanner (System.in);
        
        System.out.print("digite la letra\n->");
        char letra = jin.next().charAt(0);
        
        
        if(Character.isUpperCase(letra)){
            System.out.println("letra mayuscula");
            
            }else {
                System.out.println("letra miniscula");
            }
        
    }
    
}
