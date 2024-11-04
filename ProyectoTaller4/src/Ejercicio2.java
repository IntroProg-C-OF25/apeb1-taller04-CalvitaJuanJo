
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double gastohijo1, gastohijo2, gastohijo3, totalgastos;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresar el gasto del primer hijo: ");
        gastohijo1 = teclado.nextDouble();
        System.out.print("Ingresar el gasto del segundo hijo. ");
        gastohijo2 = teclado.nextDouble(); 
        System.out.print("Ingresar el gasto del tercer hijo. ");
        gastohijo3 = teclado.nextDouble(); 
        totalgastos = gastohijo1 + gastohijo2 + gastohijo3;
        System.out.println("El total de gastos de los hijos es: = " + totalgastos);
    }
}
