
public class Livro3 {
	
	private String autor;
    private String isbn;
    private String editora;
    private String titulo;
    private String ano_edicao;

    public Livro3(String autor, String isbn, String editora, String titulo, String ano_edicao) {
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
        this.titulo = titulo;
        this.ano_edicao = ano_edicao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno_edicao() {
        return ano_edicao;
    }

    public void setAno_edicao(String ano_edicao) {
        this.ano_edicao = ano_edicao;
    }

}
