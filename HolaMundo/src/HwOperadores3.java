import javax.swing.*;

public class HwOperadores3 {
    public static void main(String[] args) {
        String persona1 = JOptionPane.showInputDialog("Ingrese nombre y apellido de la persona").trim();
        String persona2 = JOptionPane.showInputDialog("Ingrese nombre y apellido de la persona").trim();
        String persona3 = JOptionPane.showInputDialog("Ingrese nombre y apellido de la persona").trim();

        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;

        System.out.println("La persona con el nombre mas largo es " + max);
        JOptionPane.showMessageDialog(null, max + " tiene el nombre más largo");


    }
}
