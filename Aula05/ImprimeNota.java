package Aula05;

public class ImprimeNota {

	public static void main(String[] args) {
		NotaFiscal nota = new NotaFiscal();
		NotaFiscal nota1 = new NotaFiscal();
		NotaFiscal nota2 = new NotaFiscal();
		nota.nomeItem1 = "Geladeira";
		nota.nomeItem2 = "Fogão";
		nota.precoItem1 = 1669.90f;
		nota.precoItem2 = 850.90f;
		nota1.nomeItem1 = "Micro-Ondas";
		nota1.nomeItem2 = "Armario";
		nota1.precoItem1 = 499.90f;
		nota1.precoItem2 = 749.90f;
		nota2.nomeItem1 = "Chocolate";
		nota2.nomeItem2 = "Leite Condensado";
		nota2.precoItem1 = 3.59f;
		nota2.precoItem2 = 8.50f;
		System.out.println("Nota Fiscal 1 : " + nota.mostraNomeItem1());
		System.out.println("Nota Fiscal 2 : " + nota.mostraNomeItem2());
		System.out.println("Média da Nota Fiscal : " + nota.calculaNotaFiscal());
		
		System.out.println();
		
		System.out.println("Nota Fiscal 1 : " + nota1.mostraNomeItem1());
		System.out.println("Nota Fiscal 2 : " + nota1.mostraNomeItem2());
		System.out.println("Média da Nota Fiscal : " + nota1.calculaNotaFiscal());
		
		System.out.println();
		
		System.out.println("Nota Fiscal 1 : " + nota2.mostraNomeItem1());
		System.out.println("Nota Fiscal 2 : " + nota2.mostraNomeItem2());
		System.out.println("Média da Nota Fiscal : " + nota2.calculaNotaFiscal());
	}

}
