package PracticaClases.Programa1.Ejercitacionclase7s;

import java.util.Date;

public class Edicion {
    private int numero;
    private Date fecha;
    private Double precio;
    private Articulo[] articulos;

    public Edicion() {
        this.numero = numero;
        this.fecha = fecha;
        this.precio = precio;
        this.articulos = new Articulo[10];
    }

    public int getNumero() {return numero;}
    public Date getFecha() {return fecha;}
    public Double getPrecio() {return precio;}
    public Articulo[] getArticulos() {return articulos;}


    public void setNumero(int numero) {this.numero = numero;}
    public void setFecha(Date fecha) {this.fecha = fecha;}
    public void setPrecio(Double precio) {this.precio = precio;}
    public void setArticulos(Articulo[] articulos) {this.articulos = articulos;}


}
