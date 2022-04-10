public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    continue bucle1;
                }
                System.out.println("i = " + i + " j =" + j);
            }
        }

        System.out.println("__________________________________________");

        bucle2:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    break bucle2;
                }
                System.out.println("i = " + i + " j =" + j);
            }
        }
    }
}
