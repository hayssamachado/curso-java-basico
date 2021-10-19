package hayMachado.cursojava.aula24labs;

public class testeCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.consumoCombustivel = 0.2;

		Carro renegade = new Carro();
		renegade.marca = "Jeep";
		renegade.modelo = "renegade";

		System.out.println(van.marca);
		System.out.println(van.modelo);

		Carro fusca = new Carro();
		fusca.marca = "Volkswagem";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.consumoCombustivel = 0.2;

		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
	}

}
