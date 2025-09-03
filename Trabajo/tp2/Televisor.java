/* En base a las propiedades obtenidas en el ejercicio 2, implementar la clase Televisor. Con el constructor,
los set y get que sean necesarios, y con los métodos para encender, apagar, subir y bajar el canal, subir y bajar
el volumen, y volver al canal antes seleccionado */

package Trabajo.tp2;

public class Televisor {
//atributos
    private String modelo;
    private Boolean estado;
    private int volumen;
    private int canal;
    private int historial;
    public Televisor (String modelo, Boolean estado, int volumen, int canal) {
        this.modelo = modelo;
        this.estado = estado;
        this.volumen = volumen;
        this.canal = canal; 
        this.historial = canal;
    }
    public String getModelo() {
        return this.modelo;
    }
    public Boolean getEstado(){
        return this.estado;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public int getCanal(){
        return this.canal;
    }



    public void setModelo(String M) {
        this.modelo = M; 
    }
    public void setEstado(Boolean E) {
        this.estado = E;
    } 
    public void setVolumen(int V){
        this.volumen = V;

    }
    public void setCanal(int C){
        this.canal = C;
    }

    public void setmodVolumen(int MV){
        int modVolumen = MV;
        if (modVolumen < 0){
            this.volumen = 0;

        }else{
            if (modVolumen > 10) {
                this.volumen = 10;
            } else {
                this.volumen = modVolumen;
            }
        }
    }
    public void setmodCanal(int MC){
        int modCanal = MC;
        if (modCanal < 1){ 
            this.canal = 1;

        } else {
            if (modCanal > 100) {
                this.canal = 100;
            }
        }

    }
    public void setHistorial(String condicion){
        if (condicion == "si") {
            this.canal = historial;
        }
    }
        
    
}
