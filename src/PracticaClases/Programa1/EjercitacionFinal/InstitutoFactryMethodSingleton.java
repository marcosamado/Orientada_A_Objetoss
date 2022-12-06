package PracticaClases.Programa1.EjercitacionFinal;

import java.util.ArrayList;

public class InstitutoFactryMethodSingleton {

    private static InstitutoFactryMethodSingleton instancia;
    private ArrayList<OfertaAcademica> ofertasAcademicas = new ArrayList();

    private InstitutoFactryMethodSingleton(){};

    public static InstitutoFactryMethodSingleton obtenerInstancia(){
        if(InstitutoFactryMethodSingleton.instancia == null){
            InstitutoFactryMethodSingleton.instancia = new InstitutoFactryMethodSingleton();
        }
        return InstitutoFactryMethodSingleton.instancia;
    }

    public OfertaAcademica ofertaAcademica(String tipo){
        switch (tipo.toUpperCase()){
            case "CURSO":
                return new Curso();
            case "CARRERA":
                return new CarreraComposite();
        }
        return null;
    }

    public void agregarOfertaAcademica(OfertaAcademica cursoOCarrera){
        this.ofertasAcademicas.add(cursoOCarrera);
    }
    public void quitarOfertaAcademica(OfertaAcademica cursoOCarrera){
        this.ofertasAcademicas.remove(cursoOCarrera);
    }

    public void generarInforme(){
        for (OfertaAcademica x : this.ofertasAcademicas) {
            System.out.println("Nombre: " + x.getNombre());
            System.out.println("Costo: " + x.calcularPrecio());
        }
    }
}
