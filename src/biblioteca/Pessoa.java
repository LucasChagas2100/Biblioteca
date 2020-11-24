package biblioteca;

public class Pessoa {
	private String cpf;
	private String nome;
	private String sobrenome;
	private int idade;
	private String periodo;
	private int quantidadeEmprestimo;
	
	public Pessoa() {
		
	}
	public Pessoa(String cpf, String nome, String sobrenome, int idade, String periodo) {
		//super();
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.periodo = periodo;
		this.quantidadeEmprestimo = 1;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public int getQuantidadeEmprestimo() {
		return quantidadeEmprestimo;
	}
	
	public String emprestarLivro() {
		if(this.quantidadeEmprestimo>0) {
			this.quantidadeEmprestimo -= 1;
			return "Livro emprestado com sucesso! Você ainda pode emprestar "+this.getQuantidadeEmprestimo() + " livros.";
		}
		else {
			return "Quantidade de emprestimo indisponível.";
		}
	}
	
	public String devolverLivro(int emprestimo) {
		this.quantidadeEmprestimo += emprestimo;
		return "Livro devolvido com sucesso. A quantidade de empréstimos disponíveis é "+this.quantidadeEmprestimo;
	}
	
}
