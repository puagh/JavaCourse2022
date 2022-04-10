import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        int max = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tres números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max: num3;

        System.out.println("El número mayor es = " + max);
    }
}
