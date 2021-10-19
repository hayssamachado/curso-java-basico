package hayMachado.cursojava.aula25a27labs;

public class TesteLampada {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.ligar();
		lampada.mostrarEstado();

		lampada.desligar();
		lampada.mostrarEstado();
		lampada.mudarEstado();
	}
}