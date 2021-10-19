package hayMachado.cursojava.aula14a15labs;

import java.util.Scanner;

public class Questao4 { 
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Verifique se é vogal ou consoante: ");
		String lerLetras = scan.next();
		
		if ( lerLetras.length() > 1) { 
			System.out.println("Nao é uma letra válida");
		}
		
		switch (lerLetras) {
		case "a": System.out.println("É vogal"); break;
        case "A": System.out.println("É vogal"); break;
        case "e": System.out.println("É vogal"); break;
        case "E": System.out.println("É vogal"); break;
        case "i": System.out.println("É vogal"); break;
        case "I": System.out.println("É vogal"); break;
        case "o": System.out.println("É vogal"); break;
        case "O": System.out.println("É vogal"); break;
        case "u": System.out.println("É vogal"); break;
        case "U": System.out.println("É vogal"); break;
        default: System.out.println("É consoante");
		
		
	}}}
