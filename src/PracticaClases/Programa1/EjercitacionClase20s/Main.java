package PracticaClases.Programa1.EjercitacionClase20s;

public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.setAltura(5.0);
        rectangulo1.setLargo(4.0);
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(1.0);
        Circulo circulo2 = new Circulo();
        circulo2.setRadio(1.0);
        Circulo circulo3 = new Circulo();
        circulo3.setRadio(1.0);
        TrencitoComposite vagon1 = new TrencitoComposite();
        vagon1.agregarFigura(rectangulo1);
        vagon1.agregarFigura(circulo1);
        vagon1.agregarFigura(circulo2);
        vagon1.agregarFigura(circulo3);



        System.out.println("el area total es: " + vagon1.calcularArea());

    }
}
