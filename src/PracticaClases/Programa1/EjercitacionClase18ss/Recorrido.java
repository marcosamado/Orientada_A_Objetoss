package PracticaClases.Programa1.EjercitacionClase18ss;

import java.util.ArrayList;

public class Recorrido {
    private String estacionDestino;
    private String estacionPartida;
    private ArrayList<String> estacionesPosibles = new ArrayList();

    public Recorrido(String estacionDestino, String estacionPartida){
        this.estacionDestino = estacionDestino;
        this.estacionPartida= estacionPartida;
    }

    public int cantVecesRecorrido(){
        return 0;
    }


    public String getEstacionDestino() {        return estacionDestino;
    }

    public String getEstacionPartida() {
        return estacionPartida;
    }

    public ArrayList<String> getEstacionesPosibles() {
        return estacionesPosibles;
    }

    public void setEstacionDestino(String estacionDestino) {
        this.estacionDestino = estacionDestino;
    }

    public void setEstacionPartida(String estacionPartida) {
        this.estacionPartida = estacionPartida;
    }

    public void setEstacionesPosibles(ArrayList<String> estacionesPosibles) {
        this.estacionesPosibles = estacionesPosibles;
    }
}
