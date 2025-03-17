package condicionales;

import java.util.Scanner;

public class Primer {
	public class NumeroPositivoNegativo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa un número: ");
	        int numero = scanner.nextInt();
	        
	        if (numero >= 0) {
	            System.out.println("El número es positivo.");
	        } else {
	            System.out.println("El número es negativo.");
	        }
	    }
	}
}