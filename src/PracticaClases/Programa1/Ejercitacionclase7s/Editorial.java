package PracticaClases.Programa1.Ejercitacionclase7s;

public class Editorial {
    private String nombre;
    private String direccion;
    private Revista[] revistas;

    public Editorial() {

    }
    public Editorial(String nombre, String direccion){
            this.nombre = nombre;
            this.direccion = direccion;
            this.revistas = new Revista[10];
    }

    public String getNombre() {return nombre;}
    public String getDireccion() {return direccion;}


    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
}
