package Trabajo;
import java.util.Scanner;
public class TPunto6b {
    public static void main(String[] args) {
        /*Algoritmo 2*/
        int prod = 1;
        int suma = 0;
        int cont = 1;
        int NUM = 0;
        Scanner scann = new Scanner(System.in);
        while (cont <= 3) {
            NUM = scann.nextInt();
            suma = suma + NUM;
            prod = prod * NUM;
            cont++;
        }
        scann.close();
    }
}
