package hayMachado.cursojava.aula14a15labs;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
	
			System.out.println("A seguir, informe o turno que voce estuda: ");
			System.out.println("M - Matutino");
			System.out.println("V - Vespertino");
			System.out.println("N - Noturno");
	
			
			String turno =  scan.next();
			
			switch (turno) {
			case "m":
			case "M": System.out.println("Bom dia!"); break;
			case "v":
			case "V":System.out.println("Boa tarde!"); break;
			case "n":
			case "N":System.out.println("Boa noite"); break;
			default: System.out.println("valor inválido");
			}
			
			
			
				
				
	
	}

}
