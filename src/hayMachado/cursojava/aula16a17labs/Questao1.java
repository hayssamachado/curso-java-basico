package hayMachado.cursojava.aula16a17labs;

import java.util.Scanner;

class Questao1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean notaValida = false;

		do {
			System.out.println("Avalie de O - 10");
			double nota = scan.nextDouble();
			if (nota >= 0 && nota <= 10) {

				System.out.println("Voce digitou: " + nota);
			} else {
				System.out.println("nota inválida, digite novamente.");
			}
		} while (!notaValida);
	}
}
