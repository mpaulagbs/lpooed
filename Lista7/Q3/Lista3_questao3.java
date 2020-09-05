import java.util.Scanner;
import java.util.ArrayList;
public class Lista3_questao3 {

	public static void console() {
		System.out.println("1. Cadastrar Conta\r\n" + 
				"2. Realizar depósito (procurar pelo nome do cliente)\r\n" + 
				"3. Realizar saque (procurar pelo nome do cliente)\r\n" + 
				"4. Verificar saldo (procurar pelo nome do cliente)\r\n" + 
				"5. Consultar Cliente (Mostrar nome e o CPF do cliente)\r\n" + 
				"0. Sair");
	}
	public static void deposito(ArrayList<Gerenciamento> lista, String nomecliente) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNomecliente().contains(nomecliente)) {

				System.out.println("informe o valor que você quer depositar: ");
				double deposito = sc.nextDouble();

				lista.get(i).setSaldo(deposito);
				System.out.println("");
				System.out.println("Depósito efetuado: ");

			}
		}

	}

	public static void saque(ArrayList<Gerenciamento> lista, String nomecliente) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNomecliente().contains(nomecliente)) {

				if (lista.get(i).getSaldo() < 1) {

					System.out.println("primeiro faça o deposite");
				} else if (lista.get(i).getSaldo() >= 1) {
					System.out.println("informe o valor que você quer sacar: ");
					System.out.println("Limite Disponível: " + lista.get(i).getSaldo());
					System.out.println("");
					double sacada = sc.nextDouble();

					while (sacada > lista.get(i).getSaldo() || sacada <= 0) {
						System.out.println("erro");
						sacada = sc.nextDouble();

					}
					sacada = lista.get(i).getSaldo() - sacada;
					lista.get(i).setSaldo(sacada);
					System.out.println(
							"depósito efetuado com sucesso. Saldo restante em reais: " + lista.get(i).getSaldo());
				}
			}
		}
	}

	public static void vsaldo(ArrayList<Gerenciamento> lista, String nomecliente) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNomecliente().contains(nomecliente)) {
				System.out.println("O saldo da conta deste cliente é: " + lista.get(i).getSaldo());
			}
		}
	}

	public static void consulcliente(ArrayList<Gerenciamento> lista) {
		System.out.println("todos os clientes e seus respectivos CPF´S: ");
		System.out.println("");
		for (int i = 0; i < lista.size(); i++) {

			System.out.println(
					"nome do cliente: " + lista.get(i).getNomecliente() + " CPF: " + lista.get(i).getCpf());
			System.out.println("");
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Gerenciamento> lista = new ArrayList<Gerenciamento>();
		boolean aver = false;
		int op = 99;
		String numeroconta, agencia, nomecliente, cpf;
		double saldo;
		Gerenciamento conta;

		while (op != 0) {
			console();
			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				System.out.println("informe o número da conta: ");
				numeroconta = sc.nextLine();
				System.out.println("informe a agência: ");
				agencia = sc.nextLine();
				System.out.println("informe o nome do cliente: ");
				nomecliente = sc.nextLine();
				System.out.println("informe o CPF do cliente: ");
				cpf = sc.nextLine();
				saldo = 0;

				conta = new Gerenciamento(numeroconta, agencia, nomecliente, saldo, cpf);
				lista.add(conta);

				aver = true;

				break;

			case 2:

				if (aver == true) {

					System.out.println("informe o nome do cliente que você quer fazer o depósito: ");
					nomecliente = sc.nextLine();

					deposito(lista, nomecliente);

				}

				else if (aver != true) {
					System.out.println("nada encontrado: ");
				}

				break;
			case 3:

				if (aver == true) {

					System.out.println("informe o nome do cliente que você quer fazer o saque: ");
					nomecliente = sc.nextLine();
					saque(lista, nomecliente);

				}

				else if (aver != true) {
					System.out.println("nada encontrado: ");
				}

				break;
			case 4:

				if (aver == true) {

					System.out.println("informe o nome do cliente que você quer verificar o saldo: ");
					nomecliente = sc.nextLine();
					vsaldo(lista, nomecliente);
				}

				else if (aver != true) {
					System.out.println("nada encontrado: ");
				}

				break;
			case 5:

				if (aver == true) {

					consulcliente(lista);

				}

				else if (aver != true) {
					System.out.println("nada encontrado: ");
				}

				break;
			case 0:
				System.out.println("Obrigada! ");
				System.exit(0);
				break;

			default:
				System.out.println("Escolha outra opcao:");

			}

		}

	}

}