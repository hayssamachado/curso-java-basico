package hayMachado.cursojava.aula14a15labs;

import java.util.Scanner;

public class Questao4 { 
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Verifique se � vogal ou consoante: ");
		String lerLetras = scan.next();
		
		if ( lerLetras.length() > 1) { 
			System.out.println("Nao � uma letra v�lida");
		}
		
		switch (lerLetras) {
		case "a": System.out.println("� vogal"); break;
        case "A": System.out.println("� vogal"); break;
        case "e": System.out.println("� vogal"); break;
        case "E": System.out.println("� vogal"); break;
        case "i": System.out.println("� vogal"); break;
        case "I": System.out.println("� vogal"); break;
        case "o": System.out.println("� vogal"); break;
        case "O": System.out.println("� vogal"); break;
        case "u": System.out.println("� vogal"); break;
        case "U": System.out.println("� vogal"); break;
        default: System.out.println("� consoante");
		
		
	}}}
