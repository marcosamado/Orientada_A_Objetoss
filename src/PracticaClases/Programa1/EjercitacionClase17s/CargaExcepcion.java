package PracticaClases.Programa1.EjercitacionClase17s;

public class CargaExcepcion extends Exception {


    public CargaExcepcion(String msj){
        super(msj);
    }
    public CargaExcepcion(){
        super("fecha de alta incorrecta");
    }
}
