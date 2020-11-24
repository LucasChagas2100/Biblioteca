package biblioteca;

public class Professor extends Pessoa{
	
	private String materia;
	
	private String registroProfessor;
	
	//super

	public Professor(String materia, String registroProfessor) {
		super();
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
