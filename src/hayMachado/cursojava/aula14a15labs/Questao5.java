package hayMachado.cursojava.aula14a15labs;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira suas notas");
		System.out.println("Digite sua primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		double nota2 = scan.nextDouble();
		
       double media = ((nota1 + nota2)/2);
       
       if (media >= 7) {
    	   System.out.println("Aprovado");
       } else if (media < 7) {
    	   System.out.println("Reprovado");
       } else if (media == 10) {
    	   System.out.println("Aprovado com distincao");
       }
       
}

}
