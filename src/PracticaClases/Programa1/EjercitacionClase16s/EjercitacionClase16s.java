package PracticaClases.Programa1.EjercitacionClase16s;

import java.util.Collection;
import java.util.Collections;

public class EjercitacionClase16s {
    public static void main(String[] args) {
            Puerto puerto1 = new Puerto();
            Contenedor contenedor1 = new Contenedor(1,"Brasil",false);
            Contenedor contenedor2 = new Contenedor(4,"Argentina",false);
            Contenedor contenedor3 = new Contenedor(3,"China",true);
            Contenedor contenedor4 = new Contenedor(5,"Desconocido",true);
            Contenedor contenedor5 = new Contenedor(2,"Canada",false);

            puerto1.agregarContenedor(contenedor1);
            puerto1.agregarContenedor(contenedor2);
            puerto1.agregarContenedor(contenedor3);
            puerto1.agregarContenedor(contenedor4);
            puerto1.agregarContenedor(contenedor5);

            System.out.println("Puertos Ordenados");
            Collections.sort(puerto1.getContenedores());

            System.out.println(puerto1.toString());

            System.out.println(puerto1.calcularCantidadContenedorPeligroso());
    }
}
