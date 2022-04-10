import java.io.*;
class Menu{
  public static void muestra() throws IOException{
  BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    float a_depositos[]= new float[10];                                 //Arreglo que va a contener los depositos realizados
    float a_retiros[]= new float[10];                                   //Arreglo que va a contener los retiros realizados
    int opcion,cuenta=0,i=0,j=0;
    String nombre="",continuar;
    float monto=0,deposito=0,retiro=0,resSuma=0,resResta=0,acumDepo=0,acumRetir=0,nuevo_saldo,actual;
    ObjetoClientes cliente1 = new ObjetoClientes(nombre,cuenta,monto); //Crea el Objeto cliente1
    do{                                                                //Inicio del ciclo wo/while para la repetición del menú
      Ingreso.imprime("\n\nBienvenido al Banco Leon\n\n");             //Impresión del menú     |
      Ingreso.imprime("\tMenu de operaciones\n\n\n");                                         //|
      Ingreso.imprime("\t1.- Registrar cuenta de ahorro\n");                                  //|
      Ingreso.imprime("\t2.- Registro de depositos\n");                                       //|
      Ingreso.imprime("\t3.- Registro de retiros\n");                                         //|
      Ingreso.imprime("\t4.- Saldo actual\n");                                                //|
      Ingreso.imprime("\t5.- Estado de cuenta\n");                                            //|
      Ingreso.imprime("\t6.- Salir\n");                                //Fin impresión del menú |
      opcion=Ingreso.leeInt("Ingrese la opcion deseada: ");            //
      switch(opcion){
        case 1:{
          nombre=Ingreso.leeString("Ingrese el nombre del cliente");
          cuenta=Ingreso.leeInt("Ingrese el numero de cuenta");
          monto=Ingreso.leeFloat("Ingrese el monto inicial");
          cliente1.llenaObjeto(nombre,cuenta,monto);
          cliente1.imprimirDatos();
          break;
        }
        case 2:
          Ingreso.imprime("\tBanco Leon\n");
          Ingreso.imprime("\tDEPOSITOS EN EFECTIVO\n\n\n");
          deposito=Ingreso.leeFloat("Ingrese la cantidad a depositar");   //Lee la cantidad a depositar
          a_depositos[i]=deposito;
          resSuma=cliente1.depositos(deposito);                           //Llama al método deposito para realizar la suma
          cliente1.setSaldo(resSuma);                                     //Actualiza el saldo de la cuenta
          i+=1;
          break;
        case 3:{
          Ingreso.imprime("\tBanco Leon\n");
          Ingreso.imprime("\tRETIROS EN EFECTIVO\n\n\n");
          retiro=Ingreso.leeFloat("Ingrese la cantidad a retirar");       //Lee la cantidad a retirar
          //a_retiros[j]=retiro;
          resResta=cliente1.retiros(retiro);
          a_retiros[j]=resResta;
          actual=cliente1.getSaldo();
          nuevo_saldo=Operaciones.restaFloat(actual,resResta);
          Ingreso.imprimeSaldo(nuevo_saldo);
          cliente1.setSaldo(nuevo_saldo);
          j+=1;
          break;
        }
        case 4:{
          monto=cliente1.getSaldo();
          Ingreso.imprimeSaldo(monto);
          continuar=Ingreso.leeString("Presione ENTER para continuar...");
          break;
        }
        case 5:{
          Ingreso.imprime("\n\n\n\t\tBanco Leon\n");
          Ingreso.imprime("\n\t\tEstado de cuenta\n\n");
          cliente1.imprimirEstado(a_depositos,i,a_retiros,j);
          continuar=Ingreso.leeString("Presione ENTER para continuar...");
          break;
        }
        case 6:
          Ingreso.imprime("\n\n\nSaliendo del sistema...\n");
          break;
        default:{
          Ingreso.imprime("Opcion incorrecta ingrese 1,2,3,4,5 o 6 \n\n\n");
          break;
        }
      }
    }while(opcion!=6);
  }
}
