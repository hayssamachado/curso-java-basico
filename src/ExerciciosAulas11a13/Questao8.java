package ExerciciosAulas11a13;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Quanto você ganha por hora?");
		double porHora = scan.nextDouble();
		
		System.out.println("Quantas horas trabalhadas a mês?");
		double horaMes = scan.nextDouble();
		double salarioMes = porHora * horaMes;
		System.out.println("Seu salário por mês é: " + salarioMes);
		

	}

}
