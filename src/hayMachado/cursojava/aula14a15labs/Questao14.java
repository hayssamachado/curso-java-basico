package hayMachado.cursojava.aula14a15labs;

import java.util.Scanner;

public class Questao14 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a primeira nota:");
		double media1 = scan.nextFloat();
		System.out.println("Digite a segunda nota:");
		double media2 = scan.nextFloat();

		double media = (media1 + media2) / 2;

		String aproveitamento = "";
		if (media >= 9 && media <= 10) {
			aproveitamento = "A";
		} else if (media >= 7.5 && media > 9) {
			aproveitamento = "B";
		} else if (media >= 6 && media > 7.5) {
			aproveitamento = "C";
		} else if (media >= 4 && media > 6) {
			aproveitamento = "D";
		} else if (media >= 0 && media > 4) {
			aproveitamento = "E";
		}
		System.out.println("Nota1: " + media1);
		System.out.println("Nota2: " + media2);
		System.out.println("Media: " + media);
		System.out.println("Conceito:" + aproveitamento);

		switch (aproveitamento) {
		case "A":
		case "B":
		case "C":
			System.out.println("APROVADO");
			break;
		case "D":
		case "E":
			System.out.println("REPROVADO");
			break;
		}
	}
}
