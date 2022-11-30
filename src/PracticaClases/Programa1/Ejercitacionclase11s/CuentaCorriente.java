package PracticaClases.Programa1.Ejercitacionclase11s;

public class CuentaCorriente extends Cuenta{

    private Double giroDescubierto;

    public CuentaCorriente(Double saldo, Double descubierto) {
        super(saldo);
        this.giroDescubierto = descubierto;

    }
    @Override
    public void extraer(Double valor){
        if(valor <= this.giroDescubierto+this.saldo){
            this.saldo -= valor;
        }
    }
}
