package PracticaClases.Programa1.EjercitacionFinal;

public class CrearOfertaAcademicaInexistenteException extends Exception{

    public CrearOfertaAcademicaInexistenteException() {
        super("La clase del objeto que intentas crear es inexistente");
    }

    public CrearOfertaAcademicaInexistenteException(String msj) {
        super(msj);
    }
}
