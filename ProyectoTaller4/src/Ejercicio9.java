
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        double base, alturatriangulo, areacuadrado, areatriangulo, arearectangulo, areatotal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la base del cuadrado: ");
        base = teclado.nextDouble();
        System.out.print("Ingrese la altura de los triangulos: ");
        alturatriangulo =teclado.nextDouble();
        areacuadrado = base * base;
        areatriangulo = 3 * (base * alturatriangulo) / 2;
        arearectangulo = base * alturatriangulo;
        areatotal = areacuadrado + areatriangulo + arearectangulo;
        System.out.println("area total del poligono es = " + areatotal);
    }
    
}
