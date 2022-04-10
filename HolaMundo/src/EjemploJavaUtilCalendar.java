import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        //el mes va desde 0 a 11, también se puede utilizar una constante Calendar.FEBRUARY que contiene el valor del mes
        //calendario.set(1989, Calendar.FEBRUARY, 11, 14, 30, 34);

        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, Calendar.JANUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 15);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 9);
        calendario.set(Calendar.AM_PM, Calendar.PM);

        calendario.set(Calendar.MINUTE, 52);
        calendario.set(Calendar.SECOND, 25);
        calendario.set(Calendar.MILLISECOND, 456);


        Date fecha = calendario.getTime();

        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha formateada = " + fechaConFormato);
    }
}
