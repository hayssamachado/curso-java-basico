package hayMachado.cursojava.aula11a13;

import java.util.Scanner;

public class questao131 {

	
	

	public static void main(String[] args) {
		
		
			
				
				Scanner scan = new Scanner(System.in);
				

				System.out.println("Quanto voc� ganha por hora?");
				double porHora = scan.nextDouble();
				
				System.out.println("Quantas horas trabalhadas a m�s?");
				double horaMes = scan.nextDouble();
				double salarioBruto = porHora * horaMes;
				double inss = (salarioBruto / 100) * 8;
				double sindicato = (salarioBruto / 100) * 5;
				double ir = (salarioBruto / 100) * 11;
				double totalDescontos = inss + sindicato + ir;
				double salarioLiquido = salarioBruto - totalDescontos;
				System.out.println("sal�rio por m�s �: " + salarioBruto);
				System.out.println("INSS" + inss);
				System.out.println("Sindicato" + sindicato);
				System.out.println("IR" + ir);
				System.out.println("Total de descontos" + totalDescontos);
				System.out.println("Salario liquido" + salarioLiquido);
				
	}

}
