
package hayMachado.cursojava.aula41.abstrata;

public class Aluno extends Pessoa {

	private String cursos;
	private String notas[][];

	public void verificarAcesso() {

		this.nomeVisibilidade = "hbuhbkvkgv";
		super.nomeVisibilidade = "blhbiuhblhkb";
	}

	public Aluno() {
		super();

	}

	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}

	public String[][] getNotas() {
		return notas;
	}

	public void setNotas(String[][] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;

	}

	public boolean verificarAprovado() {
		return true;
	}

	public void metodoQualquer() {
		super.setCpf("345345345354");

		this.setCpf("34534534");
	}

	public String obterEtiquetaEndereco() {
		String s = "Endereco do Aluno: ";
		s += super.getEndereco();

		return s;

	}

	@Override
	public void immprimirEtiquetaEndereco() {
		System.out.println("Imprimindo Endereço do Aluno");
		System.out.println(this.obterEtiquetaEndereco());

	}

}
