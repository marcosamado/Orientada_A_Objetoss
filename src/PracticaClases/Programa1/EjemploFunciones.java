package PracticaClases.Programa1;

public class EjemploFunciones {
    public static void main(String[] args) {
        boolean resultado = esDivisible(5,5);
        System.out.println(resultado);
        int resultadoSuma = sumar(5,8);
        int resultadoResta = restar(12,7);
        int resultadoMulti=multiplicar(5,6);
        int resultadoDiv=dividir(5,5);
        System.out.println("la suma da: "+ resultadoSuma + " La resta da: " + resultadoResta+ " La multiplicacion da: "+ resultadoMulti+ " La divison Da: "+resultadoDiv);
    }

    public static boolean esDivisible(int n, int divisor) {
        if (n % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static int sumar(int num1, int num2){
        return num1+num2;
    }
    public static int restar(int num1, int num2){
        return num1-num2;
    }
    public static int multiplicar (int a, int b){
        return a*b;
    }
    public static int dividir (int a, int b){
        return a/b;
    }

}

