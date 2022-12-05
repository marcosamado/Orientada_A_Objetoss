package PracticaClases.Programa1.EjercitacionFinal;

public abstract class OfertaAcademica {

    private String nombre;
    private String descripcion;

    public abstract double calcularPrecio();


    public String getNombre() {
        return nombre;
    }
}
