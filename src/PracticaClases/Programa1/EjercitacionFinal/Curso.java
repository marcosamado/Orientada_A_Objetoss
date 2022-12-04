package PracticaClases.Programa1.EjercitacionFinal;

public class Curso extends OfertaAcademica{

    private String nombre;
    private String descripcion;
    private int CargaHorariaMensual;
    private double mesesDeDuracion;
    private double valorPorHora;


    @Override
    public double calcularPrecio() {
        return this.CargaHorariaMensual*this.mesesDeDuracion*this.valorPorHora;
    }

    @Override
    public String toString() {
        return "Curso:" + this.nombre +
                ", tiene una carga horaria de: "+
                this.getCargaHorariaMensual() +
                " y una duración de: " +
                this.mesesDeDuracion +
                " Meses, con un precio de: " +
                this.valorPorHora + "por hora, " +
                "y un costo total de: " + this.calcularPrecio();
    }

    public String getNombre() {return nombre;}

    public String getDescripcion() {return descripcion;}

    public int getCargaHorariaMensual() {return CargaHorariaMensual;}

    public double getMesesDeDuracion() {return mesesDeDuracion;}

    public double getValorPorHora() {return valorPorHora;}


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCargaHorariaMensual(int cargaHorariaMensual) {
        CargaHorariaMensual = cargaHorariaMensual;
    }

    public void setMesesDeDuracion(double mesesDeDuracion) {
        this.mesesDeDuracion = mesesDeDuracion;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
