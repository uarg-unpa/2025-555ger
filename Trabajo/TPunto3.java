package Trabajo;

public class TPunto3 {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        int Aux = 3;
        System.out.println("Variables ya asignadas, hora de convertirlas.");
        if (A != B && A != C);{
            B = A;
            C = A;
            A = Aux;             

        }
        System.out.println("Ya se han intercambiado los valores de las variables entre si.");  
        System.out.println("El valor de la variable A es:" + A);
        System.out.println("El valor de la variable B es:" + B);
        System.out.println("El valor de la variable C es:" + C);
    }
}
