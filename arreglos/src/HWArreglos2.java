import java.util.InputMismatchException;
import java.util.Scanner;

public class HWArreglos2 {
    /*
     * Escriba un programa que imprima el número más alto de un arreglo de 7 elementos
     * (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43},
     * si se repite un valor considerar uno solo.
     */
    public static void main(String[] args) {
        int[] numeros = new int[7];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++){
            System.out.print("("+(i+1)+"/"+numeros.length+")Ingrese un número entero entre 11 y 99: ");
            try{
                numeros[i] = s.nextInt();
            }catch (InputMismatchException e){
                System.err.println("\nSolo puede ingresar números enteros entre 11 y 99");
                main(args);
                System.exit(1);
            }
        }

        int mayor = 0;
        for(int i = 0; i < numeros.length; i++){
            mayor = mayor > numeros[i] ? mayor : numeros[i];
        }

        System.out.println("El número elemento mayor del arreglo es: " + mayor);
    }
}
