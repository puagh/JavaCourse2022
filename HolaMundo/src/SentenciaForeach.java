public class SentenciaForeach {
    public static void main(String[] args) {
        int[] nImpares = {1,3,5,7,9};
        for (int num: nImpares) {
            System.out.println("num = " + num);
        }

        String[] nombre = {"Paco", "Poncho", "Pedrito", "Pablo", "Rocco", "Patrón"};
        for(String n: nombre){
            System.out.println("n = " + n);
        }
    }
}
