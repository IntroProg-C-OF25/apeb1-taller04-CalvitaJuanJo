
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        double costonetflix, costoyoutube, costodropbox, costospotify, totalmensual;
        int edad;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el costo mensual de netflix: ");
        costonetflix = teclado.nextDouble();
        System.out.print("Ingrese el costo mensual de YooTube: ");
        costoyoutube = teclado.nextDouble();
        System.out.print("Ingrese el costo mensual de DropBox: ");
        costodropbox = teclado.nextDouble();
        System.out.print("Ingrese el monto mensual de Spotify: ");
        costospotify = teclado.nextDouble();
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        totalmensual = costonetflix + costoyoutube + costodropbox + costospotify;
        if (edad < 30) {
            totalmensual *= 0.8;
        }
        System.out.println("El valor mensual a pagar de cada uno es: " + totalmensual);
    }
    
}
