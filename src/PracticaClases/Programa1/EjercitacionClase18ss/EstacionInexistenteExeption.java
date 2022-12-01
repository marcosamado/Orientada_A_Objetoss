package PracticaClases.Programa1.EjercitacionClase18ss;

public class EstacionInexistenteExeption extends Exception{

    public EstacionInexistenteExeption(){
        super("ALTO ERROR GUACHO");
    }

    public EstacionInexistenteExeption(String message) {
        super(message);
    }
}

