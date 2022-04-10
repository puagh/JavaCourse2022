import javax.swing.*;

public class HwOperadores1 {
    public static void main(String[] args) {
        //El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
        Float number1 = 0.0f;
        Float number2 = 0.0f;

        try{
            number1 = Float.valueOf(JOptionPane.showInputDialog("Ingrese el primer número"));
            number2 = Float.valueOf(JOptionPane.showInputDialog("Ingrese el segundo número"));
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Por favor ingrese solo números");
            main(args);
            System.exit(0);
        }

        StringBuilder message = new StringBuilder("Ordenados de mayor a menor: \n");
        if(number1 > number2){
            message.append(number1).append("\n").append(number2);
        } else if (number2 > number1){
            message.append(number2).append("\n").append(number1);
        } else{
            message = new StringBuilder("Los dos números son iguales");
        }
        JOptionPane.showMessageDialog(null, message.toString());
    }
}
