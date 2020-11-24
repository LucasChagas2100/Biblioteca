package biblioteca;

public class Aluno extends Pessoa {

	
	
	public Aluno(String cpf, String nome, String sobrenome, int idade, String periodo, int quantidadeEmprestimo,
			long registroAluno, int serie) {
		super(cpf, nome, sobrenome, idade, periodo, quantidadeEmprestimo);
		this.registroAluno = registroAluno;
		this.serie = serie;
	}

	private long registroAluno;
	private int serie;
	

	public long getRegistroAluno() {
		return registroAluno;
	}

	public void setRegistroAluno(long registroAluno) {
		this.registroAluno = registroAluno;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	@Override
	public String toString() {
		return "Aluno [registroAluno=" + registroAluno + ", serie=" + serie + ", getNome()=" + getNome() + "]";
	}
	
	
	

}
