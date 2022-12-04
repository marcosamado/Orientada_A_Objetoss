package PracticaClases.Programa1.EjercitacionFinal;

public class InstitutoFactryMethodSingleton {

    private static InstitutoFactryMethodSingleton instancia;

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

    public String generarInforme(OfertaAcademica cursoOCarrera){
        return cursoOCarrera.toString();
    }

}
