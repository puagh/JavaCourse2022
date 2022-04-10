import java.util.Scanner;

public class HWArreglos3 {
    /*Leer 7 números por teclado para llenar un arreglo
    y a continuación calcular el promedio de los números positivos,
    el promedio de los negativos y contar el número de ceros.*/
    public static void main(String[] args) {
        double[] numbers = new double[7];
        int countPositive = 0, countNegative = 0, countCero = 0;
        double accPositive = 0, accNegative = 0;
        double promPositive, promNegative;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numbers.length; i++){
            System.out.print("Ingrese número al arreglo: ");
            numbers[i] = scanner.nextInt();
        }

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < 0){
                countNegative++;
                accNegative += numbers[i];
            } else if(numbers[i] == 0){
                countCero++;
            } else if(numbers[i] > 0){
                countPositive++;
                accPositive += numbers[i];
            }
        }

        promNegative = accNegative / countNegative;
        promPositive = accPositive / countPositive;

        System.out.println("Promedio de números positivos = " + promPositive);
        System.out.println("Promedio de números negativos = " + promNegative);
        System.out.println("Ceros en el arreglo = " + countCero);

    }
}
