import java.util.Arrays;
import java.util.Collections;

public class EjemploArregloInversoFor {

    public static  void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        int total2 = arreglo.length;
        System.out.println("------------Usando for-------------");
        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }



    public static void main(String[] args) {

        String[] products = new String[7];

        int total = products.length;

        products[0] = "Pendrive Kingston";
        products[1] = "SSD Samsung";
        products[2] = "Monitor AOC";
        products[3] = "Cable VGA";
        products[4] = "Router Linksys";
        products[5] = "Laptop Acer";
        products[6] = "Impresora Brother";

        Arrays.sort(products);

        //arregloInverso(products);

        Collections.reverse(Arrays.asList(products));

        System.out.println("------------Usando for-------------");
        for(int i = 0; i < total; i++){
            System.out.println("products[i] = " + products[i]);
        }

    }
}
