package PracticaClases.Programa1.Ejercitacionclase11s;

public class Clientes {

    private int numero;
    private String apellido;
    private int dni;
    private String cuit;
    private Cuenta cuenta;

    public Clientes(){ };

    public Clientes(int numero, String apellido, int dni, String cuit) {
        this.numero = numero;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;

    }

    public int getNumero() {
        return numero;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getCuit() {
        return cuit;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
