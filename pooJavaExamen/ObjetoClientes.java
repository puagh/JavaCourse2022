import java.io.*;
class ObjetoClientes{
  //Variables de instancia
  String nombre;
  int no_cuenta;
  float saldo,saldo_ini;

  //Constructor de la clase
  ObjetoClientes(String nombre, int no_cuenta, float saldo){
    this.nombre=nombre;
    this.no_cuenta=no_cuenta;
    this.saldo=saldo;
  }

  public float getSaldo(){
    return(saldo);
  }

  public void setSaldo(float saldo){
    this.saldo=saldo;
  }

  //Método que calcula la suma del deposito al saldo inicial
  public float depositos(float depos){

    float nuevo_saldo;
    nuevo_saldo=Operaciones.sumaFloat(saldo,depos);
    Ingreso.imprimeSaldo(nuevo_saldo);
    return(nuevo_saldo);
  }

  //Método que calcula la resta del retiro menos el saldo inicial
  public float retiros(float retiro)throws IOException{
    //float nuevo_saldo;
    while(retiro>saldo)
    {
      Ingreso.imprime("Lo sentimos, no se puede hacer el retiro\nSaldo insuficiente\n");
      retiro=Ingreso.leeFloat("Ingrese la cantidad a retirar: ");
    }
    //nuevo_saldo=Operaciones.restaFloat(saldo,retiro);
    //Ingreso.imprimeSaldo(nuevo_saldo);
    //return(nuevo_saldo);
    return retiro;
  }

  //Función que guarda los datos ingresados por el usuario a las Variables del objeto
  public void llenaObjeto(String nombre, int no_cuenta, float saldo){
    saldo_ini=saldo;
    this.nombre=nombre;
    this.no_cuenta=no_cuenta;
    this.saldo=saldo;
  }

  //Función que imprime todos los datos del cliente1 (nombre, cuenta y saldo)
  public void imprimirDatos(){
    System.out.println("\t\tNombre: "+nombre);
    System.out.println("\t\tCuenta: "+no_cuenta);
    System.out.println("\t\tSaldo:  "+saldo);
  }

  public void imprimirEstado(float a[],int x,float b[],int y){    //añadido
    int i,j;
    float acumuladorSuma=0,acumuladorResta=0;
    System.out.println("\t\tNo. de Cuenta: "+no_cuenta);
    System.out.println("\t\tTitular: "+nombre);
    System.out.println("\t\tSaldo inicial $"+saldo_ini);
    System.out.println("\t\tDepositos:");
    for(i=0;i<x;i++){
      System.out.println("\t\t\t$"+a[i]);
      acumuladorSuma=acumuladorSuma+a[i];
    }
    System.out.println("\t\t\t___________________");
    System.out.println("\t\t\t$"+acumuladorSuma);
    System.out.println("\n\n\n\t\tRetiros:");
    for(j=0;j<y;j++){
      System.out.println("\t\t\t$"+b[j]);
      acumuladorResta=acumuladorResta+b[j];
    }
    System.out.println("\t\t\t___________________");
    System.out.println("\t\t\t$"+acumuladorResta);
    System.out.println("\n\n\t\tSaldo Final: $"+saldo+"\n\n\n");
  }
}
