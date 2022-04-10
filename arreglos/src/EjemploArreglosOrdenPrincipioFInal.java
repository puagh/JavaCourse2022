public class EjemploArreglosOrdenPrincipioFInal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] a = new int[10];

        for(int i = 0; i< numeros.length; i++){
            numeros[i] = i + 1;
        }

        for(int i = 0; i< numeros.length/2; i++){
            a[i+i] = numeros[i];
            a[i+1+i] = numeros[numeros.length- 1 - i];
        }

        for(int i = 0; i< a.length; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }

        
    }
}
