import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Pendrive Kingston";
        productos[1] = "SSD Samsung";
        productos[2] = "Monitor AOC";
        productos[3] = "Cable VGA";
        productos[4] = "Router Linksys";
        productos[5] = "Laptop Acer";
        productos[6] = "Impresora Brother";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);
        System.out.println("prod6 = " + prod6);
        System.out.println("prod7 = " + prod7);


        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = Integer.parseInt("2");
        numeros[2] = 3;
        numeros[3] = 4;

        int a = numeros[0];
        int b = numeros[1];
        int c = numeros[2];
        int d = numeros[3];

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
