import java.sql.Array;
import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "puagh";
        usernames[1] = "malfoy";
        usernames[2] = "lambo";

        passwords[0] = "12345";
        passwords[1] = "abcde";
        passwords[2] = "hurricane";*/

        String[] usernames = {"puagh", "malfoy", "lambo"};
        String[] passwords = {"12345", "abcde", "hurricane"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        String userIn = scanner.next();

        System.out.println("Ingrese su contraseña: ");
        String passIn = scanner.next();

        boolean isAutenticated = false;

        for (int i = 0; i < usernames.length; i++){
            isAutenticated = (usernames[i].equals(userIn) && passwords[i].equals(passIn)) ? true : isAutenticated;
        }

        String message = isAutenticated ? "Bienvenido a la matrix, ".concat(userIn) :
                "Necesita identificarse para ingresar";
        System.out.println(message);
    }
}
