package hayMachado.cursojava.aula24labs;

public class LivroIsnta {

	public static void main(String[] args) {
	Livro livro = new Livro();
	
	livro.autor = "Penelope Douglas";
	livro.anoLancamento = 2017;
	livro.edicao = 2;
	livro.editora = "Arqueiro";
	livro.numCapitulo = 30;
	livro.numPaginas = 400;
	livro.titulo = "Punk 57";
	livro.isbn = "dark";
	
	System.out.println(" Autora: " + livro.autor+" Ano de Lancamento: " + livro.anoLancamento +" Editora: " + livro.editora);
	}
	

}
