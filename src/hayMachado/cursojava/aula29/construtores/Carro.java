package hayMachado.cursojava.aula29.construtores;

class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	Carro() {
		System.out.println("Classe carro foi Instanciada");
		numPassageiros = 9;
	}

	Carro(String marca_, String modelo_, int numPassageiro_, double capCombustivel_, double consumoCombustive_) {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiro_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustive_;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
	}

	double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;

	}
}
