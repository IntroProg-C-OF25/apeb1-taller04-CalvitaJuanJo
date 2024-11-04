
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //1. entrada 2. proceso 3. salida 
        // Declaracion de datos o variables
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        //INGRESO DE DATOS DE ENTRADA
        System.out.print("DAME LA BASE: "); //carpinteria de salida
        base = teclado.nextDouble(); //Datos de entrada 
        System.out.print("DAME LA BASE: ");
        altura = teclado.nextDouble();
        //PREOCESAMIENTO DE DATOS DE ENTRADA 
        area = (base * altura) / 2;
        //PRESENTACION DE DATOS DE SALIDA 
            System.out.println("area del triangulo es = " + area);
    }
}
