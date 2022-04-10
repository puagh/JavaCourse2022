public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        var decimal = 64;
        
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        //Caracteres especiales
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulator = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';




        System.out.println("***************** char | Character *******************");
        System.out.println("caracter = " + caracter);
        System.out.println("tipo long corresponde en bytes a:" + System.lineSeparator() + Character.BYTES);
        System.out.println("tipo long corresponde en bits a: " + Character.SIZE);
        System.out.println("valor máximo de un long: " + Character.MAX_VALUE);
        System.out.println("valor mínimo de un long: " + Character.MIN_VALUE);
    }
}
