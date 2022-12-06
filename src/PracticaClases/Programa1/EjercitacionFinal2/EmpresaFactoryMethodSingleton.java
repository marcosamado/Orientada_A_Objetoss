package PracticaClases.Programa1.EjercitacionFinal2;

public class EmpresaFactoryMethodSingleton {

    private static EmpresaFactoryMethodSingleton instancia;

    private EmpresaFactoryMethodSingleton() {};

    public static EmpresaFactoryMethodSingleton obtenerInstancia(){
        if(EmpresaFactoryMethodSingleton.instancia == null){
            EmpresaFactoryMethodSingleton.instancia = new EmpresaFactoryMethodSingleton();
        }
        return EmpresaFactoryMethodSingleton.instancia;
    }

    public UnidadDeTrabajo crearUnidadDeTrabajo(String tipo){
        switch (tipo.toUpperCase()){
            case "SIMPLE":
                return new Simple();
            case "COMBINADA":
                return new CombinadaComposite();
        }
        return null;
    }
}
