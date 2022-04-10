import java.util.InputMismatchException;
import java.util.Scanner;

public class HWMatrices2 {
    /*Escribir un programa para una matriz de n x n
    e imprima en ella una silla (o letra h minúscula)
    construida a base del numero 1 y utilizar el numero
    0 como espacio. El tamaño de la silla se basa en una variable n
    que indicará el tamaño de la figura a imprimir en una matriz de n x n.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese el tamaño que desea para la matriz de n x n: ");
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException e){
            System.err.println("Solo debe ingresar números enteros");
            System.exit(1);
            main(args);
        }
        if(n == 0){
            System.err.println("Error");
            System.exit(1);
        }

        int[][] matriz = new int[n][n];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if( j == 0 || i == (n/2) || (i > (n/2) && j == matriz.length - 1)){
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
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
