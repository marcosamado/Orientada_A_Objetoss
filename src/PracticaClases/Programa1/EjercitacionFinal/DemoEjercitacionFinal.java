package PracticaClases.Programa1.EjercitacionFinal;

public class DemoEjercitacionFinal {
    public static void main(String[] args) {

        InstitutoFactryMethodSingleton insitutoGeneral = InstitutoFactryMethodSingleton.obtenerInstancia();
        Curso frontEnd = (Curso) insitutoGeneral.ofertaAcademica("Curso");
        frontEnd.setNombre("Front End");
        frontEnd.setDescripcion("curso a distancia de front end");
        frontEnd.setCargaHorariaMensual(16);
        frontEnd.setMesesDeDuracion(2);
        frontEnd.setValorPorHora(900);
        frontEnd.calcularPrecio();
        System.out.println(frontEnd.toString());

        Curso backEnd = (Curso) insitutoGeneral.ofertaAcademica("Curso");
        backEnd.setNombre("Back End");
        backEnd.setDescripcion("curso a distancia de back end");
        backEnd.setCargaHorariaMensual(20);
        backEnd.setMesesDeDuracion(2);
        backEnd.setValorPorHora(1000);
        backEnd.calcularPrecio();
        System.out.println(backEnd.toString());

        CarreraComposite carreraFullStack = (CarreraComposite) insitutoGeneral.ofertaAcademica("Carrera");
        carreraFullStack.setNombre("Carrera Full Stack");
        carreraFullStack.setDescripcion("carrea a distancia de Full Stack");
        carreraFullStack.agregarCurso(frontEnd);
        carreraFullStack.agregarCurso(backEnd);
        carreraFullStack.setDescuento(20.00);
        System.out.println(carreraFullStack.calcularPrecio());

        System.out.println(insitutoGeneral.generarInforme(frontEnd));
        System.out.println(insitutoGeneral.generarInforme(carreraFullStack));
    }
}
