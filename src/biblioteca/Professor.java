package biblioteca;

public class Professor extends Pessoa{
	
	private String materia;
	
	private String registroProfessor;
	
	
	public Professor(String cpf, String nome, String sobrenome, int idade, String periodo, int quantidadeEmprestimo,
			String materia, String registroProfessor) {
		super(cpf, nome, sobrenome, idade, periodo, quantidadeEmprestimo);
		this.materia = materia;
		this.registroProfessor = registroProfessor;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getRegistroProfessor() {
		return registroProfessor;
	}

	public void setRegistroProfessor(String registroProfessor) {
		this.registroProfessor = registroProfessor;
	}
	
	

}
