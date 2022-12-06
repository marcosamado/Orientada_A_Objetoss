package PracticaClases.Programa1.EjercitacionFinal2;

import java.util.ArrayList;

public class CombinadaComposite extends UnidadDeTrabajo{


    private ArrayList<UnidadDeTrabajo> unidadesDeTrabajo = new ArrayList();
    private double coeficienteGlobal;
    private double montoDeMaterial;



    @Override
    public double calcularMonto() {
        double acumulador = 0.0;
        for (UnidadDeTrabajo unidad : this.unidadesDeTrabajo) {
            acumulador += unidad.calcularMonto();
        }
        return acumulador*this.coeficienteGlobal;
    }

    @Override
    public void mostrarComponentes() {
        System.out.println("El nombre es: " + this.getNombre() + " y el Monto es: " + this.calcularMonto());
    }

    public void agregarUnidad(UnidadDeTrabajo unidad){
        this.unidadesDeTrabajo.add(unidad);
    }
    public void quitarUnidad(UnidadDeTrabajo unidad){
        this.unidadesDeTrabajo.remove(unidad);
    }



    public double getCoeficienteGlobal() {
        return coeficienteGlobal;
    }

    public double getMontoDeMaterial() {
        return montoDeMaterial;
    }

    public void setCoeficienteGlobal(double coeficienteGlobal) {
        this.coeficienteGlobal = coeficienteGlobal;
    }

    public void setMontoDeMaterial(double montoDeMaterial) {
        this.montoDeMaterial = montoDeMaterial;
    }
}
