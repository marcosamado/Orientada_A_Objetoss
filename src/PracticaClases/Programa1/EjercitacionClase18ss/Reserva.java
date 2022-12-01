package PracticaClases.Programa1.EjercitacionClase18ss;

public class Reserva {
    private int codigo;
    private Recorrido recorrido;
    private int cantDePersonasQueViajan;

    public Reserva(int codigo, Recorrido recorrido, int cantDePersonasQueViajan) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantDePersonasQueViajan = cantDePersonasQueViajan;

    }
    public Double calcularPrecioDeReserva(){
        double total= this.cantDePersonasQueViajan*50;
        if (this.recorrido.getEstacionPartida()=="Buenos Aires" && this.getRecorrido().getEstacionDestino()=="Belgrano"||this.recorrido.getEstacionPartida()=="Belgrano" && this.getRecorrido().getEstacionDestino()=="Buenos Aires"){
            return total- (total*0.20);
        }
        return total;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public int getCantDePersonasQueViajan() {
        return cantDePersonasQueViajan;
    }

    public void setCantDePersonasQueViajan(int cantDePersonasQueViajan) {
        this.cantDePersonasQueViajan = cantDePersonasQueViajan;
    }
}