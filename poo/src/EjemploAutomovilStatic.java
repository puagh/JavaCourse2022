public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "3", Color.AZUL, 2.5);
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        Automovil mazda2 = new Automovil("Mazda", "3", Color.NEGRO, 2.5);
        mazda2.setTipo(TipoAutomovil.SEDAN);

        Automovil auto = new Automovil();
        auto.setColor(Color.NEGRO);
        auto.setModelo("Ranger");
        auto.setFabricante("Ford");
        auto.setCilindrada(4.0);
        auto.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan","Pathfinder");
        nissan.setCilindrada(5.0);
        nissan.setColor(Color.AMARILLO);
        nissan.setTipo(TipoAutomovil.STATION_WAGON);

        Automovil.setColorPatente(Color.ROJO);

        System.out.println(subaru.verDetalle());
        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Puertas = " + tipoSubaru.getNumeroPuertas());


        System.out.println(mazda.verDetalle());
        TipoAutomovil tipoMazda = mazda.getTipo();
        System.out.println("Puertas = " + tipoMazda.getNumeroPuertas());


        System.out.println(mazda2.verDetalle());
        TipoAutomovil tipoMazda2 = mazda2.getTipo();
        System.out.println("Puertas = " + tipoMazda2.getNumeroPuertas());

        System.out.println(auto.verDetalle());
        TipoAutomovil tipoAuto = auto.getTipo();
        System.out.println("Puertas = " + tipoAuto.getNumeroPuertas());

        System.out.println(nissan.verDetalle());
        TipoAutomovil tipoNissan = nissan.getTipo();
        System.out.println("Puertas = " + tipoNissan.getNumeroPuertas());

        Automovil.setCapacidadEstanqueEstatico(60);

        System.out.println("-------------------------------------");

        System.out.println(nissan);

        System.out.println("Automovil.VELOCIDAD_MAXIMA_CARRETERA = " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);

    }
}
