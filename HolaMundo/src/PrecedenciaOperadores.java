public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14, j = 8, k = 20;
        double promedio = (double) (i + j + k) / 3;
        System.out.println("promedio = " + promedio);

        promedio = i + j + k / 3d * 10;
        System.out.println("promedio = " + promedio);
        
        promedio = --i + j++ + k / 3d * 10;
        System.out.println("promedio = " + promedio);
    }
}
