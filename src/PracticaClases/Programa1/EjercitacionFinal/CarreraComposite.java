package PracticaClases.Programa1.EjercitacionFinal;

import java.util.ArrayList;

public class CarreraComposite extends OfertaAcademica {

    private String nombre;
    private String descripcion;
    private double descuento;
    private ArrayList<OfertaAcademica> cursos = new ArrayList();

    @Override
    public double calcularPrecio() {
        double sumatoria = 0.0;
        for (OfertaAcademica curso: this.cursos) {
            sumatoria += curso.calcularPrecio();
        }
        return sumatoria - ((sumatoria*this.descuento)/100);
    }

    @Override
    public String toString() {
        return "Curso: " + this.nombre +
                " y su precio es: " + this.calcularPrecio();
    }

    public void agregarCurso(OfertaAcademica curso){
        this.cursos.add(curso);
    }

    public void quitarCurso(OfertaAcademica curso){
        this.cursos.remove(curso);
    }

    public double getDescuento() {return descuento;}

    public String getNombre() {return nombre;}

    public String getDescripcion() {return descripcion;}

    public ArrayList<OfertaAcademica> getCursos() {return cursos;}

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
