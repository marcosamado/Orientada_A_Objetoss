package PracticaClases.Programa1.EjercitacionClase20s;

public class Triangulo implements Figura{

    private Double base;
    private Double altura;

    @Override
    public Double calcularArea() {
        return (this.altura*this.base) / 2;
    }

    public Double getAltura() {return altura;}

    public Double getBase() {return base;}

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }
}
