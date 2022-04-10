import java.util.Scanner;

public class HWArreglos4 {
    /*
    * Para la tarea se debe crear un arreglo con 10 elementos
    * (enteros en el rango de 1 a 9).
    * Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y
    * también imprimir la cantidad de veces que aparece en el arreglo.

    Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

    Como resultado debería imprimir lo siguiente:
            La mayor ocurrencias es: 3
            El elemento que más se repite es: 5
    */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] elementos = new int[10];
        int ocurrenciaMayor = 0, posicionMayor = 0, countUnico = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese un número (entre 1 y 9): ");
            numeros[i] = scanner.nextInt();
        }

        for(int i = 0; i < 10; i++){
            boolean encontrado = false;
            for(int k = 0; k < 10 ; k++){
                if(numeros[i] == elementos[k]){
                    encontrado = true;
                }
            }
            if(!encontrado){
                elementos[countUnico++] = numeros[i];
            } else{
                continue;
            }
        }

        int[] ocurrencias = new int[countUnico];

        for(int i = 0; i < countUnico; i++){
            int ocurrenciaActual = 0;
            for(int j = 0; j < 10; j ++){
                if (elementos[i] == numeros[j]){
                    ocurrenciaActual++;
                }
            }
            ocurrencias[i] = ocurrenciaActual;
        }

        for(int i = 0; i < ocurrencias.length; i++){
            ocurrenciaMayor = Math.max(ocurrenciaMayor, ocurrencias[i]);
        }

        for (int i = 0; i < ocurrencias.length; i++){
            if(ocurrencias[i] == ocurrenciaMayor){
                posicionMayor = i;
            }
        }
        System.out.println("La mayor ocurrencias es: " + ocurrenciaMayor);
        System.out.println("El elemento que más se repite es: " + elementos[posicionMayor]);
    }
}
