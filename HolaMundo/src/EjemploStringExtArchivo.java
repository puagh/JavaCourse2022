public class EjemploStringExtArchivo {
    public static void main(String[] args) {
        String archivo = "110tarea-final.txt";
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("extensión del archivo = " + archivo.substring(archivo.lastIndexOf('.') + 1)); //obtener extension
    }
}
