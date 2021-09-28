package ExerciciosAulas11a13;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite uma medida em metros: ");
		float medidaMetros = scan.nextFloat();
		System.out.println("Sua medida em cm é: " + (medidaMetros * 100));
		
		
	}

}
