import java.util.Scanner;

public class EjemploOrdenarArregloAgregarElemento {

    public static void ordenAscendente(int[] arreglo){
        int aux;
        for(int j = 0; j < arreglo.length; j++){
            for(int i = 0; i < arreglo.length -1; i++){
                if(arreglo[i] >= arreglo[i+1]){
                    aux = arreglo[i+1];
                    arreglo[i+1] = arreglo[i];
                    arreglo[i] = aux;
                }
            }
        }
        System.out.println("----------Arreglo ordenado -------------");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("numeros[i] = " + arreglo[i]);
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los elementos del arreglo (números enteros)");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }
        
        //ordenar forma decreciente
        ordenAscendente(numeros);

        System.out.println("Ingrese el número que desea insertar en el arreglo ordenado: ");
        int numero = scanner.nextInt();
        int indiceInsertar = 0;



        for(int i = 0; i < numeros.length -1; i++){
            if(numeros[i] < numero && numero <= numeros[i+1]){
                indiceInsertar = i+1;
            } else if(numero > numeros[numeros.length -1]){
                indiceInsertar = numeros.length - 1;
            }
        }

        System.out.println("indiceInsertar = " + indiceInsertar);

        for(int i = numeros.length - 2; i >= indiceInsertar; i--){
            numeros[i + 1] = numeros[i];
        }

        numeros[indiceInsertar] = numero;

        System.out.println("----------Elemento insertado -------------");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("numeros["+i+"] = " + numeros[i]);
        }
    }
}
