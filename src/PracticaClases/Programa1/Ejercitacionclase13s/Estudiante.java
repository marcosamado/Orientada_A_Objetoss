package PracticaClases.Programa1.Ejercitacionclase13s;

public class Estudiante {
    private String apellido;
    private String nombre;
    private int legajo;
    private Examen[] examenes;

    public Estudiante(String apellido, String nombre, int legajo){
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getApellido() {return apellido;}

    public String getNombre() {return nombre;}

    public int getLegajo() {return legajo;}

    public Examen[] getExamenes() {return examenes;}

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setExamenes(Examen[] examenes) {
        this.examenes = examenes;
    }
}
