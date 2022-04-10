import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura");
        String nombreFactura = scanner.nextLine();
        double precioProd1 = 0;
        double precioProd2 = 0;

        try{
            System.out.println("Ingrese el precio del producto 1");
            precioProd1 = scanner.nextDouble();

            System.out.println("Ingrese el precio del producto 2");
            precioProd2 = scanner.nextDouble();
        } catch(Exception e){
            System.out.println("Error, debe ingresar un número");
            main(args);
            System.exit(0);
        }

        double totalBruto = precioProd1 + precioProd2;
        byte tasaImpuesto = 19;
        double calculoImpuesto = totalBruto * tasaImpuesto / 100;
        double totalNeto = totalBruto + calculoImpuesto;
        String salidaInfo = "La factura " + nombreFactura + " tiene un total bruto de " + totalBruto + ", con un impuesto de " + calculoImpuesto + " y el monto después de impuesto es de " + totalNeto;
        System.out.println(salidaInfo);

    }
}
