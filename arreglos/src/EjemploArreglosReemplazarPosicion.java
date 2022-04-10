import java.util.Scanner;

public class EjemploArreglosReemplazarPosicion {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int ultimo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los valores del arreglo: ");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }

        ultimo = numeros[numeros.length -1];

        for(int i = numeros.length - 2; i >= 0; i--){
            numeros[i + 1] = numeros[i];
        }

        numeros[0] = ultimo;

        System.out.println("Los elementos del arreglo desplazados una posición: ");

        for(int i = 0; i < numeros.length; i++){
            System.out.println("numeros["+i+"] = " + numeros[i]);
        }



        /*
        * 0 1   10
        * 1 2   1
        * 2 3   2
        * 3 4   3
        * 4 5   4
        * 5 6   5
        * 6 7   6
        * 7 8   7
        * 8 9 * 8
        * 9 10  9
        * */
    }
}
