package hayMachado.cursojava.aula25a27labs;

public class ContaCorrente {
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;

	// tem saldo na conta

	boolean realizarSaque(double quantiaASacar) {
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;

			return true;
		} else {// nao tem saldo na conta
			if (especial) {
				// verificar se o limite especial tem saldo
				double limite = limiteEspecial - saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}

	}

	// nao é especial e nao tem saldo suficiente

	void depositar(double valorDepositado) {

		saldo += valorDepositado;
	}

	void consultarSaldo() {
		System.out.println("saldo atual da conta = " + saldo);
	}

	boolean verificarUsoChequeEspecial() {
		return saldo < 0;

	}
}
