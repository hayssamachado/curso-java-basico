package ExerciciosAulas11a13;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Quanto voc� ganha por hora?");
		double porHora = scan.nextDouble();
		
		System.out.println("Quantas horas trabalhadas a m�s?");
		double horaMes = scan.nextDouble();
		double salarioMes = porHora * horaMes;
		System.out.println("Seu sal�rio por m�s �: " + salarioMes);
		

	}

}
