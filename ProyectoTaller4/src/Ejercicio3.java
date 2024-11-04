
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero entre 2 y 6: ");
        numero = teclado.nextInt();
        if (numero >=2 && numero <=6) {
            System.out.println("Tabla de multiplicar del = " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println ("El numero ingresado no esta entre 2 y 6.");
        }
    }
    
}
