package hayMachado.cursojava.aula14a15labs;

import java.util.Scanner;

public class Questao8 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A seguir, digite 3 produtos: ");
		System.out.println("Produto 1: ");
		double prod1 = scan.nextDouble();
		System.out.println("Produto 2: ");
		double prod2 = scan.nextDouble();
		System.out.println("Produto 3: ");
		double prod3 = scan.nextDouble();
		
		if (prod1 < prod2 && prod1 < prod3) {
			System.out.println("Voce pode comprar o Produto 1: " + prod1);
		} else if (prod2 < prod1 && prod2 <  prod3) {
			System.out.println("Voce pode comprar o Produto 2: " + prod2);
		} else if (prod3 < prod1 && prod3 < prod2) {
			System.out.println("Voce pode comprar o Produto 3: " + prod3);
			

		
}}}
