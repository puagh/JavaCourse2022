public class PrimitivosEnteros {
    public static void main(String[] args) {
        System.out.println("***************** byte | Byte *******************");
        byte numeroByte = 32;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en bytes a: " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a: " + Byte.SIZE);
        System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte: " + Byte.MIN_VALUE);

        System.out.println("***************** short | Short *******************");
        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bytes a: " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a: " + Short.SIZE);
        System.out.println("valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un short: " + Short.MIN_VALUE);

        System.out.println("***************** int | Integer *******************");
        int numeroInt = 6000000;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a: " + Integer.SIZE);
        System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int: " + Integer.MIN_VALUE);

        System.out.println("***************** long | Long *******************");
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bytes a: " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a: " + Long.SIZE);
        System.out.println("valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long: " + Long.MIN_VALUE);

    }
}
