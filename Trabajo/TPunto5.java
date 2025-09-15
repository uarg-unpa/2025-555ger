package Trabajo;
import java.util.Scanner;
public class TPunto5 {
    public static void main(String[] args) {
        char dia; 
        boolean bandera = false;
        System.out.println("Ingrese la letra de la semana, L de lunes, M de martes, I de miercoles, J de jueves y V de viernes,");
        System.out.println("para determinar que tiene en el dia de hoy.");
        Scanner scann = new Scanner(System.in);
        do {
        dia = scann.next().charAt(0);
        switch (dia) {
            case 'L' + 'l':
                System.out.println("No hay clases.");
                bandera = true;
                break;
            case 'M' + 'm':
                System.out.println("Clases de 4:00 a 10:00.");
                bandera = true;
                break;
            case 'I' + 'i': 
                System.out.println("Clases de 5:00 a 7:00.");
                bandera = true;
                break;
            case 'J' + 'j':
                System.out.println("Clases de 2:00 a 4:00.");
                bandera = true;
                break;
            case 'V' + 'v':
                System.out.println("No hay clases.");
                bandera = true;
                break;
            default:  
                System.out.println("No se ha ingresado la letra correcta.");
                break;
            }  
        } while (bandera == false);
        scann.close();
    }
    
}