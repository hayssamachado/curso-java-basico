package hayMachado.cursojava.aula11a13;

import java.util.Scanner;

public class questão3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int numero1 = scan.nextInt();
		System.out.println("Informe mais um número: ");
		int numero2 = scan.nextInt();
		
		
		System.out.println("A soma dos dois números são: " + ( numero1 + numero2));
	}

}
