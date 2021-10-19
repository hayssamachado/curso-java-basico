package hayMachado.cursojava.aula14a15labs;

import java.util.Scanner;

public class Questao12 { public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas trabalhadas a mês?");
		double qtdHoras = scan.nextDouble();
		double salarioBruto = valorHora * qtdHoras;
		int percentualir = 0;
		if(salarioBruto <= 900) {
			percentualir = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500 ){
			percentualir = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500 ){
			percentualir = 10;
		} else if (salarioBruto > 2500 ){
			percentualir = 20;
		double ir = (salarioBruto / 100) * percentualir;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		System.out.println("Salário Bruto:( " + valorHora + "*" + qtdHoras +  "):" +salarioBruto );
		System.out.println("(-)INSS (10%): " + inss);
		System.out.println("FGTS (11%):"+ fgts);
		System.out.println("(-) IR (" + percentualir + "%)" + ir);
		System.out.println("Total de descontos" + totalDescontos);
		System.out.println("Salario liquido" + salarioLiquido);
	
}

}}
