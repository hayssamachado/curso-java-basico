package hayMachado.cursojava.aula34.variaveisMetodosEstaticos;

public class TesteMinhaCalculadora {

	static int resultSoma;

	public static void main(String[] args) {

		/*
		 * MinhaCalculadora calculadora = new MinhaCalculadora();
		 * 
		 * int soma1 = MinhaCalculadora.soma(1, 2);
		 * 
		 * System.out.println(soma1);
		 * 
		 * int soma2 = MinhaCalculadora.soma(1, 2, 3);
		 * 
		 * System.out.println(soma2); calc.soma(1, 4); calc.soma(2, 10, 22);
		 */

		resultSoma = MinhaCalculadora.soma(1, 2);

	}

	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}

}