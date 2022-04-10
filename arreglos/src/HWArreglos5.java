import java.util.Scanner;

public class HWArreglos5 {
    /*Escribir un programa que recorra un arreglo y genere un histograma
    en base a los valores de este.

    El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.

    Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento
    aparece en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números
    del 1 al 6, incluso si no están presente en el arreglo.*/
    public static void main(String[] args) {
        int[] numeros = new int[12];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese un número (entre 1 y 6): ");
            numeros[i] = scanner.nextInt();
        }

        for(int i = 0; i < 6; i++){
            int ocurrencia = 0;
            System.out.print("\n" + (i+1) + ": ");
            for(int j = 0; j < numeros.length; j++){
                if((i+1) == numeros[j]){
                    ocurrencia++;
                }
            }
            if(ocurrencia > 0){
                for(int j=0; j < ocurrencia; j++){
                    System.out.print("*");
                }
            }
        }
    }
}
