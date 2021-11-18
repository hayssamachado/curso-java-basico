package hayMachado.cursojava.aula30.palavrachavathis;

class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public Carro() {
	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {

		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando contrutor com 3 parametros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando contrutor com 2 parametros");

	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + this.capCombustivel * this.capCombustivel);
	}

	double obterAutonomia() {
		System.out.println("M�todo obter autonomia foi chamado.");
		return this.capCombustivel * this.capCombustivel;
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km / this.consumoCombustivel;

		return qtdCombustivel;

	}
}
