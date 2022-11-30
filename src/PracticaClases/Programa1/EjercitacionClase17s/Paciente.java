package PracticaClases.Programa1.EjercitacionClase17s;

import java.util.Date;

public class Paciente {
    private String nombre;
    private String apellido;
    private String historiaClinica;
    private int dni;
    private Date fechaInternacion;
    private Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica,int dni,Date fechaAlta, Date fechaInternacion) throws CargaExcepcion{
        Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        this.historiaClinica = historiaClinica;
        this.dni = dni;
        this.fechaAlta= fechaAlta;
        //if (fechaInternacion.before(hoy))
            this.fechaInternacion=fechaInternacion;
        if (this.fechaInternacion.after(hoy) || this.fechaAlta.before(this.fechaInternacion)){
            throw new CargaExcepcion("Fecha de alta o De internacion incorrecta");
        }
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta)
    {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else
            System.out.println("No se puede");
    }



}
