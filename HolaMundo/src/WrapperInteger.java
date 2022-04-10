public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32769;
        Integer intObjeto = Integer.valueOf(intPrimitivo); //boxing .- Forma explícita
        Integer intObjeto2 = 127; //autoboxing .- Forma implícita

        //Conversión de Integer a primitivo
        int numero = intObjeto; //Forma automática implícita
        int numero2 = intObjeto2.intValue();  //Forma explítica

        String valorTv = "17000";
        Integer valor = Integer.valueOf(valorTv);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        
        Byte byteObjeto = intObjeto2.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);
        
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
        
        String stringValor = intObjeto.toString();
        System.out.println("stringValor = " + stringValor);
    }
}
