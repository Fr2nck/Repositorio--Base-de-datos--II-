package PracticaCalificada01;
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Ingresa una edad: ");
        int edad = scanner.nextInt();        
        if (edad < 0) {
            System.out.println("Edad inválida");
        } else if (edad <= 4) {
            System.out.println("Infancia");
        } else if (edad <= 9) {
            System.out.println("Niñez");
        } else if (edad <= 12) {
            System.out.println("Pubertad");
        } else if (edad <= 18) {
            System.out.println("Adolescencia");
        } else if (edad <= 26) {
            System.out.println("Juventud");
        } else if (edad <= 59) {
            System.out.println("Adultez");
        } else if (edad <= 70) {
            System.out.println("Adulto mayor");
        } else {
            System.out.println("Vejez");
        }        
        scanner.close();
    }
}