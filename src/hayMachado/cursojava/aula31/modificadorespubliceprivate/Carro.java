package hayMachado.cursojava.aula31.modificadorespubliceprivate;

public class Carro {
	public String marca;
	String modelo;
	int numPassageiros;
	private double capCombustivel;
	double consumoCombustivel;

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.capCombustivel);
	}

	public double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado.");
		return this.capCombustivel * this.capCombustivel;
	}
	private double divideKMPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	public double calcularCombustivel(double km) {

		return this.divideKMPorConsumoCombustivel(km);

	}
}
