public class PrimitivosReales {

    static float varFlotante;

    public static void main(String[] args) {

        System.out.println("***************** float | Float *******************");
        float realFloat = 1.5e4f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en bytes a: " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a: " + Float.SIZE);
        System.out.println("valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("valor mínimo de un float: " + Float.MIN_VALUE);

        System.out.println("***************** double | Double *******************");
        double realDouble = 1.5234234234234e50;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en bytes a: " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a: " + Double.SIZE);
        System.out.println("valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("valor mínimo de un double: " + Double.MIN_VALUE);
    }
}
