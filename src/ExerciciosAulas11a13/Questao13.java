package ExerciciosAulas11a13;

import java.util.Scanner;

public class Questao13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite sua Altura: ");
		double altura = scan.nextDouble();
		
		System.out.println("Digite 1 para Masculino, 2 para feminino sexo:");
		int sexoInformado = scan.nextInt();
		
		System.out.println(("Seu peso ideal: ") + (sexoInformado > 1));
	
				
	}
}
