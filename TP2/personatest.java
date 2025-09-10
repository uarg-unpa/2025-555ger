package TP2;
import java.util.Scanner;
public class personatest {
int dato = 0; 
    public static void main(String[] args) {
        Persona datospersona = new Persona(45983488, "Hombre", 78, 1.85, 21, "Germán");
        datospersona.getDni();
        System.out.println(datospersona.getDni());
        System.out.println("Que desearía que proporcione.");
        Scanner scann = new Scanner(System.in); 
        System.out.println("1 para el dato Dni");
        System.out.println("2 para el dato Sexo");
        System.out.println("3 para el dato Peso");
        System.out.println("4 para el dato Altura");
        System.out.println("5 para el dato Edad");
        System.out.println("6 para el dato Nombre");   
        int dato = scann.nextInt();
        if(dato > 0){
            switch (dato) {
                case 1 :
                    System.out.println("El dni de la persona es:" + datospersona.getDni());
                break;
                case 2 :
                    System.out.println("El sexo de la persona es:" + datospersona.getSexo());
                break;
                case 3 :
                    System.out.println("El peso de la persona es:" + datospersona.getPeso());
                break;
                case 4 :
                    System.out.println("El altura de la persona es:" + datospersona.getAltura());
                break;
                case 5 :
                    System.out.println("El edad de la persona es:" + datospersona.getEdad());
                break;
                case 6 :
                    System.out.println("El nombre de la persona es:" + datospersona.getNombre());
                break;
                
                default:
                System.out.println("El número ingresado no se ha encontrado.");
                break;
            }
        }
        scann.close();
    }
     
}