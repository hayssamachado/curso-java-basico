package hayMachado.cursojava.aula14a15labs;

import java.util.Scanner;

public class Questao3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("Digite 1 para F ");
		System.out.println("Digite 2 para M");
		
		int sexo = scan.nextInt();
		switch (sexo) {
		case 1: System.out.println("Feminino"); break;
		case 2: System.out.println("Masculino"); break;
		default: System.out.println("Sexo inválido");
	
}

}}

	
