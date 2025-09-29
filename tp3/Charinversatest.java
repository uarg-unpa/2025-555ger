package tp3;
import java.util.Scanner;
public class Charinversatest{
    /* 3. Realice un programa que dado el ingreso de una palabra como cadena de caracteres, permita visualizarla
    en forma inversa. */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Charinversa pila = new Charinversa();
        int option;

        do {
            System.out.println("-----------------------------------");
            System.out.println("Menú");
            System.out.println("1. Ingresar los character.");
            System.out.println("2. Sacar character.");
            System.out.println("3. Devolver en cadena.");
            System.out.println("4. Devolver cadena en inversa.");
            System.out.println("0. Salir del menú.");
            System.out.println("-----------------------------------");
            option = leer.nextInt();
            leer.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Ingresar los character");
                    String character = leer.nextLine();
                    pila.Meter(character);
                    System.out.println("Se ha ingresado el character: " + character);
                    break;
                case 2:
                    if (pila.Vacio()) {
                        System.out.println("Ya esta vacía");
                    } else {
                        String character2 = pila.Sacar();
                        System.out.println("Se ha sacado el character: " + character2+".");

                    }
                case 3:
                    
                    break;
                case 0:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Ingrese un valor correcto.");
                    break;
            }

        } while(option != 0);
        leer.close();
    }

}
