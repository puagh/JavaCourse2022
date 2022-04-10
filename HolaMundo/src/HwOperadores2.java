import java.util.Scanner;

public class HwOperadores2 {
    public static void main(String[] args) {
        /*Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida 
        la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
        La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero 
        también puede ser del tipo int.
        Si la capacidad actual es 70 litros: imprimir Estanque lleno
        Si está entre 60 y menor a 70: imprimir Estanque casi lleno
        Si está entre 40 y menor a 60: imprimir Estanque3/4
        Si está entre 35 y menor a 40: imprimir Medio Estanque 
        Si está entre 20 y menor a 35: imprimir Suficiente
        Si está entre 1 y menor a 20: imprimir Insuficiente*/
        
        Scanner scanner = new Scanner(System.in);
        Float medidaLitros = 0.0f;
        System.out.print("Ingrese la medida actual en litros del estanque de gasolina: ");
        try{
            medidaLitros = Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Por favor ingrese solo números");
            main(args);
            System.exit(0);
        }

        if(medidaLitros < 0 || medidaLitros > 70){
            System.out.println("Error en cantidad, debe de ser mayor o igual a 0 y menor o igual a 70 litros");
            main(args);
            System.exit(0);
        } else if(medidaLitros == 70){
            System.out.println("Estanque lleno");
        } else if(medidaLitros >= 60 && medidaLitros < 70){
            System.out.println("Estanque casi lleno");
        } else if(medidaLitros >= 40 && medidaLitros < 60){
            System.out.println("Estanque 3/4");
        } else if(medidaLitros >= 35 && medidaLitros < 40){
            System.out.println("Medio Estanque");
        } else if(medidaLitros >= 20 && medidaLitros < 35){
            System.out.println("Suficiente");
        } else if(medidaLitros >= 0 && medidaLitros < 20){
            System.out.println("Insuficiente");
        }

        System.out.println("medidaLitros = " + medidaLitros);
        
    }
}
