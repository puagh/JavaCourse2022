import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        //System.out.println("Variables de ambiente del sistema = " + varEnv);

        for(String key: varEnv.keySet()){
            System.out.println(key + "=" + varEnv.get(key));
        }
        
        String username = System.getenv("USER");
        System.out.println("username = " + username);

        String tmpdir = System.getenv("TMPDIR");
        System.out.println("tmpdir = " + tmpdir);

        String shell = varEnv.get("SHELL");
        System.out.println("shell = " + shell);
    }
}
