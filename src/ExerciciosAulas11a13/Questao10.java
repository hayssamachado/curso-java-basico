package ExerciciosAulas11a13;


import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Qual a temperatura de hoje em Celsius? ");
		double temperaturaC = scan.nextDouble();
		
		System.out.println("A temperatura de hoje em Farenheit é: " + ((temperaturaC * 1.8) + 32));

	}

}
