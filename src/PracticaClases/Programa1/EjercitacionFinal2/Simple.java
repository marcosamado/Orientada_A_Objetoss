package PracticaClases.Programa1.EjercitacionFinal2;

public class Simple extends UnidadDeTrabajo{

    private double montoPorPersona;
    private int cantidadDePersonas;



    @Override
    public double calcularMonto() {
        if(this.cantidadDePersonas > 10){
            return (this.montoPorPersona*this.cantidadDePersonas)+(this.montoPorPersona*this.cantidadDePersonas)*0.20;
        }
        return this.montoPorPersona*this.cantidadDePersonas;
    }

    @Override
    public void mostrarComponentes() {
        System.out.println("El nombre es: " + this.getNombre() + " y el Monto es: " + this.calcularMonto());
    }

    public double getMontoPorPersona() {
        return montoPorPersona;
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setMontoPorPersona(double montoPorPersona) {
        this.montoPorPersona = montoPorPersona;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }
}
