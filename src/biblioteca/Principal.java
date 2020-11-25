package biblioteca;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		// Objetos
		Livro livro = new Livro("Guia Java", "Saraiva", 2000, "Tom Jobim", 250, 4, true);
		Livro livro1 = new Livro("Guia Python", "Saraiva", 2010, "Thais Jabm", 100, 2, true);
		Livro livro2 = new Livro("Rosas", "Artica", 2013, "Fernando Pessoa", 500, 1, true);

		Aluno aluno = new Aluno("4123234234", "Lucas", "Chagas", 24, "Noturno", "1234", "Terceiro");

		int opcao = -1;

		// Iniciando o Menu

		while (opcao != 0) {
			System.out.println("\n\n\n**** MENU PRINCIPAL ****");
			System.out.println("\nDigite a opção de acesso: ");
			System.out.println(
					"1. Cadastrar Aluno\n2. Cadastrar Livro \n3. Emprestar Livro \n4. Devolver Livro \n0. Sair ");
			opcao = read.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Nome: ");
				aluno.setNome(read.next());
				System.out.println("Sobrenome: ");
				aluno.setSobrenome(read.next());
				System.out.println("CPF: ");
				aluno.setCpf(read.next());
				System.out.println("Idade: ");
				aluno.setIdade(read.nextInt());
				System.out.println("Período: ");
				aluno.setPeriodo(read.next());
				System.out.println("Série: ");
				aluno.setSerie(read.next());
				System.out.println("Registro: ");
				aluno.setRegistroAluno(read.next());
				System.out.println("Cadastrado com Sucesso !");

				break;
			case 2:
				System.out.println("Título");
				livro.setTitulo(read.next());
				System.out.println("Editora: ");
				livro.setEditora(read.next());
				System.out.println("Ano: ");
				livro.setAnoPublicacao(read.nextInt());
				System.out.println("Autor: ");
				livro.setAutor(read.next());
				System.out.println("Quantidade de Páginas: ");
				livro.setQuantidadePaginas(read.nextInt());
				System.out.println("Quantidade Livro: ");
				livro.setQuantidadeLivro(read.nextInt());
				livro.setDisponivel(true);
				System.out.println("Cadastrado com Sucesso !");
				break;
			case 3:
				System.out.println("Escolha o livro: ");
				System.out.println("1." + livro.toString());
				System.out.println("2." + livro2.toString());
				System.out.println("3." + livro1.toString());

				int escolha = read.nextInt();

				switch (escolha) {
				case 1:
					System.out.println(livro.toString());
					System.out.println(aluno.emprestarLivro());
					break;
				case 2:
					System.out.println(livro2.toString());
					System.out.println(aluno.emprestarLivro());
					break;
				case 3:
					System.out.println(livro1.toString());
					System.out.println(aluno.emprestarLivro());
					break;
				default:
					System.out.println("Escolha inválida !!!");
					break;
				}
				System.out.println("\nDigite qualquer tecla + enter para voltar ao MENU...");
				read.next();
				break;
			case 4:
				System.out.println(aluno.getNome());
				if (aluno.getQuantidadeEmprestimo() == 0) {
					System.out.println(aluno.devolverLivro());
				} else {
					System.out.println("Não há livros a devolver.");
				}
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Valor inválido, digite novamente...\n");
				break;
			}

		}
		read.close();

	}
}
