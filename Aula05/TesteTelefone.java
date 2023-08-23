package Aula05;

public class TesteTelefone {

	public static void main(String[] args) {
		Telefone num1 = new Telefone();
		Telefone num2 = new Telefone();
		num1.setNumeroTelefone("51995452068");
		num1.setOperadora("Vivo Telefonica");
		
		System.out.println("Numero do Telefone: " + num1.getNumeroTelefone());
		System.out.println("Operadora do Telefone: " + num1.getOperadora());
		
		System.out.println();
		
		num2.setNumeroTelefone("51993758854");
		num2.setOperadora("Claro");
		
		System.out.println();
		
		System.out.println("Numero do Telefone: " + num2.getNumeroTelefone());
		System.out.println("Operadora do Telefone: " + num2.getOperadora());
	}

}
