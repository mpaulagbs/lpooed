import java.util.Scanner;
import java.util.ArrayList;
public class Lista3_questao1 {
	
	public static void console() {
		System.out.println("1. Cadastrar livro\r\n" + 
				"2. Buscar livro por titulo\r\n" + 
				"3. Listar livros por autor (mostrar os livros de um autor)\r\n" + 
				"4. Listar todos os livros\r\n" + 
				"0. Sair");
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Livro> lista = new ArrayList<Livro>();
		int op = 1;
		boolean aver = false;
		
		while (op != 0) {

			console();

			op = sc.nextInt();

			sc.nextLine();

			switch(op) {
			
			case 1:
				Livro a;
				String autor, editora, ISBN, titulo, anodeedicao;

				System.out.println("Digite o titulo do livro:");
				titulo = sc.nextLine();
				System.out.println("Digite o autor do livro:");
				autor = sc.nextLine();
				System.out.println("Digite a editora do livro: ");
				editora = sc.nextLine();
				System.out.println("Digite o ano de edição do livro: ");
				anodeedicao = sc.nextLine();
				System.out.println("Digite o ISBN: ");
				ISBN = sc.nextLine();

				a = new Livro(autor, editora, ISBN, titulo, anodeedicao);

				lista.add(a);

				aver = true;
				break;
			case 2:
				if (aver == true) {
					System.out.println("qual livro você procura? ");
					titulo = sc.nextLine();
					a = new Livro(null, null, null, titulo, null);
					a.buscadelivro(lista);

				}

				else if (aver == false) {
					System.out.println("nada encontrado");
				}

				break;
			case 3:
				if (aver == true) {
					System.out.println("qual autor você procura? ");
					autor = sc.nextLine();
					a = new Livro(autor, null, null, null, null);
					a.buscadeautor(lista);

				}

				else if (aver == false) {
					System.out.println("nada encontrado");
				}

				break;
			case 4:
				if (aver == true) {
					a = new Livro(null, null, null, null, null);
					a.listadelivros(lista);
				}

				else if (aver == false) {
					System.out.println("nada encontrado");
				}
			case 0:
				System.out.println("obrigada! ");
				break;
			default:
				System.out.println("escolha outra opcao");

			}

		}

	}

}