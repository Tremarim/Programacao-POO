package aula06;

public class TesteProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto("Mesa de Jantar", 180.00f);
		System.out.println("Nome do primeiro produto: " + p1.getNome());
		System.out.println("Preço do primeiro produto: " + p1.getPreco());
		Produto p2 = new Produto("Cama Casal", 799.00f, "Cama de Casal Box");
		System.out.println();
		System.out.println("Nome do segundo produto: " + p2.getNome());
		System.out.println("Preço do segundo produto: " + p2.getPreco());
		System.out.println("Descrição do segundo produto: " + p2.getDescricao());
	}

}
