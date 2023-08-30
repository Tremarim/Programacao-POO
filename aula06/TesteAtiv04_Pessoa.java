package aula06;

public class TesteAtiv04_Pessoa {

	public static void main(String[] args) {
		ativ04_Pessoa p1 = new ativ04_Pessoa();
		ativ04_Pessoa p2 = new ativ04_Pessoa();
		
		p1.setNome("Joao");
		p1.setIdade(25);
		p1.setEndereco("Rua abc, 100");
		
		p2.setNome("Maria");
		p2.setIdade(25);
		p2.setEndereco("Rua xyz, 200");

		
		System.out.println("Nome da primeira pessoa: " + p1.getNome());
		System.out.println("Idade da primeira pessoa: " + p1.getIdade());
		System.out.println("Endereço da primeira pessoa: " + p1.getEndereco());
		System.out.println();
		System.out.println("Nome da segunda pessoa: " + p2.getNome());
		System.out.println("Idade da segunda pessoa: " + p2.getIdade());
		System.out.println("Endereço da segunda pessoa: " + p2.getEndereco());
	}

}
