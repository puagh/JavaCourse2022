import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("ingrese un número: ");
            a[i] = scanner.nextInt();
        }

        System.out.print("\nIngrese el número a buscar: ");
        int numero = scanner.nextInt();

        int i = 0;
        while ( i < a.length && a[i] != numero ){
            i++;
        }

        if( i == a.length){
            System.out.println("No se encontró una coincidencia");
        }
        else if(numero == a[i]){
            System.out.println("Resultado encontrado en la posición: " + i);
        }

    }
}
