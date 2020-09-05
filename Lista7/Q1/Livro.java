import java.util.ArrayList;
public class Livro {
	String autor;
	String editora;
	String ISBN;
	String titulo;
	String anodeedicao;

	public Livro(String autor, String editora, String ISBN, String titulo, String anodeedicao) {
		this.autor = autor;
		this.editora = editora;
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.anodeedicao = anodeedicao;
	}
	

	

	public String getAutor() {
		return autor;
	}




	public void setAutor(String autor) {
		this.autor = autor;
	}




	public String getEditora() {
		return editora;
	}




	public void setEditora(String editora) {
		this.editora = editora;
	}




	public String getISBN() {
		return ISBN;
	}




	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}




	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public String getAnodeedicao() {
		return anodeedicao;
	}




	public void setAnodeedicao(String anodeedicao) {
		this.anodeedicao = anodeedicao;
	}




	public void buscadelivro(ArrayList<Livro> lista) {
		System.out.println("Digite as infromações do livro: ");
		System.out.println("");
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getTitulo().equals(titulo)) {

				System.out.println("titulo do livro: " + lista.get(i).getTitulo());
				System.out.println("");
				System.out.println("autor do livro: " + lista.get(i).getAutor());
				System.out.println("");
				System.out.println("editora do livro: " + lista.get(i).getEditora());
				System.out.println("");
				System.out.println("ano de edição do livro: " + lista.get(i).getAnodeedicao());
				System.out.println("");
				System.out.println("ISBN do livro: " + lista.get(i).getISBN());

			}
		}
	}

	public void buscadeautor(ArrayList<Livro> lista) {

		System.out.println("lista de livros do autor: ");
		System.out.println("");
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getAutor().equals(autor)) {

				System.out.println(lista.get(i).getTitulo());
				System.out.println("");
			}

		}
	}
	public void listadelivros(ArrayList<Livro> lista) {

		System.out.println("lista de todos os livros: ");
		System.out.println("");
		for (int i = 0; i < lista.size(); i++) {
			
				System.out.println(lista.get(i).getTitulo());
				System.out.println("");
			}

		}
}
