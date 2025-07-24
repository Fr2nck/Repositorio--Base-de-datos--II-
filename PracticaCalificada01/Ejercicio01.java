package practicaCalificada01;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();        
        if (num == 0) {
            System.out.println("Es cero (neutro y par)");
        } else {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Es positivo y par");
                } else {
                    System.out.println("Es positivo e impar");
                }
            } else {
                if (num % 2 == 0) {
                    System.out.println("Es negativo y par");
                } else {
                    System.out.println("Es negativo e impar");
                }
            }
        }        
        scanner.close();
    }
}
