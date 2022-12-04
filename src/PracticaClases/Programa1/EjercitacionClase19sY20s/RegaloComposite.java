package PracticaClases.Programa1.EjercitacionClase19sY20s;

import java.util.ArrayList;

public class RegaloComposite extends Producto{

    private double peso;
    private ArrayList<Producto> productos = new ArrayList();

    @Override
    public double calcularEspacio() {
        double acumulador = 0.0;
        for (Producto x: this.productos) {
            acumulador += x.calcularEspacio();
        }
        return acumulador;
    }

    public void agregarProductos(Producto producto){
        this.productos.add(producto);
    }

    public void quitarProductos(Producto producto){
        this.productos.remove(producto);
    }

    public double getPeso() {
        return this.getPeso();
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
