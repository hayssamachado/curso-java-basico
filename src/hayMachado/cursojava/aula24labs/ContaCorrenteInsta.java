package hayMachado.cursojava.aula24labs;

public class ContaCorrenteInsta {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();

		conta.agencia = "Anapolis";
		conta.saldoConta = 0.00;
		conta.linmiteEspecial = true;
		conta.limiteEspecial = 50.00;
		conta.numero = "12334";

		System.out.println("Seu saldo é: " + conta.saldoConta);
	}

}
