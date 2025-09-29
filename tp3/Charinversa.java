package tp3;
/* 3. Realice un programa que dado el ingreso de una palabra como cadena de caracteres, permita visualizarla
en forma inversa. */
public class Charinversa{
    private String [] pila;
    private int cima;
    private final int MAX = 4;
    //constructor
    public Charinversa(){
        pila = new String[MAX];
        cima = -1;
    }
    //metodos Vacio y LLeno
    public boolean Vacio(){
        if(cima == -1){
            return true;
        } else {
            return false;
        }
    }
    public boolean Lleno(){
        if(cima == MAX - 1){
            return true;
        } else {
            return false;
        }
    }
    //metodos Meter y Sacar
    public void Meter(String valor){
        cima ++;
        pila[cima] = valor;
    }
    public String Sacar(){
        String aux;
        aux = pila[cima];
        cima --;
        return aux;
    }
     

}
