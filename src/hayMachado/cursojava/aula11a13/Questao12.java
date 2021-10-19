package hayMachado.cursojava.aula11a13;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] ags) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite sua altura e daremos seu peso ideal: " );
		double altura = scan.nextDouble();
		double pesoideal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoideal);
		
	}

}
