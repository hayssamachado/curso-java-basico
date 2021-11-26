package hayMachado.cursojava.aula36.relacionamentoEntreClasses;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Harry Potter");

		// contato.setTelefone("999999 - 999999");

		// criar objeto endereco
		// relacionamento tem um endereco
		Endereco end = new Endereco();
		end.setNomeRua("Hogwarts");
		end.setNumero("n/a");
		end.setComplemento("Mapa do maroto");
		end.setCidade("Vila bruxa de Hogsmeade.");
		end.setEstado("Escócia");
		end.setCep("999888888");

		contato.setEndereco(end);
		// relacionamento tem um telefone
		Telefone tel = new Telefone();
		tel.setTipo("celular");
		tel.setNumero("98769-8876");
		tel.setDdd("62");

		Telefone tel2 = new Telefone();
		tel2.setTipo("cassa");
		tel2.setNumero("32398-7698876");
		tel2.setDdd("62");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;

		contato.setTelefones(telefones);

		// teste saída no console
		System.out.println(contato.getNome());

		if (contato != null && contato.getEndereco() != null) {

			System.out.println(contato.getEndereco().getCidade());

		}

		if (contato != null && contato.getTelefones() != null)

		{
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());

			}

		}
	}
}
