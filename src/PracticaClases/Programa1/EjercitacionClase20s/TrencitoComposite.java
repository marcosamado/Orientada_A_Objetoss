package PracticaClases.Programa1.EjercitacionClase20s;

import java.util.ArrayList;

public class TrencitoComposite implements Figura{

    ArrayList<Figura> figuras = new ArrayList();



        public void agregarFigura(Figura figura){
            this.figuras.add(figura);
        }

        public void quitarFigura(Figura figura){
            this.figuras.remove(figura);
        }
        @Override
    public Double calcularArea() {
        Double total = 0.0;
            for (Figura figuraActual : this.figuras) {
                total += figuraActual.calcularArea();
            }
            return total;
    }


    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }
}
