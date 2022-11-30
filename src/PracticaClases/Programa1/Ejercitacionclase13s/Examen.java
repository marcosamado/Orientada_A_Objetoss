package PracticaClases.Programa1.Ejercitacionclase13s;

public abstract class Examen {
    protected String titulo;
    protected String enunciado;
    protected double nota;
    protected Estudiante estudiante;

    public Examen(String titulo, String enunciado) {
        this.titulo = titulo;
        this.enunciado = enunciado;
    }

    public abstract boolean determinarEstadoDeAprobacion();

    public String getTitulo() {return titulo;}

    public String getEnunciado() {return enunciado;}

    public double getNota() {return nota;}

    public Estudiante getEstudiante() {return estudiante;}

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
