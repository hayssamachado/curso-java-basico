package hayMachado.cursojava.aula11a13;

import java.util.Scanner;

public class Questao4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite a primeira nota:");
		double media1 = scan.nextFloat();
		System.out.println("Digite a segunda nota:");
		double media2 = scan.nextFloat();
		System.out.println("Digite a terceira nota:");
		double media3 = scan.nextFloat();
		System.out.println("Digite a quarta nota:");
		double media4 = scan.nextFloat();
		
		System.out.println("Sua média anual é: " + (media1 + media2 + media3 + media4)/4);
		
	
}
}
