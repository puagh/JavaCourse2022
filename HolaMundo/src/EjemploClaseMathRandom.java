import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        double random = Math.random();
        System.out.println("random = " + random);

        double random0al7 = Math.random();

        System.out.println("Random del 0 al 7 = " + Math.round(random0al7 *= 7));

        String[] colores = {"verde", "azul", "violeta", "rosa", "rojo", "blanco"};
        random *= colores.length;
        random = Math.floor(random);

        System.out.println("Color al azar: " + colores[(int)random]);


        //CLASE RANDOM
        Random objRandom = new Random();
        int randomInt = 50 + objRandom.nextInt(101 - 50); //Entero del 50 al 100
        System.out.println("randomInt = " + randomInt);

        randomInt = objRandom.nextInt(colores.length);
        System.out.println("colores[randomInt] = " + colores[randomInt]);

        System.exit(0);
    }
}
