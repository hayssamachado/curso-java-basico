package hayMachado.cursojava.aula14a15labs;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor na tela");
		double valor = scan.nextDouble();
		
		if (valor > 0) {
			System.out.println("Esse valor é positivo");
		} else if (valor < 0) {
			System.out.println("Esse valor é negativo");
		} else if (valor == 0) {
			System.out.println("Esse valo é zero");
		}
}
}
