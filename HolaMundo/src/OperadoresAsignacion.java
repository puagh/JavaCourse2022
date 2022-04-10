public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("i = " + i);
        
        i += 12;
        System.out.println("i = " + i);
        
        i -= 7;
        System.out.println("i = " + i);

        i %= 7;
        System.out.println("i = " + i);

        String sqlString = "SELECT * FROM clientes as c ";
        sqlString += "WHERE id = 1 AND active = 1";
        System.out.println("sqlString = " + sqlString);
    }
}
