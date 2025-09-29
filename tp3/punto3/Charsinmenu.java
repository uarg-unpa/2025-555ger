package tp3.punto3;
public class Charsinmenu{
    private char [] pila;
    private int cima;
    private final int MAX = 4;
    //constructor
    public Charsinmenu(){
        pila = new char[MAX];
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
    public void Meter(char valor){
        cima ++;
        pila[cima] = valor;
    }
    public char Sacar(){
        char aux;
        aux = pila[cima];
        cima --;
        return aux;
    }
}

