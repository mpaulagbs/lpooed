import java.util.Scanner;
import java.util.ArrayList;

public class Lista5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Livraria2> livrarias = new ArrayList<Livraria2>();
		Livraria2 nova_livraria;
		boolean verification = false;
		int opcao = 1;
		String nome, nome_cidade, nome_estado, nome_gerente = "Nenhum gerente cadastrado.";

		while (opcao != 0) {
			System.out.println("1. Cadastrar Livraria\r\n" + 
					"2. Cadastrar Funcion�rio em uma livraria\r\n" + 
					"3. Definir gerente de uma livraria\r\n" + 
					"4. Adicionar livros em uma livraria\r\n" + 
					"5. Listar os livros de uma livraria\r\n" + 
					"6. Listar os funcion�rios de uma livraria\r\n" + 
					"7. Listar os gerentes das livrarias cadastradas\r\n" + 
					"0. Sair");

			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:

				System.out.println("Digite o nome da livraria: ");
				nome = sc.nextLine();
				System.out.println("Digite o nome da cidade onde est� essa livraria: ");
				nome_cidade = sc.nextLine();
				System.out.println("Digite o nome do estado onde est� essa livraria");
				nome_estado = sc.nextLine();

				nova_livraria = new Livraria2(nome, nome_cidade, nome_estado, nome_gerente, null, null);
				livrarias.add(nova_livraria);

				verification = true;
				break;
			case 2:

				if (verification == true) {

					Livraria2 resultado_metodo = procurar_livraria(livrarias);

					if (resultado_metodo != null) {

						ArrayList<Funcionario> funcionarios_atuais = resultado_metodo.getFuncionario();

						System.out.println("Digite o nome do funcion�rio: ");
						String nome_funcionario = sc.nextLine();
						System.out.println("Digite o CPF deste funcion�rio: ");
						String cpf = sc.nextLine();
						System.out.println("Digite o endere�o deste funcion�rio: ");
						String endereco = sc.nextLine();
						System.out.println("Digite o telefone deste funcion�rio: ");
						String telefone = sc.nextLine();

						if (funcionarios_atuais == null) {
							funcionarios_atuais = new ArrayList<Funcionario>();
						}

						funcionarios_atuais.add(new Funcionario(nome_funcionario, cpf, endereco, telefone));
						resultado_metodo.setFuncionario(funcionarios_atuais);

						System.out.println("Funcion�rio de nome: " + nome_funcionario + " e de CPF " + cpf
								+ " foi adicionado com sucesso: \n");

					} else {

						System.out.println("Nenhuma livraria encontrada: ");
					}

				} else if (verification != true) {
					System.out.println("Nenhuma livraria cadastrada. Cadastre primeiro: ");

				}
				break;
			case 3:

				if (verification == true) {

					Livraria2 resultado_metodo_gerente = procurar_livraria(livrarias);

					if (resultado_metodo_gerente != null) {

						System.out.println("Digite o nome do gerente: ");
						String novo_gerente = sc.nextLine();

						resultado_metodo_gerente.setNome_gerente(novo_gerente);

						System.out.println("Gerente cadastrado com sucesso: ");
					} else {
						System.out.println("Nenhuma livraria encontrada: ");
					}
				} else if (verification != true) {
					System.out.println("Nenhuma livraria cadastrada. Cadastre primeiro");
				}
				break;
			case 4:

				if (verification == true) {
					Livraria2 resultado_metodo_adicionar_livros = procurar_livraria(livrarias);

					if (resultado_metodo_adicionar_livros != null) {

						ArrayList<Livro3> livros_atuais = resultado_metodo_adicionar_livros.getLivro();

						System.out.println("Digite o titulo do livro: ");
						String titulo = sc.nextLine();
						System.out.println("Digite o autor/a desse livro: ");
						String autor = sc.nextLine();
						System.out.println("Digite a editora desse livro: ");
						String editora = sc.nextLine();
						System.out.println("Digite o ISBN desse livro: ");
						String isbn = sc.nextLine();
						System.out.println("Digite o ano de edi��o desse livro: ");
						String ano_edicao = sc.nextLine();

						if (livros_atuais == null) {
							livros_atuais = new ArrayList<Livro3>();
						}

						livros_atuais.add(new Livro3(autor, isbn, editora, titulo, ano_edicao));
						resultado_metodo_adicionar_livros.setLivro(livros_atuais);

						System.out.println("Livro de t�tulo: " + titulo + " e de ISBN " + isbn
								+ " foi adicionado com sucesso: \n");

					} else {

						System.out.println("Nenhuma livraria encontrada: ");
					}
				} else if (verification != true) {
					System.out.println("Nenhuma livraria cadastrada. Cadastre primeiro");

				}
				break;
			case 5:
				if (verification == true) {
					Livraria2 resultado_metodo_mostrar_livros = procurar_livraria(livrarias);
					if (resultado_metodo_mostrar_livros != null) {

						listar_livros(resultado_metodo_mostrar_livros);
					} else {
						System.out.println("Livraria inexistente: ");
					}

				} else if (verification != true) {
					System.out.println("Nenhuma livraria cadastrada. Cadastre primeiro");
				}
				break;
			case 6:
				if (verification == true) {

					Livraria2 resultado_metodo_listar_funcionarios = procurar_livraria(livrarias);
					if (resultado_metodo_listar_funcionarios != null) {

						listar_funcionarios(resultado_metodo_listar_funcionarios);
					} else {
						System.out.println("Livraria inexistente: ");
					}

				} else if (verification != true) {
					System.out.println("Nenhuma livraria cadastrada. Cadastre primeiro");
				}
				break;
			case 7:

				if (verification == true) {
					listar_gerentes(livrarias);
				} else if (verification != true) {
					System.out.println("Nenhuma livraria cadastrada. Cadastre primeiro");
				}
				break;
			case 0:

				System.out.println("Obrigado por sua presen�a: ");
				System.exit(0);

				break;
			default:
				System.out.println("Escolha uma op��o vi�vel: ");
			}

		}

	}

	public static Livraria2 procurar_livraria(ArrayList<Livraria2> livrarias) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Nome da livraria: ");
		String nomeLivraria = sc.nextLine();

		for (int i = 0; i < livrarias.size(); i++) {
			if (nomeLivraria.contentEquals(livrarias.get(i).getNome())) {
				return livrarias.get(i);
			}
		}
		return null;

	}

	public static void listar_livros(Livraria2 livraria_escolhida) {

		if (livraria_escolhida.getLivro() == null) {
			System.out.println("Ainda n�o h� nenhum livro cadastrado nesta livraria: ");
		} else {
			if (livraria_escolhida.getLivro() != null) {
				for (Livro3 livro3 : livraria_escolhida.getLivro()) {

					System.out.println("Nome do livro: " + livro3.getTitulo());
					System.out.println("Autor do livro: " + livro3.getAutor());
					System.out.println("Isbn do livro: " + livro3.getIsbn() + "\n");
				}
			}

		}

	}

	public static void listar_funcionarios(Livraria2 livraria_escolhida) {

		if (livraria_escolhida.getFuncionario() != null) {
			for (Funcionario funcionario : livraria_escolhida.getFuncionario()) {
				System.out.println("Nome do funcion�rio: " + funcionario.getNome());
				System.out.println("CPF do funcion�rio: " + funcionario.getCpf() + "\n");
			}

		} else {
			System.out.println("Ainda n�o existem funcion�rios cadastrados.");
		}

	}

	public static void listar_gerentes(ArrayList<Livraria2> livraria) {

		for (Livraria2 livraria2 : livraria) {
			System.out.println("Nome da livraria: " + livraria2.getNome());
			System.out.println("Gerente da livraria: " + livraria2.getNome_gerente() + "\n");
		}
	}

}
