public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {
        String[][] nombres = {{"pepe", "pepa"}, {"josefa" , "paco"}, {"lucas", "panchito"}};

        System.out.println("\n---------------iterando con foreach------------------");
        for(String[] fila: nombres){
            for (String nombre: fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
