public class OperadorTernario {
    public static void main(String[] args) {
        String estado = "";
        float calificacion = 6.7f;
        System.out.println("calificación = " + calificacion);
        
        estado = calificacion > 6 ? "Aprobado" : "Reprobado";
        System.out.println("estado = " + estado);
    }
}
