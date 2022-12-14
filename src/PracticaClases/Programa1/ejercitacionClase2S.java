package PracticaClases.Programa1;

public class ejercitacionClase2S {
    public static void main(String[] args) {
        /* Ejercicio 1
        Hacer una función que dado un número indica si es un número primo o no. Un número
        primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
                ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por
        17.
        Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
        función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
        obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int
        divisor)*/

        boolean resultado=esPrimo(2);
        System.out.println(resultado);

        int resultadoNumeros = maximoEntreTres(5,3,8);
        System.out.println("el mayor num es: " + resultadoNumeros);

        boolean textoDistinto = cadenasDeTextoDistintas("Rigo", "Rigo");
        System.out.println(textoDistinto);

    }
    public static boolean esPrimo(int numero){
        int cont=0;
        for (int i=1;i<=numero; i++){
            if(numero % i == 0){
                cont++;
            }
        }
        if (cont==2){
            return true;
        }else{
            return false;
        }
    }
    /*Ejercicio 2
    Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
            Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
            unNumeroC)
    Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
    el resultado.*/

    public static Integer maximoEntreTres(Integer a, Integer b, Integer c){
        if(a > b && a > c){
            return a;
        }else if (b > a && b > c){
            return b;
        }else {
            return c;
        }
    }
    /*Ejercicio 3
    Escribir una función:
    boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
    que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
    false, en caso de que coincidan.*/

    public static boolean cadenasDeTextoDistintas(String textoA, String textoB) {
        if (textoA == textoB)
            return false;
        else {
            return true;
        }
    }

}
