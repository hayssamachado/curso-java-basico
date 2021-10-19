package hayMachado.cursojava.aula14;

import hayMachado.cursojava.aula25a27labs.ContaCorrente;

public class Exer02 {
	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		conta.valorEspecialUsado = 0;

		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

		boolean saqueEfetuado = conta.realizarSaque(10);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta = " + conta.saldo);
		}

		else {
			System.out.println("Nao foi possivel realizar saque, saldo insuficiente.");
		}
		System.out.println("Depósito de 500 reais");
		conta.depositar(500);
		conta.consultarSaldo();

		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}

		conta.realizarSaque(600);
		conta.consultarSaldo();
		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
	}

}
