public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Ingrese una operación (suma, resta, div o multi) y dos números");
        }

        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado;

        switch (operacion){
            case "suma":
                resultado = a + b;
                break;

            case "resta":
                resultado = a - b;
                break;

            case "multi":
                resultado = a * b;
                break;

            case "div":
                if(b == 0){
                    System.err.println("No se pude dividir entre 0");
                    System.exit(-1);
                }
                resultado = (double) a / b;
                break;

            default:
                resultado = a + b;
        }

        System.out.println("resultado de la operación " + operacion + " es = " + resultado);
    }
}
