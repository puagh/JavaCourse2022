import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor personalizado en el obj properties");

            System.setProperties(p); //Actualizar las propiedades personaliadas
            System.getProperties().list(System.out);

            //Obtener una prop personalizada
            System.out.println("\nPropiedad personalizada config.autor.nombre = " + System.getProperty("config.autor.nombre"));

        } catch (Exception e) {
            System.err.println(e + " No existe el archivo");
            System.exit(1);
        }
    }
}
