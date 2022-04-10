import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 números enteros: ");
        for (int i = 0; i < a.length; i ++){
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++){
            System.out.println("a["+i+"] = " + a[i]);
        }

        int max = 0;
        for(int i = 1; i < a.length; i ++){
            max = a[max] > a[i] ? max : i;
        }

        System.out.println("El número mas grande es = " + a[max]);
    }
}
