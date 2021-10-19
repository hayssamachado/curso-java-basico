package hayMachado.cursojava.aula11a13;

import java.util.Scanner;

public class Questao11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		
		
		System.out.println("A seguir digite dois números inteiros...");
		System.out.println("Primeiro número: ");
		int numeroInt1 = scan.nextInt();
		System.out.println("Segundo número: ");
		int numeroInt2 = scan.nextInt();
		System.out.println("Agora digite um número real:");
		double numero3 = scan.nextDouble();
		
		double letraA = (numeroInt1 + (numeroInt2 / 2));
		System.out.println("VALOR DA LETRA A: " + letraA );
		double letraB = (numeroInt1 * 3) + numero3;
		System.out.println("VALOR DA LETRA B:" + letraB);
		double letraC = numero3 * numero3 * numero3;
		System.out.println("VALOR DA LETRA C" + letraC);
		
		
		
		
		
		
		
		
	}

}
