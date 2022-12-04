package PracticaClases.Programa1.EjercitacionClase19sY20s;

public class Pelota extends Producto{

    private double peso;
    private double radio;



    @Override
    public double calcularEspacio() {
        return (4/3)*(3.14)*this.radio;
    }

    public double getPeso() {return peso;}

    public double getRadio() {return radio;}

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
