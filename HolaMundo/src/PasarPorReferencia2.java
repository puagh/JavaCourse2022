class Persona{
    //modificadores de acceso "private" principio de visibilidad
    //atributo de la clase
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Héctor");

        System.out.println("nombre de persona = " + persona.obtenerNombre());

        test(persona);

        System.out.println("nombre de persona después de test = " + persona.obtenerNombre());

    }

    public static void test(Persona persona){
        persona.modificarNombre("Mafoy");
    }
}
