package PracticaClases.Programa1.EjercitacionClase19sY20s;

import java.util.ArrayList;

public class Almacen {

    private ArrayList<Producto> productosAlmacenados = new ArrayList();



    public void agregarProductos(Producto producto){
        this.productosAlmacenados.add(producto);
    }

    public void quitarProducto(Producto producto){
        this.productosAlmacenados.remove(producto);
    }

    public double calcularEspacioNecesario(){
        double acumulador = 0.0;
        for (Producto x: this.productosAlmacenados) {
            acumulador += x.calcularEspacio();
        }
        return acumulador;
    }

    public ArrayList<Producto> getProductosAlmacenados() {return productosAlmacenados;}


}
