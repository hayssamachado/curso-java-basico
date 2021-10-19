package hayMachado.cursojava.aula24labs;

import java.util.Date;

public class LivroDeBiblioteceInsta {
	public static void main(String[] args) {
		LivroDeBiblioteca livro = new LivroDeBiblioteca();

		livro.autor = "Penelope Douglas";
		livro.anoLancamento = 2017;
		livro.edicao = 2;
		livro.editora = "Arqueiro";
		livro.numCapitulo = 30;
		livro.numPaginas = 400;
		livro.titulo = "Punk 57";
		livro.isbn = "dark";
		livro.emprestado = true;
		livro.dataDeEntrega = new Date();
		livro.emprestadoA = "Calebe";

		System.out.println("Nome do Livro = " + livro.titulo);
	}
}
