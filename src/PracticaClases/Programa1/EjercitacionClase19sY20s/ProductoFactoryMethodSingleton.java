package PracticaClases.Programa1.EjercitacionClase19sY20s;

public class ProductoFactoryMethodSingleton {

    private static ProductoFactoryMethodSingleton instancia;

    private ProductoFactoryMethodSingleton(){};

    public static ProductoFactoryMethodSingleton obtenerInstancia(){
        if(ProductoFactoryMethodSingleton.instancia == null){
            ProductoFactoryMethodSingleton.instancia = new ProductoFactoryMethodSingleton();
        }
        return ProductoFactoryMethodSingleton.instancia;
    }

    public Producto crearProducto (String tipo){
        switch (tipo.toUpperCase()){
            case "CAJA":
                return new Caja();
            case "MONIO":
                return new Monio();
            case "PAPEL DE REGALO":
                return new PapelDeRegalo();
            case "PELOTA":
                return new Pelota();
        }
        return null;
    }

}
