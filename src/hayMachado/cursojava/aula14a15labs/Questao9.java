package hayMachado.cursojava.aula14a15labs;

import java.util.Scanner;

public class Questao9 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("A seguir digite 3 numeros: ");
		System.out.println("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = scan.nextInt();
		System.out.println("Digite o terceiro numero: ");
		int num3 = scan.nextInt();
		
		
		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// num1 é menor
			//num3 é maior
			//num1 < num2<num3
			System.out.println(num3 + "-" +num2+ "-"+ num1);
		}
		else if(num1 <= num2 && num1 <= num3 && num3 <= num2) {
			//num1 é menor
			///num3 é maior
			//num1 < num2 <num3
			System.out.println(num3 + "-" + num1 + "-" + num2);
		} 	else if(num2 <= num1 && num2 <= num3 && num3 <= num1) {
			//num1 é menor
			///num3 é maior
			//num1 < num2 <num3
		
		
	}

}}
