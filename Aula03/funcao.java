package Aula03;

public class funcao {

	public static void main(String[] args) {
		int y = 5;
		int x= 6;
		int result = somar (x,y);
		System.out.println("Resultado: " + result);
	}
	public static int somar (int a, int b) {
		int result = a+b;
		return result;
	}
}
	