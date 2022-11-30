package PracticaClases.Programa1;

import java.util.Scanner;

public class EjercitacionClase3s {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador uno ingrese su nombre: ");
        String jugadorUno = scanner.nextLine();
        System.out.println("Jugador dos ingrese su nombre: ");
        String jugadorDos = scanner.nextLine();


        String jugadaUno = "";
        String jugadaDos = "";
        System.out.println(QuienGano(jugadaUno,jugadaDos));

    }
    public static String QuienGano(String jugadaUno, String jugadaDos){
        Scanner scanner = new Scanner(System.in);
        String ganador = "";
        int contadorUno = 0;
        int contadorDos = 0;
        while (!jugadaUno.equals("*")){
            System.out.println("Jugador uno ingrese su jugada: ");
            jugadaUno = scanner.nextLine();
            System.out.println("Jugador dos ingrese su jugada: ");
            jugadaDos = scanner.nextLine();
            if(jugadaUno.equals("piedra") && jugadaDos.equals("tijera") || jugadaUno.equals("papel") && jugadaDos.equals("piedra") || jugadaUno.equals("tijera") && jugadaDos.equals("papel")){
                contadorUno ++;
            }else if(jugadaDos.equals("piedra") && jugadaUno.equals("tijera") || jugadaDos.equals("papel") && jugadaUno.equals("piedra") || jugadaDos.equals("tijera") && jugadaUno.equals("papel")){
                contadorDos ++;
            }
        }
        if(contadorUno > contadorDos){
            ganador = "Gana el jugador Uno";
        }else if (contadorDos > contadorUno){
            ganador = "Gana el jugador Dos";
        }else {
            ganador = "Hubo un empate";
        }
        return ganador;
    }

    /*Desafío 1
    Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
    aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
    en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
    una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
    devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
    cuando el primero elije “*” como indicador de final. */


}
