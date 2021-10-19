package hayMachado.cursojava.aula14a15labs;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Voce ira digitar dois numeros");
		System.out.println("Digite o primeiro: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo: ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro número é maior que o segundo");
		} else if (num2 > num1){
			System.out.println("O segundo numero é maior que o primeiro");
		}else if (num1 == num2) { 
			System.out.println("O dois números sao iguais");
		}
	}

}
