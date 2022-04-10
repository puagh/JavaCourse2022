import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseIngles, claseBiologia;
        double sumMatematicas = 0, sumIngles = 0, sumBiologia = 0;

        claseMatematicas = new double[7];
        claseIngles = new double[7];
        claseBiologia = new double[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las calificaciones de matemáticas: ");
        for(int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese las calificaciones de inglés: ");
        for(int i = 0; i < claseIngles.length; i++){
            claseIngles[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese las calificaciones de biología: ");
        for(int i = 0; i < claseBiologia.length; i++){
            claseBiologia[i] = scanner.nextDouble();
        }

        for(int i = 0; i < claseMatematicas.length; i++){
            sumMatematicas += claseMatematicas[i];
        }

        for(int i = 0; i < claseIngles.length; i++){
            sumIngles += claseIngles[i];
        }

        for(int i = 0; i < claseBiologia.length; i++){
            sumBiologia += claseBiologia[i];
        }

        double promMatematicas, promIngles, promBiologia;
        promMatematicas = sumMatematicas/claseMatematicas.length;
        promIngles = sumIngles/claseIngles.length;
        promBiologia = sumBiologia/claseBiologia.length;

        System.out.println("promMatematicas = " + promMatematicas);
        System.out.println("promIngles = " + promIngles);
        System.out.println("promBiologia = " + promBiologia);

        System.out.println("prom total del curso = " + ((promMatematicas + promIngles + promIngles)/3));

        System.out.println("Ingrese el id del alumno para obtener sus calificaciones (0 - 6)");
        int id = scanner.nextInt();

        System.out.println("--------------------Datos del alumno ----------------------");

        System.out.println("notas matemáticas: " + claseMatematicas[id]);
        System.out.println("notas inglés: " + claseIngles[id]);
        System.out.println("notas biología: " + claseBiologia[id]);

        System.out.println("promedio del alumno " + id +" = " +
                ((claseMatematicas[id] + claseBiologia[id] + claseIngles[id])/3));


    }
}
