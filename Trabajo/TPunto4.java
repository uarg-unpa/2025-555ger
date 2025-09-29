package Trabajo;
import java.util.Scanner;
public class TPunto4 {
    public static void main (String[]args){
        int entrada1 = 0;
        int entrada2 = 0;
        int entrada3 = 0;
        Scanner scann = new Scanner (System.in);{
            System.out.println("Ingrese el primer valor de la entrada.");
            entrada1 = scann.nextInt();
            System.out.println("Ingrese el primer valor de la entrada.");
            entrada2 = scann.nextInt();
            System.out.println("Ingrese el primer valor de la entrada.");
            entrada3 = scann.nextInt();
        }
        if (entrada1 > entrada2 && entrada1 > entrada3) {
            System.out.println("El primer número de entrada es el mayor con:"+entrada1);
        } else {
            if (entrada2 > entrada1 && entrada2 > entrada3) {
                System.out.println("El segundo número de entrada es el mayor con:"+entrada2);
            } else {
                System.out.print("El tercer número de entrada es el mayor con:"+entrada3);
            }            
        }      
        scann.close();
    }
}
