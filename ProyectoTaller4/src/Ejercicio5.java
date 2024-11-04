
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double costocpu, costoteclado, costopantalla, costoraton, costototal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el costo del CPU: ");
        costocpu = teclado.nextDouble();
        System.out.print("Ingrese el costo del teclado: ");
        costoteclado = teclado.nextDouble();
        System.out.print("Ingrese el costo de la pantalla: ");
        costopantalla = teclado.nextDouble();
        System.out.print("Ingrese el costo del raton: ");
        costoraton = teclado.nextDouble();
        costototal = costocpu + costoteclado + costopantalla + costoraton;
        System.out.println("El costo total de la computadora es = " + costototal);
    }
}
