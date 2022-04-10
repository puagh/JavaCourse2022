import java.util.Scanner;

public class HWArreglos1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese el elemento del arreglo: ");
            numeros[i] = s.nextInt();
        }

        for(int i = 0; i < numeros.length/2; i++){
            System.out.println(numeros[numeros.length -i - 1]);
            System.out.println(numeros[i]);
        }
    }
}
