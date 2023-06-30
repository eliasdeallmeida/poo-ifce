package questao_4;

public class Livro extends Produto {
	private String autores;
	private String isbn;
	private String editora;
	
	public Livro(String nome, String descricao, double preco, String autores, String isbn, String editora) {
		super(nome, descricao, preco);
		this.autores = autores;
		this.isbn = isbn;
		this.editora = editora;
	}
	
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
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
	
	@Override
	public String toString() {
		return "Livro: " + getNome() + ", " + getDescricao() + ", " + getPreco() + ", " + autores + ", " + isbn + ", " + editora;
	}
	
	@Override
	public boolean equals(Object objeto) {
		return (this == objeto)? true : false;
	}
}
