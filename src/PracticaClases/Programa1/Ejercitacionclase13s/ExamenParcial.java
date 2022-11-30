package PracticaClases.Programa1.Ejercitacionclase13s;

public class ExamenParcial extends Examen{
    private int numeroDeUnidad;
    private int numeroDeIntentos;


    public ExamenParcial(String titulo, String enunciado) {
        super(titulo, enunciado);

    }
    public boolean determinarSiPuedeRecuperar(){
        if(this.numeroDeUnidad <= 3 && this.numeroDeIntentos <= 3){
            return true;
        }
        return false;
    }

    @Override
    public boolean determinarEstadoDeAprobacion() {
        if(this.nota > 4){
            return true;
        }
        return false;
    }

    public int getNumeroDeUnidad() {return numeroDeUnidad;}

    public int getNumeroDeIntentos() {return numeroDeIntentos;}

    public void setNumeroDeUnidad(int numeroDeUnidad) {
        this.numeroDeUnidad = numeroDeUnidad;
    }

    public void setNumeroDeIntentos(int numeroDeIntentos) {
        this.numeroDeIntentos = numeroDeIntentos;
    }

}
