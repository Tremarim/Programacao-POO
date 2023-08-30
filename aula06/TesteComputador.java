package aula06;

public class TesteComputador {

	public static void main(String[] args) {
		Computador c1 = new Computador("Meu Desktop", 1600);
		
		System.out.println("Nome do Computador: " + c1.getNome());
		System.out.println("Clock do Computador: " + c1.getClock());
		System.out.println();
		Computador c2 = new Computador();
		c2.setNome("Meu Notebook");
		c2.setClock(1800);
		System.out.println("Nome do Computador: " + c2.getNome());
		System.out.println("Clock do Computador: " + c2.getClock());
	}

}
