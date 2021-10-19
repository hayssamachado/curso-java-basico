package hayMachado.cursojava.aula25a27labs;

class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLUZ;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;

	boolean ligada;

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		if (ligada) {

			System.out.println("Lampada está ligada");
		}

		else {

			System.out.println("Lampada está desligada");

		}if (ligada) {
			desligar();}
		else {
			ligar();}
		
	}

	void mudarEstado() {

	}
}