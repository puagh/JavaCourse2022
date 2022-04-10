import java.util.Scanner;

public class HwClaseMath {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radio = 0;

        System.out.print("Ingrese el radio del círculo: ");
        try {
            radio = scanner.nextDouble();
        } catch (Exception e){
            System.err.println("Ingrese solo números " + e.getMessage() );
            System.exit(1);
        }
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del circulo con radio " + radio + " es = " + area);
    }
}
