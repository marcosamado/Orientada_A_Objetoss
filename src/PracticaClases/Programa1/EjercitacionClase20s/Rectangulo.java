package PracticaClases.Programa1.EjercitacionClase20s;

public class Rectangulo implements Figura{

    private Double altura;
    private Double largo;

    @Override
    public Double calcularArea() {
        return this.altura*this.largo;
    }

    public Double getAltura() {return altura;}

    public Double getLargo() {return largo;}

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
}
