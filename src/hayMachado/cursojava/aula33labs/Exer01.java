package hayMachado.cursojava.aula33labs;

public class Exer01 {
	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.ligar();
		
		lampada.mostrarEstado();

		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();

	}
}
