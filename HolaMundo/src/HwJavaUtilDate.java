import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HwJavaUtilDate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Ingrese una fecha con el formato dd-MM-yyyy");
        try{

            Calendar calendarNacimiento = Calendar.getInstance();

            Date fechaNac = formatoFecha.parse(scanner.next());
            calendarNacimiento.setTime(fechaNac);

            Calendar calendarActual = Calendar.getInstance();
            calendarActual.getTime();

            if(calendarNacimiento.after(calendarActual)){
                System.out.println("La fecha ingresada es futura, no se puede realizar el cálculo");
                System.exit(0);
            } else if(calendarNacimiento.before(calendarActual)){
                System.out.println("Calculando la edad...");
                int edad = calendarActual.get(Calendar.YEAR) - calendarNacimiento.get(Calendar.YEAR);
                if(calendarActual.get(Calendar.DAY_OF_YEAR) > calendarNacimiento.get(Calendar.DAY_OF_WEEK)){
                    //Aún no cumple años
                    edad -= 1;
                }
                System.out.println("Tu edad es de: " + edad + " años");
            }

        }catch (ParseException e){
            System.out.println("Ingrese una fecha en el formato válido dd-MM-yyyy");
            main(args);
            System.exit(0);
        }
    }
}
