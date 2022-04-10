public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Personal Jesus";
        Integer num = 900;

        Boolean b1 = texto instanceof String;
        System.out.println("texto es una instancia de String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es una instancia de Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es una instancia de Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es una instancia de Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 instancia de Boolean = " + b1);
    }
}
