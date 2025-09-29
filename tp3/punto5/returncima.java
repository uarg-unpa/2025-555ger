package tp3.punto5;
/* 5. Agregar a la clase Pila el método elementoCima() que retorne el elemento cima sin cambiar la pila. Nota:
no olvidar que si bien la pila se implementa como un arreglo, no debería manejarse como tal. */
public class returncima {
    private int cima;
    private final int MAX = 5;
    private int [] pila;
    //CONTRUCTOR
    public returncima(){
        pila = new int [MAX];    
        cima = -1;
    }
    public boolean Vacio(){
        if (cima == -1) {
            return true;
        } else {
            return false;
        }           
    }
    public boolean Lleno(){
        if (cima == MAX -1) {
            return true;
        } else {
            return false;
        }
    }
    public void Meter(int elemento){
        cima++;
        pila[cima] = elemento;
    }
    public int Sacar(){
        int aux;
        aux = pila[cima];
        cima--;
        return aux;
    }
    //metodo elementocima
    public int Elementocima(){
        if(! Vacio()){
            return pila[cima];
        }else{
            return -1;
        }
    }

}

