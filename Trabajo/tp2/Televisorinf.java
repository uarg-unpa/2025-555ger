package Trabajo.tp2;
import java.util.Scanner;
public class Televisorinf {
    public static void main(String[] args) {
        Televisor televisor1;
        televisor1 = new Televisor("Leo tres mil", true, 1, 3);
        System.out.println(televisor1.getModelo()); 
        televisor1.setModelo("penelope");
        System.out.println(televisor1.getModelo());
        System.out.println(televisor1.getVolumen());
        televisor1.setmodVolumen(2);
        System.out.println(televisor1.getVolumen());
        System.out.println(televisor1.getCanal());
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Desea volver al canal anterior?");
        String volver = scanner.nextLine();
                    if (volver == "si") { 
                        televisor1.setHistorial(volver);

                        System.out.println("Se vuelve al canal: " + televisor1.getCanal());
                    }
                    scanner.close();
                    
    }
}
