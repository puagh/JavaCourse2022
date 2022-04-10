public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder("");
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 155000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //40750ms
            //c += a + b + "\n"; //12086ms
            sb.append(a).append(b).append("\n"); //136ms
        }

        System.gc(); //Garbage Collector (recicla las instancias)

        long fin = System.currentTimeMillis();

        //System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.out.println(fin - inicio);

        System.exit(0);

    }
}
