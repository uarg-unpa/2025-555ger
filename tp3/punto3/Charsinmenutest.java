package tp3.punto3;
import java.util.Scanner;
public class Charsinmenutest{
    /* 3. Realice un programa que dado el ingreso de una palabra como cadena de caracteres, permita visualizarla
    en forma inversa. */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Charsinmenu pila = new Charsinmenu();
        System.out.println("Ingrese una palabra");
        String letra = leer.nextLine();
        for(int i = 0; i < letra.length(); i ++){
            pila.Meter(letra.charAt(i));
        }
        System.out.println("Invirtiendo la palabra... ");
        while (! pila.Vacio()) {
            System.out.println(pila.Sacar());       
        }
        leer.close();
        
    }
}