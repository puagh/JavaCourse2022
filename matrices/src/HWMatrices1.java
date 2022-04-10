import java.util.InputMismatchException;
import java.util.Scanner;

public class HWMatrices1 {
    /*Escribir un programa que imprima una X construida a base
    de la letra X en las diagonales de la matriz y utilizar el carácter guion bajo
    como relleno.

    El tamaño de la x se basa en una variable n que indicará el tamaño
    de la letra para imprimir en una matriz de n x n.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese el tamaño que desea para imprimir la X: ");
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException e){
            System.err.println("Solo debe ingresar números");
            System.exit(1);
            main(args);
        }
        if(n == 0){
            System.err.println("Error");
            System.exit(1);
        }

        String[][] matriz = new String[n][n];

        int aux = n - 1;
        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[i].length; j++) {
                if (j == i && j != aux) {
                    matriz[i][j] = "X";
                }
                else if(j == aux){
                    matriz[i][j] = "X";
                    aux--;
                }
                else{
                    matriz[i][j] = "_";
                }

            }
        }

        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[i].length; j++){
                    System.out.print(matriz[i][j]);
            }
            System.out.println();
        }


    }
}
