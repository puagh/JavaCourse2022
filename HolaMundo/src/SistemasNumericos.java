import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String entradaNumero = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(entradaNumero);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
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

        JOptionPane.showMessageDialog(null, mensaje );
    }
}
