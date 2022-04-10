public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "56";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "234234.34e-2";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt+1015);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        String otroRealString = Double.toString(65465.3456456e41);
        System.out.println("otroRealString = " + otroRealString);

        int i = 10000;
        short s = (short)i; //Casting, forzar la conversión
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);

    }
}
