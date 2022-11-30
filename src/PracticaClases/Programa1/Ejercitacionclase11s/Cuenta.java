package PracticaClases.Programa1.Ejercitacionclase11s;

public abstract class Cuenta {

    protected Double saldo;
    private Clientes cliente;

    public Cuenta(Double saldo) {
        this.saldo = saldo;
        this.cliente = new Clientes();

    }


    public Double getSaldo() {
        return saldo;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    };

    public abstract void extraer(Double valor);
}

