package PracticaClases.Programa1.Ejercitacionclase7s;

public class Revista {
    private String nombre;
    private int codigo;
    private String periodicidad;
    private Double precio;
    private Editorial editorial;
    private Edicion ediciones;

    public Revista(String nombre, int codigo, String periodicidad, Double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.periodicidad = periodicidad;
        this.precio = precio;
        this.ediciones = new Edicion();
        this.editorial = new Editorial();
    }

    public String getNombre() {return nombre;}
    public int getCodigo() {return codigo;}
    public String getPeriodicidad() {return periodicidad;}
    public Double getPrecio() {return precio;}
    public Editorial getEditorial() {return editorial;}
    public Edicion getEdiciones() {return ediciones;}


    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public void setPeriodicidad(String periodicidad) {this.periodicidad = periodicidad;}
    public void setPrecio(Double precio) {this.precio = precio;}
    public void setEditorial(Editorial editorial) {this.editorial = editorial;}
    public void setEdicion(Edicion ediciones) {this.ediciones = ediciones;}
}
