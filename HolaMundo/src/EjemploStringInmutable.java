public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";
        
        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        
        String informacion = curso.transform(c -> {
            return c + " con " + profesor;
        });

        System.out.println("informacion = " + informacion);
        
        String resultado2 = resultado.replace("a", "A");
        System.out.println("resultado2 = " + resultado2);
        
        
    }
}
