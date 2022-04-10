public class OperadoresIncrementales {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i; //Pre incremento
        System.out.println("j = " + j);

        //Post incremento
        i = 2;
        j = i++;
        System.out.println("j = " + j);
        
        j = i;
        System.out.println("j = " + j);

        // pre decremento
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //post decremento

        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }
}
