public class EjemploArregloForOrdenamientoBurbuja {


    public static void sortBurbuja(Object[] arreglo){
        int contador = 0;
        for(int i = 0; i < arreglo.length - 1; i++){
            for(int j = 0; j < arreglo.length -1 - i; j++){
                if(((Comparable)arreglo[j]).compareTo(arreglo[j+1]) > 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
            }
            contador++;
        }
        System.out.println("contador = " + contador);
    }

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

        products[0] = "ZPendrive Kingston";
        products[1] = "SSD Samsung";
        products[2] = "Monitor AOC";
        products[3] = "Apple Cable VGA";
        products[4] = "Router Linksys";
        products[5] = "Laptop Acer";
        products[6] = "Impresora Brother";

        //Arrays.sort(products);
        //arregloInverso(products);
        //Collections.reverse(Arrays.asList(products));

        sortBurbuja(products);

        System.out.println("------------Usando for-------------");
        for(int i = 0; i < total; i++){
            System.out.println("products[i] = " + products[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 100;
        numeros[1] = Integer.parseInt("23");
        numeros[2] = -3;
        numeros[3] = 14;

        int a = numeros[0];
        int b = numeros[1];
        int c = numeros[2];
        int d = numeros[3];

        sortBurbuja(numeros);

        for (int numero :
                numeros) {
            System.out.println("numero = " + numero);
        }


    }
}
