public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        double maximo = Math.max(3.5, 1.2);
        System.out.println("maximo = " + maximo);

        double minimo = Math.min(10.899999, 10.9);
        System.out.println("minimo = " + minimo);

        double techo = Math.ceil(9.59);
        System.out.println("techo = " + techo);
        
        double piso = Math.floor(3.7);
        System.out.println("piso = " + piso);

        long entero = Math.round(6.50);
        System.out.println("entero = " + entero);

        //TRIGONOMETRÍA
        double euler = Math.exp(1);
        System.out.println("euler = " + euler);
        
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(1231);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees( Math.PI / 2);
        System.out.println("Conversión de radianes a grados = " + grados);

        double radianes = Math.toRadians(360);
        System.out.println("de grados a radianes = " + radianes);

        System.out.println("seno de pi/2 radianes (90ª) = "+ Math.sin(radianes));
        System.out.println("coseno de pi/2 radianes (90ª) = " + Math.cos(radianes));

        radianes = Math.toRadians(180);
        System.out.println("coseno de pi radianes (180ª) = " + Math.cos(radianes));


    }
}
