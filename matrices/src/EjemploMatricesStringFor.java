public class EjemploMatricesStringFor {
    public static void main(String[] args) {
        String[][] nombres = new String[3][2];
        nombres[0][0] = "pepe";
        nombres[0][1] = "pepa";
        nombres[1][0] = "josefa";
        nombres[1][1] = "paco";
        nombres[2][0] = "lucas";
        nombres[2][1] = "panchito";

        System.out.println("--------------iterando con for---------------");
        for (int i = 0; i < nombres.length; i++){

            for(int j = 0; j < nombres[i].length; j++){

                System.out.print(nombres[i][j]+ "\t");
            }
            System.out.println();
        }


        System.out.println("\n---------------iterando con foreach------------------");
        for(String[] fila: nombres){
            for (String nombre: fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
