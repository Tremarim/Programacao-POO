package Aula01;

import java.util.Scanner;

public class Ler2Variaveis {
	
	public static void main(String[] args) {
	System.out.println("Digite 2 variaveis e vamos apresenta-la");
	Scanner entrada = new Scanner(System.in);
	System.out.print("Primeira Variável: ");
	int num1 = entrada.nextInt();
	
	System.out.print("Segunda Variável: ");
	int num2 = entrada.nextInt();
	
	// Verifica qual número é maior
			int maior = num1;
			if (num2 > num1) {
				maior = num2;
			}
			System.out.println("O maior número é: " + maior);
			// Não se esqueça de fechar o Scanner
			entrada.close();
	}
}
