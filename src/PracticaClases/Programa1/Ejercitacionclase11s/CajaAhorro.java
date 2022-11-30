package PracticaClases.Programa1.Ejercitacionclase11s;

public class CajaAhorro extends Cuenta {

    private Double tasaInteres;


    public CajaAhorro(Double saldo, Double tasa) {
        super(saldo);
        this.tasaInteres = tasa;
    }


    public Double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(Double valor) {
        super.depositar(valor);
    }

    @Override
    public void extraer(Double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
        }else {
            System.out.println("Tu saldo es insuficiente");
        }
    }


}
