public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = " ";
        }

        int esVacio = curso.length();
        System.out.println("longitud : "+esVacio);

        boolean esBlank = curso.isBlank();
        System.out.println("esBlank = " + esBlank);
    }
}
