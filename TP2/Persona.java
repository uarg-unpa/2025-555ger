package TP2;
/* Implementar una clase Persona que siga las siguientes condiciones:  
Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan 
directamente a ellos.  
Todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para 
String, etc.).  
Se implementarán varios constructores:  
Un constructor por defecto.  
Un constructor con el nombre.  
Los métodos que se implementaran son: 
esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.  
comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. No será visible al exterior.  
toString(): devuelve toda la información del objeto.  
Testear la clase implementada. */


public class Persona {
    // ATRIBUTOS
    private int dni;
    private String sexo;
    private double peso;
    private double altura;
    private int edad;
    private String nombre;
    // CONSTRUCTORES
    public Persona(int dni, String sexo, double peso, double altura, int edad, String nombre){
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
    }
    public Persona(){}

    // MÉTODOS
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getDni(){
        return this.dni;
    }
    public String getSexo(){
       return this.sexo;
    }
    public double getPeso(){
        return this.peso;
    }
    public double getAltura(){
        return this.altura;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
}
