package condicionales;

import java.util.Scanner;

public class Segundo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println("Puedes votar.");
        } else {
            System.out.println("No puedes votar todavía.");
        }
    }
}
