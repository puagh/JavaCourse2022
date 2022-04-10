import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[7];
        System.out.println("Ingrese 7 números: ");
        for(int i = 0; i < a.length ; i++){
            a[i] = scanner.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for(int i = 0; i < (a.length-1) ; i++){
            if(a[i] > a[i+1]){
                descendente = true;
            }
            if(a[i] < a[i+1]){
                ascendente = true;
            }
        }

        if(ascendente && descendente){
            System.out.println("El arreglo está desordenado");
        }

        if(ascendente && !descendente){
            System.out.println("El arreglo está ordenado en forma ascendente");
        }

        if(descendente && !ascendente){
            System.out.println("El arreglo está ordenado en forma descendente");
        }

    }
}
