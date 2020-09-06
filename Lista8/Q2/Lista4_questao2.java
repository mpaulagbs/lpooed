import java.util.Scanner;
import java.util.ArrayList;

public class Lista4_questao2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Conta> array = new ArrayList<Conta>();
		Conta c = null;
		boolean continuar = true;

		while (continuar) {
			System.out.println("escolha uma opção \n1 = cadastrar conta \n2 = realizar depósito \n3 = realizar saque"
					+ "\n4 = verificar saldo \n5 = consultar número e nome da agencia \n6 = alterar nome e numero da agencia \n0 = sair");
			int opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("informe o número da agencia");
				int numagencia = teclado.nextInt();
				System.out.println("infome o nome da agencia");
				String nomeagencia = teclado.next();
				Banco b = new Banco(numagencia, nomeagencia);

				System.out.println("informe o nome do cliente");
				String nome = teclado.next();
				System.out.println("informe o cpf do cliente");
				String cpf = teclado.next();
				Cliente cl = new Cliente(nome, cpf);

				System.out.println("informe o número da conta");
				int num = teclado.nextInt();
				System.out.println("informe o saldo da conta");
				double saldo = teclado.nextDouble();
				c = new Conta(num, b, cl, saldo);
				array.add(c);
				break;
			case 2:
				if (c == null) {
					System.out.println("cadastre uma conta");
				} else {
					System.out.println("informe o cpf");
					String cpfbusca = teclado.next();
					for (int x = 0; x < array.size(); x++) {
						if (array.get(x).getCliente().getCpf().equals(cpfbusca)) {
							System.out.println("informe o valor do deposito");
							double valor = teclado.nextDouble();
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
					String cpfbusca = teclado.next();
					for (int x = 0; x < array.size(); x++) {
						if (array.get(x).getCliente().getCpf().equals(cpfbusca)) {
							System.out.println("informe o valor do saque");
							double valor = teclado.nextDouble();
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
					String cpfbusca = teclado.next();
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
					String nomec = teclado.next();
					for (int x = 0; x < array.size(); x++) {
						if (array.get(x).getCliente().getNome().equals(nomec)) {
							System.out.println("informe o novo nome para a agencia");
							String newnome = teclado.next();
							array.get(x).getBanco().setNomeagencia(newnome);
							System.out.println("informe o novo número para a agencia");
							String newnum = teclado.next();
							array.get(x).getBanco().setNomeagencia(newnum);
						}
					}
				}
				break;
			case 0:
				continuar = false;
				break;
			}
		}
	}
}
