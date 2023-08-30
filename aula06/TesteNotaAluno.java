package aula06;

public class TesteNotaAluno {

	public static void main(String[] args) {
		NotaAluno notas = new NotaAluno("Giovane", 6.0f , 9.0f);
		NotaAluno nome = new NotaAluno();
		NotaAluno n1 = new NotaAluno();
		NotaAluno n2 = new NotaAluno();
		nome.setNomeAluno("Leticia");
		n1.setNota1(6.0f);
		n2.setNota2(9.0f);
		float mediaDoAluno = (n1.getNota1() + n2.getNota2())/2;
		
		if( mediaDoAluno >= 7) {
			System.out.println("Aluno 1 " + notas.getNomeAluno() + " esta aprovado");
			System.out.println("Aluno 2 " + nome.getNomeAluno() + " esta aprovado");
		}
		else {
			System.out.println("Aluno esta reprovado");
		}
	}

}
