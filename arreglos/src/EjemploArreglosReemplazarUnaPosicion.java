import java.util.Scanner;

public class EjemploArreglosReemplazarUnaPosicion {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los valores del arreglo: ");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Ingrese el número que desea ingresar al arreglo");
        int cambio = scanner.nextInt();

        System.out.println("Ingrese la posición en la que desea insertarlo (0 - 9)");
        int posicion = scanner.nextInt();

        for(int i = numeros.length - 2; i >= posicion; i--){
            numeros[i + 1] = numeros[i];
        }

        numeros[posicion] = cambio;

        System.out.println("Los elementos del arreglo desplazados una posición: ");

        for(int i = 0; i < numeros.length; i++){
            System.out.println("numeros["+i+"] = " + numeros[i]);
        }

    }
}
