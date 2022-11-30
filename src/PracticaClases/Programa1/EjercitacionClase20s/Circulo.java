package PracticaClases.Programa1.EjercitacionClase20s;

public class Circulo implements Figura{

    private Double radio;
    private final Double pi = 3.1416;

    @Override
    public Double calcularArea() {
        return this.radio * this.radio * this.pi;
    }

    public Double getRadio() {return radio;}

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getPi() {
        return pi;
    }


}




