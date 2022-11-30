package PracticaClases.Programa1.Ejercitacionclase13s;

public class ExamenFinal extends Examen implements Comparable<ExamenFinal> {
    private double notaOral;
    private String descripcionDelTemaDado;

    public ExamenFinal(String titulo, String enunciado) {
        super(titulo, enunciado);
    }


    @Override
    public boolean determinarEstadoDeAprobacion() {
        if(this.nota > 4 && this.notaOral > 4){
            return true;
        }
        return false;
    }
    @Override
    public int compareTo(ExamenFinal examen) {
        double promedio1 = (this.notaOral + this.nota)/ 2;
        double promedio2 = (examen.getNotaOral() + examen.getNota())/ 2;

        if (promedio1 > promedio2){
            return 1;
        }else if (promedio1 < promedio2){
            return 0;
        }
        return 0;
    }

    public double getNotaOral() {return notaOral;}

    public String getDescripcionDelTemaDado() {return descripcionDelTemaDado;}

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public void setDescripcionDelTemaDado(String descripcionDelTemaDado) {
        this.descripcionDelTemaDado = descripcionDelTemaDado;
    }


}
