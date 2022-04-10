import java.util.Properties;

public class EjemploPropiedadesDelSistema {
    public static void main(String[] args) {
        
        //obtener el nombre de usuario del SO
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);
        
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);
        
        String lineSeparator = System.getProperty("line.separator");
        System.out.println(lineSeparator + "lineSeparator es invisible" + lineSeparator  );

        Properties props = System.getProperties();
        props.list(System.out);
    }
}
