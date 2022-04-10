public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.err.println("Debe ingresar argumentos");
            System.exit(-1);
        }

        for(int i= 0; i< args.length; i++){
            System.out.println("Argumento o parámetro Nº " + i + " = " + args[i]);
        }
    }
}
