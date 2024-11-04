
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double costoxminuto, minutosconsumidos, totalplanilla;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el costo por minutos: ");
        costoxminuto = teclado.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos en el mes: ");
        minutosconsumidos = teclado.nextDouble();
        totalplanilla = costoxminuto * minutosconsumidos;
        System.out.println("El valor total de la planilla de telefono es: = " + totalplanilla);
    }
}
