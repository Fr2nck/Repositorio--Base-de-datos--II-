package PracticaCalificada01;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Ingrese un número para calcular su factorial: ");
        int num = scanner.nextInt();
        long factorial = 1;        
        if (num < 0) {
            System.out.println("No existe factorial de números negativos.");
        } else {
            int i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
        }
        scanner.close();
    }
}
