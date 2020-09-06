import java.util.Scanner;
import java.util.ArrayList;

public class Lista4_questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Conta> array = new ArrayList<Conta>();
		Conta c = null;
		boolean cont = true;

		while (cont) {
			System.out.println("1. Cadastrar Conta\r\n" + 
					"2. Realizar depósito (Buscar pelo CPF do cliente)\r\n" + 
					"3. Realizar saque (Buscar pelo CPF do cliente)\r\n" + 
					"4. Verificar saldo (Buscar pelo CPF do cliente)\r\n" + 
					"5. Consultar número e nome da agência (Mostrar nome e o CPF do cliente)\r\n" + 
					"6. Alterar o número e nome da agência (Buscar pelo nome do cliente)\r\n" + 
					"0. Sair");
			int opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("informe o número da agencia");
				int numagencia = sc.nextInt();
				System.out.println("infome o nome da agencia");
				String nomeagencia = sc.next();
				Banco b = new Banco(numagencia, nomeagencia);

				System.out.println("informe o nome do cliente");
				String nome = sc.next();
				System.out.println("informe o cpf do cliente");
				String cpf = sc.next();
				Cliente cl = new Cliente(nome, cpf);

				System.out.println("informe o número da conta");
				int num = sc.nextInt();
				System.out.println("informe o saldo da conta");
				double saldo = sc.nextDouble();
				c = new Conta(num, b, cl, saldo);
				array.add(c);
				break;
			case 2:
				if (c == null) {
					System.out.println("cadastre uma conta");
				} else {
					System.out.println("informe o cpf");
					String cpfbusca = sc.next();
					for (int x = 0; x < array.size(); x++) {
						if (array.get(x).getCliente().getCpf().equals(cpfbusca)) {
							System.out.println("informe o valor do deposito");
							double valor = sc.nextDouble();
							array.get(x).depositar(valor);
						}
					}
				}
				break;
			case 3:
				if (c == null) {
					System.out.println("cadastre uma conta");
				} else {
					System.out.println("informe o cpf");
					String cpfbusca = sc.next();
					for (int x = 0; x < array.size(); x++) {
						if (array.get(x).getCliente().getCpf().equals(cpfbusca)) {
							System.out.println("informe o valor do saque");
							double valor = sc.nextDouble();
							array.get(x).saque(valor);
						}
					}
				}
				break;
			case 4:
				if (c == null) {
					System.out.println("cadastre uma conta");
				} else {
					System.out.println("informe o cpf");
					String cpfbusca = sc.next();
					for (int x = 0; x < array.size(); x++) {
						if (array.get(x).getCliente().getCpf().equals(cpfbusca)) {
							System.out.println(array.get(x).getSaldo());
						}
					}
				}
				break;
			case 5:
				if (c == null) {
					System.out.println("cadastre uma conta");
				} else {
					for (int x = 0; x < array.size(); x++) {
						System.out.println(array.get(x).getBanco().getNomeagencia() + array.get(x).getBanco().getNumagencia());
						System.out.println(array.get(x).getCliente().getNome() + array.get(x).getCliente().getCpf());
					}
				}
				break;
			case 6:
				if (c == null) {
					System.out.println("cadastre uma conta");
				} else {
					System.out.println("informe o nome do cliente");
					String nomec = sc.next();
					for (int x = 0; x < array.size(); x++) {
						if (array.get(x).getCliente().getNome().equals(nomec)) {
							System.out.println("informe o novo nome para a agencia");
							String newnome = sc.next();
							array.get(x).getBanco().setNomeagencia(newnome);
							System.out.println("informe o novo número para a agencia");
							String newnum = sc.next();
							array.get(x).getBanco().setNomeagencia(newnum);
						}
					}
				}
				break;
			case 0:
				cont = false;
				break;
			}
		}
	}
}
