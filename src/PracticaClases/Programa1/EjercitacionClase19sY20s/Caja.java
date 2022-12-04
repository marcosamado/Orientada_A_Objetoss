package PracticaClases.Programa1.EjercitacionClase19sY20s;

public class Caja extends Producto{

    private double peso;
    private double longitud;
    private double ancho;
    private double altura;

    @Override
    public double calcularEspacio() {
        return this.longitud*this.ancho*this.altura;
    }

    public double getPeso(){return this.peso;}

    public double getLongitud() {return longitud;}

    public double getAncho() {return ancho;}

    public double getAltura() {return altura;}

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
