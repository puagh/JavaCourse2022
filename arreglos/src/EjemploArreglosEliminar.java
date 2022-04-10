import java.util.Scanner;

public class EjemploArreglosEliminar {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }

        System.out.println("Elementos del arreglo números: ");

        for(int i = 0; i < numeros.length; i++){
            System.out.println("numeros["+ i + "] = " + numeros[i]);
        }

        System.out.print("Ingrese el valor del elemento que desea eliminar: ");
        int numEliminar = s.nextInt();
        int indiceEliminar = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == numEliminar){
                indiceEliminar = i;
            }
        }

        for(int i = indiceEliminar; i < numeros.length - 1; i++){
            numeros[i] = numeros[i + 1];
        }

        int[] numeros2 = new int[numeros.length - 1];

        System.arraycopy(numeros, 0, numeros2, 0, numeros2.length);

        System.out.println("--------------Elementos del arreglo números2---------------");

        for(int i = 0; i < numeros2.length; i++){
            System.out.println("numeros2["+ i + "] = " + numeros2[i]);
        }

    }
}
