public class EjemploMatricezTranspuesta {
    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 1, 0 ,5},
            {9, 0 ,1, 6},
            {10, 5, 6, 7}
        };

        System.out.println("Matriz Z original: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++ ){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int aux = 0;
        for(int i = 1; i < matriz.length; i++){
            for(int j = 0; j < i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        System.out.println("\nMatriz Z' transpuesta: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++ ){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
