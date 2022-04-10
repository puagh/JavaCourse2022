import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        
        int resta = i - j;
        System.out.println("resta = " + resta);

        int multi = i * j;
        System.out.println("multi = " + multi);

        float div = (float) i / j;
        System.out.println("div = " + div);
        
        int modulo = 5 % 2;
        System.out.println("modulo = " + modulo);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if (numero % 2 == 0){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }
    }
}
