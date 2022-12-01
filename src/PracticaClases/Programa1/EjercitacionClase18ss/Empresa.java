package PracticaClases.Programa1.EjercitacionClase18ss;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Reserva> reservas = new ArrayList();

    public Double recaudacionTotal(){
        return 0.00;
    };

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
}