public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "3", Color.AZUL, 2.5);
        mazda.setTipo(TipoAutomovil.HATCHBACK);

        System.out.println(subaru.verDetalle());
        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Puertas = " + tipoSubaru.getNumeroPuertas());

        System.out.println(mazda.verDetalle());
        TipoAutomovil tipoMazda = mazda.getTipo();
        System.out.println("Puertas = " + tipoMazda.getNumeroPuertas());

        switch (tipoSubaru){
            case HATCHBACK -> System.out.println("Auto compacto de aspecto deportivo");
            case SEDAN -> System.out.println("Auto mediano con 4 puertas");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values(); //Retorna los valores de las constantes

        System.out.println("---------------------------------------------");
        System.out.println("Tipos de automóviles:");
        for (TipoAutomovil tipo:tipos) {
            System.out.println("\t" + "+" + tipo + " -> " + tipo.getDescripcion() + " -> " + tipo.getNumeroPuertas() );
        }

    }
}
