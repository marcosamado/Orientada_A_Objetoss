package PracticaClases.Programa1.Ejercitacionclase5;

public class UsuarioJuego {

        private String nombre;
        private String  clave;
        private Double puntaje = 0.0;
        private int  nivel = 0;

        public UsuarioJuego(String nombre, String clave){
                this.nombre = nombre;
                this.clave = clave;
        }

        public void aumentarPuntaje(){
                this.puntaje ++;
        }
        public void subirNivel(){
                this.nivel ++;
        }

        public void bonus(int valor){
                this.puntaje += valor;
        }

        public Double getPuntaje() {
                return puntaje;
        }

        public int getNivel() {
                return nivel;
        }

}
