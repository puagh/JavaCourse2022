import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {
        String[] a = new String[4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("ingrese una palabra: ");
            a[i] = scanner.next();
        }

        System.out.print("\nIngrese la palabra a buscar: ");
        String palabra = scanner.next();

        int i = 0;
        while ( i < a.length && !a[i].equals(palabra)){
            i++;
        }

        if( i == a.length){
            System.out.println("No se encontró una coincidencia");
        }
        else if(palabra.equals(a[i])){
            System.out.println("Resultado encontrado en la posición: " + i);
        }

    }
}
