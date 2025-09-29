package tp3.punto5;

import java.util.Scanner;

/* 5. Agregar a la clase Pila el método elementoCima() que retorne el elemento cima sin cambiar la pila. Nota:
no olvidar que si bien la pila se implementa como un arreglo, no debería manejarse como tal. */
public class returncimatest {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        returncima pila = new returncima();
        int option;
        do {
            // MENÚ
            System.out.println("-----------------------------------------");
            System.out.println("Menú");
            System.out.println("1. Ingresar número entero.");
            System.out.println("2. Sacar número.");
            System.out.println("3. Retornar solo el último elemento.");
            System.out.println("0. Salir del menú.");
            System.out.println("-----------------------------------------");
            option = leer.nextInt();
            leer.nextLine(); //limpiamos buffer
            switch (option) {
                case 1:
                    System.out.println("Ingrese un número...");
                    int contenido = leer.nextInt();
                    pila.Meter(contenido);
                    System.out.println("Se ha ingresado el elemento: " + contenido);
                    break;
                case 2:
                    if (pila.Vacio()) {
                        System.out.println("Esta vacia");
                    } else {
                        int eliminado = pila.Sacar();
                         System.out.print("Se ha eliminado el número: " + eliminado);
                    }
                    break;
                case 3:
                    int elemento = pila.Elementocima();
                    if (elemento != -1) {
                      System.out.println("Elemento de la cima es: " + elemento);                         
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Número ingresado incorrecto");
                    break;
            }
        
        } while (option != 0);
        leer.close();
    }
}
