package PracticaClases.Programa1.Ejercitacionclase11s;

public class Ejercitacionclase11s {
    public static void main(String[] args) {

        Clientes cliente1 = new Clientes(1520302, "Aciar", 3042132, "30-3042132-6");
        Clientes cliente2 = new Clientes(1520302, "Aciar", 3042132, "30-3042132-6");


        CajaAhorro caja1 = new CajaAhorro(1500.0,10.00);

        caja1.setCliente(cliente1);

        caja1.depositar(2000.00);


        System.out.println(caja1.getSaldo());


        caja1.extraer(2000.00);
        System.out.println(caja1.getSaldo());


        CuentaCorriente cuenta1 = new CuentaCorriente(4000.00,2000.00);

        cuenta1.extraer(5000.00);

        System.out.println(cuenta1);
    }
}
