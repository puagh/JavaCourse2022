import java.util.InputMismatchException;
import java.util.Scanner;

public class HwFlujosDeControl3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entradaNumero1 = 0, entradaNumero2 = 0, resultado = 0, numero1, numero2;
        boolean resultadoNegativo = false;
        String mensaje = "";

        try{
            System.out.println("Ingrese el primer número a multiplicar");
            entradaNumero1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número a multiplicar");
            entradaNumero2 = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Solo se pueden ingresar números enteros");
            main(args);
            System.exit(0);
        }

        if(entradaNumero1 == 0 || entradaNumero2 == 0){
            System.out.println("La multiplicación de: " + entradaNumero1 + " x " + entradaNumero2 + " = " + resultado);
            System.exit(0);
        }

        if(entradaNumero1 < 0 || entradaNumero2 < 0){
            resultadoNegativo = entradaNumero1 > 0 || entradaNumero2 > 0;
            numero1 = entradaNumero1 < 0 ? -(entradaNumero1) : entradaNumero1;
            numero2 = entradaNumero2 < 0 ? -(entradaNumero2) : entradaNumero2;
        } else{
            numero1 = entradaNumero1;
            numero2 = entradaNumero2;
        }

        if(numero1 > numero2){
            //Iterar el 1 sobre el 2
            for(int i = 1; i <= numero2; i++){
                resultado += numero1;
            }
        } else{
            //Iterar el 2 sobre el 1
            for(int i = 1; i <= numero2; i++){
                resultado += numero1;
            }
        }

        if(resultadoNegativo){
            resultado = -(resultado);
        }

        mensaje += ("La multiplicación de: " + entradaNumero1 + " x " + entradaNumero2 + " = " + resultado);
        System.out.println("mensaje = " + mensaje);

    }
}
