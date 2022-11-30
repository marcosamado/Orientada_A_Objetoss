package PracticaClases.Programa1.Ejercitacionclase5;

public class EjercitacionClase5s {
    public static void main(String[] args) {
        UsuarioJuego jugadorUno = new UsuarioJuego("Marcos","lala123");
        UsuarioJuego jugadorDos = new UsuarioJuego("Rigo","lolo321");
        System.out.println(jugadorUno);

        jugadorUno.aumentarPuntaje();


        jugadorUno.subirNivel();

        jugadorDos.bonus(20);

        System.out.println(jugadorDos.getPuntaje());

    }
}
