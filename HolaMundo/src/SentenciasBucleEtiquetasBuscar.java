public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "Tres tristes tigres tragaban trigo en un trigal, en un trigal tragaban trigo tres tristes tigrestrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;

        buscar:
        for (int i = 0; i <= maxFrase;){
            int k = i;
            for( int j = 0; j < maxPalabra; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("cantidad de palabras \""+ palabra +"\" en la frase = " + cantidad);
    }
}
