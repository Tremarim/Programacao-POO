package Aula03;

public class item7 {
	public static void main(String[] args) {
		System.out.println("Repetir numeros");
		System.out.println();
		for (int i=1; i<=100 ;i++) {
			if (i%2 == 0 ) {
				System.out.println("Numero par: " + i);
			}
			else {
				System.out.println("Numero impar: " + i);
			}
		}
	}
}
