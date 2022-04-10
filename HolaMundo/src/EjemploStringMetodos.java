public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Hector";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Hector\") = " + nombre.equals("Hector"));
        System.out.println("nombre.equals(\"hector\") = " + nombre.equals("hector"));
        System.out.println("nombre.equalsIgnoreCase(\"hector\") = " + nombre.equalsIgnoreCase("hector"));
        System.out.println("nombre.compareTo(\"Hector\") = " + nombre.compareTo("Hector"));
        System.out.println("nombre.compareTo(\"Héctor\") = " + nombre.compareTo("Héctor"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length() -1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(nombre.length() - 3, nombre.length()) = " + nombre.substring(nombre.length() - 3));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"r\", \"l\") = " + trabalenguas.replace("r", "l"));
        System.out.println("trabalenguas.indexOf(\"r\") = " + trabalenguas.indexOf("r"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.contains(\"traba\") = " + trabalenguas.contains("traba"));
        System.out.println("trabalenguas.startsWith(\"trab\") = " + trabalenguas.startsWith("trab")); //endsWith
        System.out.println("     trabalenguas  ".trim());


    }
}
