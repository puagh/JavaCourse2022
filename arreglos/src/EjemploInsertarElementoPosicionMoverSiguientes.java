import java.util.Scanner;

public class EjemploInsertarElementoPosicionMoverSiguientes {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < nums.length; i++){
            nums[i] = i + 1;
        }

        System.out.println("------------ Impresión del arreglo nums -------------");
        for(int i = 0; i < nums.length; i++){
            System.out.println("nums["+i+"] = " + nums[i]);
        }
        System.out.println("------------------------------------------------------");

        System.out.print("ingrese el número a insertar: ");
        int insertar = s.nextInt();

        System.out.println("ingrese la posición en la que desea insertar el elemento");
        int posicion = s.nextInt();

        int aux = nums[nums.length -1];

        for(int i = nums.length - 2; i >= posicion; i--){
            nums[i + 1] = nums[i];
        }

        int[] numsComplemento = new int[nums.length + 1];

        System.arraycopy(nums, 0, numsComplemento, 0, nums.length);
        numsComplemento[posicion] = insertar;
        numsComplemento[numsComplemento.length - 1] = aux;

        System.out.println("------------------ Valores del arreglo -------------------");
        for(int i = 0; i < numsComplemento.length; i++){
            System.out.println("numsComplemento["+i+"] = " + numsComplemento[i]);
        }
    }
}
