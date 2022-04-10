public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();
        for (int i = arreglo.length - 1; i >= 0; i-=1){
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }

        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split(("a"));
        for(int i = 0; i < arreglo2.length; i++){
            System.out.println("arreglo2[" + i + "] = " + arreglo2[i]);
        }
    }
}
