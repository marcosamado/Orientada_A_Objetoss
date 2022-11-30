package PracticaClases.Programa1;

public class Arrays {
    public static void main(String[] args) {

        int arrayNumeros[] =  new int[5];
        arrayNumeros[0] = 25;
        arrayNumeros[1] = 10;
        arrayNumeros[2] = 23;
        arrayNumeros[3] = 7;
        arrayNumeros[4] = 12;
        int sumador = 0;
        for(int i = 0; i < arrayNumeros.length; i++){
            sumador += arrayNumeros[i];
        }
        System.out.println(sumador);
        int otroSumador = 0;
        for(int num : arrayNumeros){
            otroSumador+= num;
        }
        System.out.println(otroSumador);







    }

}
