import java.io.*;
class Ingreso {
  private static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

  public static String leeString(String cadena) throws IOException{
    String leecadena="";
	  System.out.println(cadena);
    leecadena = leer.readLine();
    return (leecadena);
  }

  public static int leeInt(String cadena ) throws IOException{
    int numero=0;
    while(numero==0)
    {
        System.out.println(cadena);
      try{
        numero = Integer.parseInt(leer.readLine());
      }catch (NumberFormatException e)
      {
        numero = 0 ;
        Ingreso.imprime("Debe de escribir un numero, intente de nuevo\n");
      }
    }
    return(numero);
  }

  public static float leeFloat(String cadena) throws IOException{
    float numero=0;
	  while(numero==0)
	  {
		  System.out.println(cadena);
		  try{
			numero = Float.parseFloat(leer.readLine());
		  }
		  catch(Exception e){
			  numero=0;
			  System.out.println("Debe de escribir un numero " );
		  }
		}
		return(numero);
	}

	public static void imprime(String cadena){
		System.out.print(cadena);
	}

  public static void imprimeFloat(String cadena,float numero){
    System.out.println(cadena+numero);
  }
  public static void imprimeSaldo(float monto){
    System.out.println("\nSu saldo actual es de: "+monto+"\n\n");
  }

}
