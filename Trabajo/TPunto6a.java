package Trabajo;
import java.util.Scanner;
public class TPunto6a {
    public static void main(String[] args) {
        /*Algoritmo 1*/
        Scanner scann = new Scanner(System.in);
        int N1 = 0;
        int N2 = 0;
        int N3 = 0;
        int calculo = 0;
        int suma = 0;
        System.out.println("Ingrese 3 valores para calcular y imprimir de la suma de ellos.");
        N1 = scann.nextInt();
        N2 = scann.nextInt();
        N3 = scann.nextInt();
        scann.close();
        suma = N1 + N2 + N3; 
        System.out.println("La suma de los 3 valores que se han ingresado es:"+suma);
        calculo = N1 * N2 * N3; 
        System.out.println("El calculo de los 3 valores que se han ingresado es:"+calculo);
    }
}
