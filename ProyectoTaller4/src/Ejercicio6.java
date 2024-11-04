
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double montoprestamo, interesmensual, pagomensual;  
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el monto del prestamo: ");
        montoprestamo = teclado.nextDouble();
        System.out.print("Ingrese el interes mensual: ");
        interesmensual = teclado.nextDouble();
        pagomensual = (montoprestamo/12) + interesmensual;
        System.out.println("El pago mensual del prestamo es:  = " + pagomensual);
    }
}
