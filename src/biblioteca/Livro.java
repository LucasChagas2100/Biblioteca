package biblioteca;

public class Livro {
	private String titulo;
	private String editora;
	private int anoPublicacao;
	private String autor;
	private int quantidadePaginas;
	private int quantidadeLivro;
	private boolean disponivel;
	
	public Livro() {
		
	}

	public Livro(String titulo, String editora, int anoPublicacao, String autor, int quantidadePaginas,
			int quantidadeLivro, boolean disponivel) {
		super();
		this.titulo = titulo;
		this.editora = editora;
		this.anoPublicacao = anoPublicacao;
		this.autor = autor;
		this.quantidadePaginas = quantidadePaginas;
		this.quantidadeLivro = quantidadeLivro;
		this.disponivel = disponivel;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}

	public int getQuantidadeLivro() {
		return quantidadeLivro;
	}

	public void setQuantidadeLivro(int quantidadeLivro) {
		this.quantidadeLivro = quantidadeLivro;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", editora=" + editora + ", anoPublicacao=" + anoPublicacao + ", autor="
				+ autor + ", quantidadePaginas=" + quantidadePaginas + ", quantidadeLivro=" + quantidadeLivro
				+ ", disponivel=" + disponivel + "]";
	}
	

}
