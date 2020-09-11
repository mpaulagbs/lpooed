import java.util.Scanner;
import java.util.ArrayList;
public class Lista4_questao3 {

	public static void enunciado() {

		System.out.println("1. Cadastrar turma (O sistema deve permitir armazenar 10 turmas)\r\n" + 
				"2. Cadastrar estudante (É necessário buscar uma turma pelo código Antes de\r\n" + 
				"adicionar um estudante)\r\n" + 
				"3. Listar turmas (Exibir todas as turmas cadastradas)\r\n" + 
				"4. Listar estudantes por turma (Buscar turma pelo código)\r\n" + 
				"5. Consultar média de um estudante (Buscar pelo código da turma e número\r\n" + 
				"de matrícula do estudante)\r\n" + 
				"6. Alterar notas de um estudante (Buscar pelo código da turma e número de\r\n" + 
				"matrícula do estudante)\r\n" + 
				"7. Exibir média dos estudantes de uma turma (Buscar pelo código da turma e\r\n" + 
				"exibir a média dos estudantes da referida turma)\r\n" + 
				"0. Sair");
	}
	public static Turma acharturma(ArrayList<Turma> lista) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o código da sala: ");
		String sala_procurada = sc.nextLine();
		for (int i = 0; i < lista.size(); i++) {
			if (sala_procurada.contentEquals(lista.get(i).getCodigo())) {
				return lista.get(i);
			}
		}
		return null;
	}
	public static void alunosmedia(ArrayList<Turma> lista, Turma turmaescolhida) {
		Scanner sc = new Scanner(System.in);

		if ((turmaescolhida).getAluno() != null) {

			for (Aluno aluno : turmaescolhida.getAluno()) {
				double media = (aluno.getNota_1() + aluno.getNota_2() + aluno.getNota_3() + aluno.getNota_4()) / 4;
				System.out.println("Nome do estudante: " + aluno.getNome());
				System.out.println("Matrícula do estudante: " + aluno.getMatricula());
				System.out.println("Média do estudante: " + media + "\n");

			}
		} else {
			System.out.println("Ainda não há alunos cadastrados.");
		}
	}
	public static void listalunos(Turma turmaescolhida) {
		if ((turmaescolhida).getAluno() != null) {
			for (Aluno aluno : turmaescolhida.getAluno()) {
				System.out.println("Nome do aluno: " + aluno.getNome());
				System.out.println("Matricula do aluno: " + aluno.getMatricula() + "\n");
			}

		} else {
			System.out.println("Ainda não há alunos cadastrados.");
		}

	}

	public static void listaturmas(ArrayList<Turma> turma) {
		for (Turma turminha : turma) {
			System.out.println("Nome da turma: " + turminha.getNome_turma());
			System.out.println("Código da turma: " + turminha.getCodigo() + "\n");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Turma> lista = new ArrayList<Turma>();
		Boolean verificacao = false, verificador = false;
		Aluno estudante;
		Turma classe;
		String codigo, nometurma;
		String nomealuno, matricula;
		double nota_1, nota_2, nota_3, nota_4;
		int opcao = 99, quanturma = 0;

		while (opcao != 0) {

			enunciado();
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				if (quanturma < 10) {

					System.out.println("Digite o nome da turma: ");
					nometurma = sc.nextLine();
					System.out.println("Digite o código da turma: ");
					codigo = sc.nextLine();

					classe = new Turma(codigo, nometurma, null);
					lista.add(classe);

					verificacao = true;
					quanturma++;

				} else if (quanturma == 10) {
					System.out.println("Limite de turmas cadastradas alcançado:");

				}

				break;
			case 2:
				if (verificacao == true) {

					Turma resultmetodo = acharturma(lista);

					if (resultmetodo != null) {

						ArrayList<Aluno> alunosatuais = resultmetodo.getAluno();

						System.out.println("Digite o nome do aluno: ");
						nomealuno = sc.nextLine();
						System.out.println("Digite a matrícula deste aluno: ");
						matricula = sc.nextLine();
						System.out.println("Digite a primeira nota deste aluno: ");
						nota_1 = sc.nextDouble();
						System.out.println("Digite a segunda nota deste aluno: ");
						nota_2 = sc.nextDouble();
						System.out.println("Digite a terceira nota deste aluno: ");
						nota_3 = sc.nextDouble();
						System.out.println("Digite a quarta nota deste aluno: ");
						nota_4 = sc.nextDouble();

						if (alunosatuais == null) {
							alunosatuais = new ArrayList<Aluno>();
						}

						alunosatuais.add(new Aluno(nomealuno, matricula, nota_1, nota_2, nota_3, nota_4));
						resultmetodo.setAluno(alunosatuais);

						System.out.println("Aluno de nome: " + nomealuno + " e de matrícula " + matricula
								+ " foi adicionado com sucesso: \n");

					} else {

						System.out.println("Nenhuma Turma encontrada: ");
					}

				} else if (verificacao != true) {
					System.out.println("Nenhuma Turma cadastrada. Cadastre primeiro: ");

				}
				break;
			case 3:
				if (verificacao == true) {
					listaturmas(lista);
				}

				else if (verificacao != true) {
					System.out.println("Nenhuma turma cadastrada. Cadastre primeiro");
				}
				break;

			case 4:
				if (verificacao == true) {

					Turma listaralunos = acharturma(lista);
					if (listaralunos != null) {

						listalunos(listaralunos);
					} else {
						System.out.println("Turma inexistente: ");
					}
				}

				else if (verificacao != true) {
					System.out.println("Nenhuma turma cadastrada. Cadastre primeiro");
				}
				break;
			case 5:
				if (verificacao == true) {

					Turma listaralunos = acharturma(lista);
					if (listaralunos != null) {

						alunomedia(lista, listaralunos);
					} else {
						System.out.println("Turma inexistente: ");
					}
				}

				else if (verificacao != true) {
					System.out.println("Nenhuma turma cadastrada. Cadastre primeiro");
				}
				break;
			case 6:
				if (verificacao == true) {

					Turma listaralunos = acharturma(lista);
					if (listaralunos != null) {

						alterarmedia(lista, listaralunos);
					} else {
						System.out.println("Turma inexistente: ");
					}
				}

				else if (verificacao != true) {
					System.out.println("Nenhuma turma cadastrada. Cadastre primeiro");
				}
				break;
			case 7:
				if (verificacao == true) {

					Turma resultado_metodo_listar_alunos = acharturma(lista);
					if (resultado_metodo_listar_alunos != null) {

						alunosmedia(lista, resultado_metodo_listar_alunos);
					} else {
						System.out.println("Turma inexistente: ");
					}
				}

				else if (verificacao != true) {
					System.out.println("Nenhuma turma cadastrada. Cadastre primeiro");
				}
				break;

			case 0:
				System.out.println("Obrigado pela presença: ");
				System.exit(0);
			default:

			}
		}
	}
	public static void alunomedia(ArrayList<Turma> lista, Turma turmaescolhida) {
		Scanner sc = new Scanner(System.in);

		if ((turmaescolhida).getAluno() != null) {
			System.out.println("Informe a matrícula do aluno que você deseja: ");
			String matricula = sc.nextLine();

			for (Aluno aluno : turmaescolhida.getAluno()) {
				if (aluno.getMatricula().equals(matricula)) {

					double media = (aluno.getNota_1() + aluno.getNota_2() + aluno.getNota_3() + aluno.getNota_4()) / 4;

					System.out.println("Nome do estudante: " + aluno.getNome());
					System.out.println("Matrícula do estudante: " + aluno.getMatricula());
					System.out.println("Média do estudante: " + media + "\n");
				} else {
					System.out.println("matrícula não encontrada");
				}
			}

		} else {
			System.out.println("Ainda não há nenhum aluno cadastrado: ");
		}

	}
	public static void alterarmedia(ArrayList<Turma> lista, Turma turmaescolhida) {
		Scanner sc = new Scanner(System.in);
		if ((turmaescolhida).getAluno() != null) {
			System.out.println("Informe a matrícula do aluno que você deseja mudar as notas: ");
			String matricula = sc.nextLine();
			for (Aluno aluno : turmaescolhida.getAluno()) {
				if (aluno.getMatricula().equals(matricula)) {

					double primeira_nota, segunda_nota, terceira_nota, quarta_nota;
					System.out.println("Informe a primeira nova nota: ");
					primeira_nota = sc.nextDouble();
					System.out.println("Informe a segunda nova nota: ");
					segunda_nota = sc.nextDouble();
					System.out.println("Informe a terceira nova nota: ");
					terceira_nota = sc.nextDouble();
					System.out.println("Informe a quarta nova nota: ");
					quarta_nota = sc.nextDouble();
					System.out.println("");
					aluno.setNota_1(primeira_nota);
					aluno.setNota_2(segunda_nota);
					aluno.setNota_3(terceira_nota);
					aluno.setNota_4(quarta_nota);

					System.out.println("As notas foram alteradas: ");
				} else {
					System.out.println("matrícula não encontrada");
				}
			}

		} else {
			System.out.println("Ainda não há alunos cadastrados.");
		}
	}}
