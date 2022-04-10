import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        
        //Obtener fecha actual con Calendar
        Calendar calActual = Calendar.getInstance();
        Date fechaCal = calActual.getTime();
        System.out.println("fechaCal = " + fechaCal);
            
            
            
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una fecha con el formato ");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha sin formato = " + fecha);
            System.out.println("fecha con formato = " + format.format(fecha));

            Date fechaActual = new Date();
            if(fecha.after(fechaActual)){
                System.out.println("fecha ingresada es futura");
            } else if(fecha.before(fechaActual)){
                System.out.println("fecha ingresada es anterior a la fecha actual");
            } else if(fecha.equals(fechaActual)){
                System.out.println("Las fechas corresponden al mismo día");
            }

            if(fecha.compareTo(fechaActual) > 0){
                System.out.println("fecha ingresada es futura");
            } else if(fecha.compareTo(fechaActual) < 0){
                System.out.println("fecha ingresada es anterior a la fecha actual");
            } else if(fecha.compareTo(fechaActual) == 0){
                System.out.println("Las fechas corresponden al mismo día");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
