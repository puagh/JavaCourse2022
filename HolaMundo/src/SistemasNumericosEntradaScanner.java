import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numeroDecimal = 0;
        try{
            numeroDecimal = entrada.nextInt();
        } catch(Exception e){
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }
        String conversionBinaria = "Convertido en binario = "+ Integer.toBinaryString(numeroDecimal);
        String conversionOctal = "Convertido en octal" + " = " + Integer.toOctalString(numeroDecimal);
        String conversionHexadecimal = "Convertido en hexadecimal" + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = "Número base = " + numeroDecimal;
        mensaje += "\n"+ conversionBinaria;
        mensaje += "\n"+ conversionOctal;
        mensaje += "\n" + conversionHexadecimal;

        System.out.println(mensaje);
    }
}
