public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10, 34, 45, 23};
        System.out.println("iniciamos el main");

        for(int i: edad){
            System.out.println("i = " + i);
        }

        System.out.println("Antes de llamar el método test");
        test(edad);
        System.out.println("Después de llamar el método test");

        for(int i: edad){
            System.out.println("i = " + i);
        }

        System.out.println("Finaliza el método main");
    }

    public static void test(int[] edadArr){
        System.out.println("Inicio del método test");

        for(int i = 0; i < edadArr.length; i++){
            edadArr[i] = edadArr[i] + 20;
            System.out.println("i = " + i);
        }

        System.out.println("Fin del método test");
    }
}
