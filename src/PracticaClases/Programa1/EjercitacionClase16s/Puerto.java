package PracticaClases.Programa1.EjercitacionClase16s;

import java.util.ArrayList;

public class Puerto {
    private ArrayList<Contenedor> contenedores = new ArrayList();


    public void agregarContenedor(Contenedor contenedor){
        this.contenedores.add(contenedor);
    }

    public ArrayList<Contenedor> getContenedores() {return contenedores;}

    public void setContenedores(ArrayList<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }

    public int calcularCantidadContenedorPeligroso (){
        int acc = 0;
        for (Contenedor contenedor : contenedores) {
            if(contenedor.isTieneMaterialPeligroso()){
                acc++;
            }
        }
        return acc;
    }

    @Override
    public String toString() {
        return "Puerto{" +
                "contenedores=" + contenedores +
                '}';
    }
}
