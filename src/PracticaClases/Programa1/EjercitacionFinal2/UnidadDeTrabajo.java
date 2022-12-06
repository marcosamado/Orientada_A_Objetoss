package PracticaClases.Programa1.EjercitacionFinal2;

public abstract class UnidadDeTrabajo {

    private String nombre;
    private String descripcion;

    public abstract double calcularMonto();

    public abstract void mostrarComponentes();

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
