package PracticaClases.Programa1.EjercitacionClase16s;

import java.util.Comparator;

public class Contenedor implements Comparable<Contenedor>, Comparator<Contenedor> {
    private int identificador;
    private String paisProcedencia;
    private boolean tieneMaterialPeligroso;

    public Contenedor(int identificador, String paisProcedencia, boolean tieneMaterialPeligroso){
        this.identificador = identificador;
        this.paisProcedencia = paisProcedencia;
        this.tieneMaterialPeligroso = tieneMaterialPeligroso;


    }
    public int getIdentificador() {return identificador;}

    public String getPaisProcedencia() {return paisProcedencia;}

    public boolean isTieneMaterialPeligroso() {return tieneMaterialPeligroso;}

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public void setTieneMaterialPeligroso(boolean tieneMaterialPeligroso) {
        this.tieneMaterialPeligroso = tieneMaterialPeligroso;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "identificador=" + identificador +
                ", paisProcedencia='" + paisProcedencia + '\'' +
                ", tieneMaterialPeligroso=" + tieneMaterialPeligroso +
                '}';
    }

    @Override
    public int compareTo(Contenedor contenedor) {
        if(this.identificador > contenedor.getIdentificador()){
            return 1;
        }else if (this.identificador < contenedor.getIdentificador()){
            return -1;
        }
        return 0;
    }

    @Override
    public int compare(Contenedor contenedor1, Contenedor contenedor2) {
        return contenedor1.compareTo(contenedor2);
    }
}
