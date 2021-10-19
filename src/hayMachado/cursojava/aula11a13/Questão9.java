package hayMachado.cursojava.aula11a13;

import java.util.Scanner;

public class Questão9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Qual a temperatura de hoje em Farenheit? ");
		double temperaturaF = scan.nextDouble();
		
		System.out.println("A temperatura de hoje em Celsius é: " + ((temperaturaF - 32)/ 1.8));

	}

}
