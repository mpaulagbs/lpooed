
public class Livro2 {
	private Autor autor;
	private Editora editora;
	private String isbn;
	private String titulo;
	private int anoedicao;

	Livro2 (Autor autor, Editora editora, String isbn, String titulo, int anoedicao){
	this.setAutor(autor);
	this.setEditora(editora);
	this.setIsbn(isbn);
	this.setTitulo(titulo);
	this.setAnoedicao(anoedicao);
	}

	public Autor getAutor() {
	return autor;
	}
	public void setAutor(Autor autor) {
	this.autor = autor;
	}
	public Editora getEditora() {
	return editora;
	}
	public void setEditora(Editora editora) {
	this.editora = editora;
	}
	public String getIsbn() {
	return isbn;
	}
	public void setIsbn(String isbn) {
	this.isbn = isbn;
	}
	public String getTitulo() {
	return titulo;
	}
	public void setTitulo(String titulo) {
	this.titulo = titulo;
	}
	public int getAnoedicao() {
	return anoedicao;
	}
	public void setAnoedicao(int anoedicao) {
	this.anoedicao = anoedicao;
	}
}