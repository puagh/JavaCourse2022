public class EjemploMatricesSumar {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] b = {
            {11, 12, 13},
            {14, 15, 16},
            {17, 18, 19}
        };

        int[][] suma = new int[3][3];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i = 0; i < suma.length; i++){
            for(int j = 0; j < suma[i].length; j++){
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
