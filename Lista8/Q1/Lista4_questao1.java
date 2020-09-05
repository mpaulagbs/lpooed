import java.util.Scanner;
import java.util.ArrayList;

public class Lista4_questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		ArrayList<Livro2> array = new ArrayList<Livro2>();
		Livro2 l = null;
		String nome, cpf;
		String opcao;
		boolean continuar = true;

		while (continuar) {
			System.out.println(
					"escolha uma opção \n1 = cadastrar livro \n2 = buscra livro por titulo \n3 = buscar livro por autor"
							+ "\n4 = listar todos os livros \n0 = sair");
			opcao = teclado.nextLine();
			switch (opcao) {
			case "1":
				System.out.println("informe o nome do autor");
				nome = teclado.nextLine();
				System.out.println("informe o cpf do autor");
				cpf = teclado.nextLine();
				System.out.println("informe o endereço do autor");
				String end = teclado.nextLine();
				Autor a = new Autor(nome, cpf, end);

				System.out.println("informe o cnpj da editora");
				String cnpj = teclado.nextLine();
				System.out.println("informe o nome da editora");
				String nomeed = teclado.nextLine();
				System.out.println("informe o endereço da editora");
				String ended = teclado.nextLine();
				System.out.println("informe o telefone da editora");
				String telefone = teclado.nextLine();
				Editora e = new Editora(cnpj, nomeed, ended, telefone);

				System.out.println("informe o isbn do livro");
				String isbn = teclado.nextLine();
				System.out.println("informe o titulo do livro");
				String titulo = teclado.nextLine();
				System.out.println("informe o ano de edição do livro");
				int anoedicao = teclado.nextInt();
				l = new Livro2(a, e, isbn, titulo, anoedicao);
				array.add(l);
				break;
			case "2":
				if (l == null) {
					System.out.println("cadastre um livro");
				} else {
					System.out.println("informe o titulo do livro");
					String tit = teclado.nextLine();
					for (int x = 0; x < array.size(); x++) {
						if (array.get(x).getTitulo().equals(tit)) {
							System.out.println(array.get(x).toString());
						}
					}
				}
				break;
			case "3":
				if (l == null) {
					System.out.println("cadastrar um livro");
				} else {
					System.out.println("informe o nome do autor");
					String aut = teclado.nextLine();
					for (int x = 0; x < array.size(); x++) {
						if (array.get(x).getAutor().equals(aut)) {
							System.out.println(array.get(x).getTitulo());
						}
					}
				}
				break;
			case "4":
				if (l == null) {
					System.out.println("cadastre um livro");
				} else {
					for (int x = 0; x < array.size(); x++) {
						System.out.println(array.get(x).getTitulo());
					}
				}
				break;
			case "0":
				continuar = false;
				break;
			}
		}
	}

}
