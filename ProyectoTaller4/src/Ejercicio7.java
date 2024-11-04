
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double costoxkilovatio, kilovatioconsumido, valortotal;
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el costo pot kilovatio/hora: ");
        costoxkilovatio = teclado.nextDouble();
        System.out.print("Ingrese el numero de kilovatios consumidos en el mes: ");
        kilovatioconsumido = teclado.nextDouble();
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        valortotal = costoxkilovatio * kilovatioconsumido;
        if (edad >= 65) {
            valortotal *= 0.9;
        }
        System.out.println("El valor total a cancelar de la planilla de luz es: " + valortotal);
    }
}
