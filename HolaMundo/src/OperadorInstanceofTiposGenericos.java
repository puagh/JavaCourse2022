public class OperadorInstanceofTiposGenericos {
    public static void main(String[] args) {
        Object texto = "Personal Jesus";
        Number num = Integer.valueOf(343434);//900;



        Boolean b1 = texto instanceof String;
        System.out.println("texto es una instancia de String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es una instancia de Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es instancia de Integer = " + b1);



        b1 = num instanceof Integer;
        System.out.println("num es una instancia de Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es una instancia de Number = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es una instancia de Long = " + b1);


        Number decimal = Float.valueOf(23.90f);

        b1 = decimal instanceof Double;
        System.out.println("decimal es instancia de Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es instancia de Float = " + b1);



        b1 = b1 instanceof Boolean;
        System.out.println("b1 instancia de Boolean = " + b1);
    }
}
