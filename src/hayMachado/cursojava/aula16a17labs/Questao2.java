package hayMachado.cursojava.aula16a17labs;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean infoValidas = false;
		int tentativas = 0;

		do {
			System.out.println("Entre com o nome do usuario: ");
			String nomeUser = scan.next();

			System.out.println("Entre com uma senha");
			String senha = scan.next();

			if (nomeUser.equalsIgnoreCase(senha)) {
				infoValidas = false;
				tentativas++;
				System.out.println("Senha igual a usuário, digite novamente.");
			} else {
				infoValidas = true;
				tentativas = 0;
				System.out.println("Senha e usuarios validos.");
			}
			
			System.out.println("Tentativa: " + tentativas);
			
			if (tentativas >= 3) {
				System.out.println("Sua quantidade limite de tentativas expirou...");
			}

		} while (!infoValidas && tentativas < 3); // = infoValidas == false

//		while (!infoValidas) {
//			System.out.println("Entre com o nome do usuario: ");
//			String nomeUser = scan.next();
//
//			System.out.println("Entre com uma senha");
//			String senha = scan.next();
//
//			if (nomeUser.equalsIgnoreCase(senha)) {
//				infoValidas = false;
//				System.out.println("Senha igual a usuário, digite novamente.");
//			} else {
//				infoValidas = true;
//				System.out.println("Senha e usuarios validos.");
//			}
//		}
	}
}
