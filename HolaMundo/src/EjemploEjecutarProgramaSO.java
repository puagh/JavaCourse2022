import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        if(System.getProperty("os.name").startsWith("Mac")){
            try {
                String[] cmd = {"open", "-a", "TextEdit.app"};
                proceso = rt.exec(cmd);
                proceso.waitFor();
            } catch (Exception e) {
                System.err.println("El comando es desconocido " + e.getMessage());
                System.exit(1);
            }
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);

    }
}
