public class SentenciaForArreglos {
    public static void main(String[] args) {
        String[] nombre = {"Paco", "Poncho", "Pedrito", "Pablo", "Rocco", "Patrón"};

        Short count = (short)nombre.length;
        for(int i = 0; i < nombre.length; i++){
            if(nombre[i].equalsIgnoreCase("pablo")){
                continue;
            }
            if(nombre[i].equalsIgnoreCase("rocco")){
                break;
            }
            System.out.println("nombre[i] = " + nombre[i]);
        }

    }
}
