import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre1, nombre2, nombre3;

        System.out.println("Ingrese el primer nombre");
        nombre1 = scanner.nextLine().trim();

        System.out.println("Ingrese el segundo nombre");
        nombre2 = scanner.nextLine().trim();

        System.out.println("Ingrese el tercer nombre");
        nombre3 = scanner.nextLine().trim();

        StringBuilder cadenaFinal = new StringBuilder("");
        StringBuilder nom1 = new StringBuilder("");
        StringBuilder nom2 = new StringBuilder("");
        StringBuilder nom3 = new StringBuilder("");

        nom1.append(nombre1.substring(1,2).toUpperCase()).append(".").append(nombre1.substring(nombre1.length() - 2));
        //System.out.println("nom1.toString() = " + nom1.toString());
        nom2.append(nombre2.substring(1,2).toUpperCase()).append(".").append(nombre2.substring(nombre2.length() - 2));
        //System.out.println("nom2.toString() = " + nom2.toString());
        nom3.append(nombre3.substring(1,2).toUpperCase()).append(".").append(nombre3.substring(nombre3.length() - 2));
        //System.out.println("nom3.toString() = " + nom3.toString());

        cadenaFinal.append(nom1).append("_").append(nom2).append("_").append(nom3);
        System.out.println(cadenaFinal.toString());

    }
}
