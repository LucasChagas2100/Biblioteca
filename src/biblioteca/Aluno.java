package biblioteca;

public class Aluno extends Pessoa {
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private long registroAluno;
	private int serie;
	
	public Aluno(long registroAluno, int serie) {
		super();
		this.registroAluno = registroAluno;
		this.serie = serie;
	}

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
	
	
	

}
