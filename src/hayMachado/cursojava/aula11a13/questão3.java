package hayMachado.cursojava.aula11a13;

import java.util.Scanner;

public class quest�o3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		int numero1 = scan.nextInt();
		System.out.println("Informe mais um n�mero: ");
		int numero2 = scan.nextInt();
		
		
		System.out.println("A soma dos dois n�meros s�o: " + ( numero1 + numero2));
	}

}
