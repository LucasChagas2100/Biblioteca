package biblioteca;

public class Aluno extends Pessoa {

	public Aluno() {
		
	}
	
	public Aluno(String cpf, String nome, String sobrenome, int idade, String periodo,
			String registroAluno, String serie) {
		super(cpf, nome, sobrenome, idade, periodo);
		this.registroAluno = registroAluno;
		this.serie = serie;
	}

	private String registroAluno;
	private String serie;
	

	public String getRegistroAluno() {
		return registroAluno;
	}

	public void setRegistroAluno(String registroAluno) {
		this.registroAluno = registroAluno;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	@Override
	public String toString() {
		return "Aluno [registroAluno=" + registroAluno + ", serie=" + serie + ", getNome()=" + getNome() + "]";
	}
	
	
	

}
