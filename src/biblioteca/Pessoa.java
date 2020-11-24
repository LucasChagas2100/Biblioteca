package biblioteca;

public class Pessoa {
	private String cpf;
	private String nome;
	private String sobrenome;
	private int idade;
	private String periodo;
	private int quantidadeEmprestimo;
	
	public Pessoa(String cpf, String nome, String sobrenome, int idade, String periodo, int quantidadeEmprestimo) {
		//super();
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.periodo = periodo;
		this.quantidadeEmprestimo = quantidadeEmprestimo;
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
	public void setQuantidadeEmprestimo(int quantidadeEmprestimo) {
		this.quantidadeEmprestimo = quantidadeEmprestimo;
	}
	
	public String emprestarLivro(int emprestimo) {
		if(this.quantidadeEmprestimo>0) {
			this.quantidadeEmprestimo -= emprestimo;
			return "Livro reservado com sucesso!";
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
