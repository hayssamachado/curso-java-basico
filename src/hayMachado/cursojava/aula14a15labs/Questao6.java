package hayMachado.cursojava.aula14a15labs;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("A seguir digite 3 numeros: ");
		System.out.println("Digite um numero");
		int num1 = scan.nextInt();
		System.out.println("Digite um numero");
		int num2 = scan.nextInt();
		System.out.println("Digite um numero");
		int num3 = scan.nextInt();

//		if (num1 > num2) {
//			System.out.println(num1);
//		} else if (num1 > num3) {
//			System.out.println(num1);
//		} else if (num2 > num1) {
//			System.out.println(num2);
//		} else if (num2 > num3) {
//			System.out.println(num2);
//		} else if (num3 > num1) {
//			System.out.println(num3);
//		} else if (num3 > num2) {
//			System.out.println(num3);
//
//		}
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3);
		}

	}
}
