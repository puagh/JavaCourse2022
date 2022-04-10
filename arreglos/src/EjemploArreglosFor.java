import java.util.Arrays;

public class EjemploArreglosFor {
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

        System.out.println("------------Usando for-------------");
        for(int i = 0; i < total; i++){
            System.out.println("products[i] = " + products[i]);
        }

        System.out.println("-----------usando foreach------------");
        for(String product: products){
            System.out.println("product = " + product);
        }

        System.out.println("------------Usando while--------------");
        int i = 0;
        while (i < total){
            System.out.println("products[i] = " + products[i]);
            i++;
        }

        System.out.println("------------Usando do-while--------------");
        int j = 0;
        do{
            System.out.println("products[j] = " + products[j]);
            j++;
        }while(j < total);


        int[] numeros = new int[10];

        for(int k = 0; k < numeros.length; k++){
            numeros[k] = k * 3;
        }
        
        for(int k = 0; k < numeros.length; k++){
            System.out.println("numeros[k] = " + numeros[k]);
        }




    }
}
