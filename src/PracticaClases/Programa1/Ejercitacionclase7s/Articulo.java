package PracticaClases.Programa1.Ejercitacionclase7s;

import java.util.Date;

public class Articulo {
    private String titulo;
    private String tema;
    private String autor;
    private Date fecha;



    public Articulo(String titulo, String tema, String autor, Date fecha) {
        this.titulo = titulo;
        this.tema = tema;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getTitulo() {return titulo;}
    public String getTema() {return tema;}
    public String getAutor() {return autor;}
    public Date getFecha() {return fecha;}


    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setTema(String tema) {this.tema = tema;}
    public void setAutor(String autor) {this.autor = autor;}
    public void setFecha(Date fecha) {this.fecha = fecha;}
}
