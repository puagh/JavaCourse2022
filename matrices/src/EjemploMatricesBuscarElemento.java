public class EjemploMatricesBuscarElemento {
    public static void main(String[] args) {
        int[][] matrizEnteros = {
                {13, 453, 890, 34},
                {342, 121, 11, 56},
                {454, 67, 111, 232}
        };

        int elementoBuscar = 13;
        boolean encontrado = false;

        int i;
        int j = 0;
        buscar: for(i = 0; i < matrizEnteros.length; i++){
            for(j = 0; j < matrizEnteros[i].length; j++){
                if(matrizEnteros[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(encontrado){
            System.out.println("Encontrado elemento a buscar en las coordenadas "+ i + ","+ j);
        }
        else{
            System.out.println("No se encontro el elemento en la matriz");
        }

    }
}
