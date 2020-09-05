import java.util.Scanner;
import java.util.ArrayList;
public class Lista3_questao2 {
	public static void console() {

		System.out.println("1. Cadastrar produto\r\n" + 
				"2. Buscar Produto (procurar produto pelo nome)\r\n" + 
				"3. Listar todos os produtos\r\n" + 
				"4. Efetuar venda de produto\r\n" + 
				"0. Sair");
	}
	public static void procurarproduto(ArrayList<Livraria> lista, String nome) {

		System.out.println("os produtor que você procura: ");
		System.out.println("");
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().contains(nome)) {

				System.out.println("nome do produto: " + lista.get(i).getNome());
				System.out.println("");
				System.out.println("código do produto: " + lista.get(i).getCodigo());
				System.out.println("");
				System.out.println("preço do produto em reais: " + lista.get(i).getPreco());
				System.out.println("");
				System.out.println("quantidade: " + lista.get(i).getQuant());
				System.out.println("");
			}

		}

	}
	public static void listarproduto(ArrayList<Livraria> lista) {

		System.out.println("a lista de produtos cadastrados: ");
		System.out.println("");
		for (int i = 0; i < lista.size(); i++) {

			System.out.println(lista.get(i).getNome());
			System.out.println("");
		}

	}

	public static void vender(ArrayList<Livraria> lista, String nome) {

		System.out.println("venda efetuada: ");
		System.out.println("");
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNome().contains(nome)) {

				int quant = lista.get(i).getQuant();
				quant--;

				lista.get(i).setQuant(quant);
				System.out.println("quantidade restante: " + lista.get(i).getQuant());
				System.out.println("");
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Livraria> lista = new ArrayList<Livraria>();
		boolean aver = false;
		int op = 99;

		while (op != 0) {
			console();
			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				String nome, codigo, preco;
				Livraria novoprod;
				int quant;

				System.out.println("informe o nome do produto: ");
				nome = sc.nextLine();
				System.out.println("informe o código do produto: ");
				codigo = sc.nextLine();
				System.out.println("informe o preço do produto: ");
				preco = sc.nextLine();
				System.out.println("informe a quantidade do produto: ");
				quant = sc.nextInt();

				novoprod = new Livraria(nome, codigo, preco, quant);
				lista.add(novoprod);

				aver = true;

				break;

			case 2:

				if (aver == true) {
					System.out.println("informe o nome do produto que você quer procurar: ");
					nome = sc.nextLine();

					procurarproduto(lista, nome);
				}

				else if (aver == false) {
					System.out.println("nada encontrado: ");
				}

				break;
			case 3:

				listarproduto(lista);

				break;

			case 4:
				if (aver == true) {
					System.out.println("informe o nome do produto que você quer fazer uma venda: ");
					nome = sc.nextLine();
					vender(lista, nome);
				}

				else if (aver == false) {
					System.out.println("nada encontrado: ");
				}
				break;
			case 0:
				System.out.println("obrigada! ");
				System.exit(0);
				break;

			default:
				System.out.println("escolha outra opcao ");
			}}}

}

