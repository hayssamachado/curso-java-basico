package hayMachado.cursojava.aula11a13;

import java.util.Scanner;

public class Questao6 {
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Informe o valor do raio: ");
			double raioCirculo = scan.nextDouble();
			
			double area = Math.PI * Math.pow(raioCirculo, 2);
			System.out.println(" Valor da area do círculo é: " + area);
		}

}
