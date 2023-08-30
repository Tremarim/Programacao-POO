package aula06;

public class NotaAluno {
	
	private String nomeAluno;
	private float nota1;
	private float nota2;
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	public NotaAluno(){
		
	}
	public NotaAluno(String nomeAluno, float nota1, float nota2) {
		super();
		this.nomeAluno = nomeAluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	
	
}
