import java.util.Scanner;

public class HwFlujosDeControl1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float mayor = 0.0f;
        int cantidadNumeros = 0;

        System.out.println("Ingresa la cantidad de números para buscar, mínimo 10");
        try{
            cantidadNumeros = Integer.parseInt(scanner.nextLine());
            if(cantidadNumeros < 10){
                System.out.println("Debe ingresar una cantidad mayor a 10 números");
                main(args);
                System.exit(0);
            }
        } catch (NumberFormatException e){
            System.out.println("Solo puede ingresar números enteros");
            main(args);
            System.exit(0);
        }

        float[] arregloNumeros = new float[cantidadNumeros];

        for(int i = 0; i < cantidadNumeros ; i++){
            System.out.print("Agregue el elemento " + (i + 1) + " = ");

            try{
                arregloNumeros[i] = Float.parseFloat(scanner.nextLine());
            } catch(NumberFormatException e){
                System.out.println("Solo puede ingresar números");
                main(args);
                System.exit(0);
            }
        }

        for (float numero: arregloNumeros) {
            mayor = mayor > numero ? mayor : numero;
        }

        System.out.println("El número mayor es = " + mayor);
    }
}
