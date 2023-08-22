package Aula05;

public class Atividade03 {

	public static void main(String[] args) {
		
		ativ03_computador computador = new ativ03_computador();
		
		computador.nome = "Pedro";
		computador.clock = 1200;
		
		System.out.println("Nome do Computador: " + computador.mostraNomeComputador());
		System.out.println("Clock do computador: " + computador.mostraClock());
		
	}

}
