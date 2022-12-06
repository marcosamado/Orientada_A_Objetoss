package PracticaClases.Programa1.EjercitacionFinal2;

public class DemoEmpresaPresupuestos {
    public static void main(String[] args) {
        EmpresaFactoryMethodSingleton creador = EmpresaFactoryMethodSingleton.obtenerInstancia();

        Simple mantenimiento = (Simple) creador.crearUnidadDeTrabajo("SIMPLE");
        mantenimiento.setNombre("Mantenimiento");
        mantenimiento.setCantidadDePersonas(4);
        mantenimiento.setMontoPorPersona(120000.00);
        mantenimiento.mostrarComponentes();


        Simple limpieza = (Simple) creador.crearUnidadDeTrabajo("SIMPLE");
        limpieza.setNombre("Limpieza");
        limpieza.setCantidadDePersonas(24);
        limpieza.setMontoPorPersona(100000);
        limpieza.calcularMonto();
        limpieza.mostrarComponentes();

        CombinadaComposite serviciosGenerales = (CombinadaComposite) creador.crearUnidadDeTrabajo("Combinada");
        serviciosGenerales.setNombre("Servicios Generales");
        serviciosGenerales.agregarUnidad(mantenimiento);
        serviciosGenerales.agregarUnidad(limpieza);
        serviciosGenerales.setCoeficienteGlobal(3);
        serviciosGenerales.calcularMonto();
        serviciosGenerales.mostrarComponentes();


    }
}
