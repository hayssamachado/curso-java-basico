package aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int resultado = 1 + 2; 
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta �:" + "uma string concatenada";
		System.out.println(primeiroNome);

		resultado = resultado + 1;
		System.out.println(resultado); 
		
		resultado ++;
		System.out.println(resultado); //5
		
		System.out.println(resultado++);//mesma coisa que resultado +1
		System.out.println(++resultado); // mesma coisa que resultado +=1
	}

}
