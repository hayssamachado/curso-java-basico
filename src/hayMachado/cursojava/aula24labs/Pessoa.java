package hayMachado.cursojava.aula24labs;

public class Pessoa {
	protected String nome;
	public int idade = 10;
	private String cpf;
	private String endereco;
	public int anos;
	
	public void envelhecer(int aumentaIdade) {
		System.out.println(idade = idade + aumentaIdade);
	}
	
}
