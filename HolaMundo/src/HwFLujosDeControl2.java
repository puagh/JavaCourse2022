import java.util.Scanner;

public class HwFLujosDeControl2 {
    /*
     *Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
     * Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
     * además, mostrar el promedio total.
     * Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una
     * para realizar los cálculos (contadores, sumas).
     * Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error
     * finalizando el programa.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] calificacionesArray = new double[20];
        byte limiteInferior = 1, limiteSuperior = 7, cantidadNotas1 = 0, contadorInferiores4 = 0,
                contadorMayores5 = 0;
        double acumuladoCalificaciones = 0.0, acumuladorMayores5 = 0.0, promedioMayores5,
                acumuladorInferiores4 = 0.0, promedioInferiores4, promedioTotal;
        boolean entradaValida = false;

        for(byte i = 0; i < 20; i++){
            try{
                System.out.print("Ingrese la nota " + (i+1) + " de 20 :\t");
                calificacionesArray[i] = Double.parseDouble(scanner.nextLine());
                if( calificacionesArray[i] >= limiteInferior && calificacionesArray[i] <= limiteSuperior){
                    entradaValida = true;
                    double calificacionActual = calificacionesArray[i];
                    acumuladoCalificaciones += calificacionActual;
                    if(calificacionActual > 5){
                        acumuladorMayores5 += calificacionActual;
                        contadorMayores5++;
                        continue;
                    }
                    if(calificacionActual == 1){
                        cantidadNotas1++;
                    }
                    if(calificacionActual < 4){
                        acumuladorInferiores4 += calificacionActual;
                        contadorInferiores4++;
                    }
                } else{
                    entradaValida = false;
                    break;
                }
            } catch(NumberFormatException e){
                System.out.println("Solo se permite agregar números entre 1 y 7");
                main(args);
                System.exit(0);
            }
        }

        if(!entradaValida){
            System.out.println("¡Error!\nSolo se permite agregar números entre 1 y 7");
            main(args);
            System.exit(0);
        }

        promedioInferiores4 = contadorInferiores4 == 0 ? 0 : acumuladorInferiores4 / contadorInferiores4;
        promedioMayores5 = contadorMayores5 == 0 ? 0 : acumuladorMayores5 / contadorMayores5;
        promedioTotal = acumuladoCalificaciones / 20;

        System.out.println("Promedio de notas inferiores a 4 = " + promedioInferiores4);
        System.out.println("Promedio de notas mayores a 5 = " + promedioMayores5);
        System.out.println("Cantidad de notas 1 = " + cantidadNotas1);
        System.out.println("El promedio total es de = " + promedioTotal);

    }
}
