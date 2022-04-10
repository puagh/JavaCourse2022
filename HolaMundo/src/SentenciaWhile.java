public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("Dentro dl while");
        while (i < 12){
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("Dentro del do while");
        do {
            System.out.println("i = " + i);
            i++;
        }while(i<=18);
    }
}
