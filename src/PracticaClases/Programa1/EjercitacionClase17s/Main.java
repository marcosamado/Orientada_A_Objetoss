package PracticaClases.Programa1.EjercitacionClase17s;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Paciente paciente= null;
        try {
            paciente = new Paciente("Juan","Perez","12345",33002495,new Date(122,10,25),new Date(122,10,24));
        } catch (CargaExcepcion e) {
            System.out.println(e.getMessage());
        }


    }
}
