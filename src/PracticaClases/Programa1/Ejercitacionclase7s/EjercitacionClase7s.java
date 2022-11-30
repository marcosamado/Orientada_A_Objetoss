package PracticaClases.Programa1.Ejercitacionclase7s;

import java.util.Date;

public class EjercitacionClase7s {
    public static void main(String[] args) {
        Revista revista1 = new Revista("Condorito", 1550,"semanal", 25.50);
        Revista revista2 = new Revista("Billiken", 1570,"mensual", 35.50);

        revista1.getEditorial().setNombre("REVISTIN");
        revista1.getEditorial().setDireccion("ADOLFO E DAVILA");

        revista1.getEdiciones().setNumero(15);
        revista1.getEdiciones().setFecha(new Date(200,10,10));
        revista1.getEdiciones().setPrecio(30.0);
        revista1.getEdiciones().setArticulos(new Articulo[]{new Articulo("Rigo se las manda otra vez", "perros", "Marcos Amado",
                new Date(115, 10, 13)), new Articulo ("Un avion se estrella", "Noticias", "Marcos", new Date(110,9,20))});

        System.out.println(revista1.toString());
        //Edicion edicion1 = new Edicion(13,new Date(100,5,10),25.50);
        //revista1.setEdicion(edicion1);


        //Articulo articulo1 = new Articulo("Rigo se las manda otra vez", "Perros", "Marcos Amado",new Date(115,10,13));
        //Articulo articulo2 = new Articulo("Otra vez Sopa", "Comidas", "Ricardito",new Date(110,7,22));
        //Articulo articulo3 = new Articulo("Avion explota", "Internacionales", "Mauricio cejas",new Date(113,2,11));
        //edicion1.setArticulos(new Articulo[]{articulo1,articulo2,articulo3});

    }
}
