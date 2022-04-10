import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;
        a = new int[10];
        int totalPares = 0, totalImpares = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese números enteros: ");
        for(int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                totalPares++;
            } else{
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];
        int accPares = 0, accImpares = 0;


        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                pares[accPares++] = a[i];
            } else{
                impares[accImpares++] = a[i];
            }
        }

        if(pares.length > 0){
            System.out.println("\nArreglo pares: ");
            for(int i = 0; i < pares.length; i++){
                System.out.print(pares[i] + " ");
            }
        }

        if(impares.length > 0){
            System.out.println("\nArreglo impares: ");
            for(int i = 0; i < impares.length; i++){
                System.out.print(impares[i] + " ");
            }
        }






    }
}
