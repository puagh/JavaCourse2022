import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.NEGRO);

        Automovil mazda = new Automovil("Mazda", "3", Color.AZUL, 2.5);
        Automovil mazda2 = new Automovil("Mazda", "3", Color.AZUL, 2.5);

        Automovil auto = new Automovil();

        Automovil nissan = new Automovil();
        Date fecha = new Date();

        nissan.setCilindrada(1.8);
        nissan.setColor(Color.ROJO);


        System.out.println(subaru.verDetalle());
        System.out.println(subaru.acelerar(3500));
        System.out.println(subaru.acelerarFrenar(6200));
        System.out.println("Kilómetros por litro " + subaru.calcularConsumo(300, 0.65F));

        System.out.println(mazda.verDetalle());
        System.out.println(mazda.acelerar(1800));
        System.out.println(mazda.acelerarFrenar(5600));
        System.out.println("Kilómetros por litro " + mazda.calcularConsumo(300, 80));

        System.out.println("---------------------------------------------------\n");
        System.out.println("son iguales?" + (mazda == mazda2));
        System.out.println("son iguales?" + (mazda.equals(mazda2)));

        System.out.println("---------------------------------------------------\n");
        System.out.println("son iguales?" + (auto.equals(mazda2)));
        System.out.println("son iguales?" + (auto.equals(fecha)));

        System.out.println("---------------------------------------------------\n");
        System.out.println(subaru);

    }
}
