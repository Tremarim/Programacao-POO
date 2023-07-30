package Aula01;

import java.util.Scanner;

public class CalculoQuadrado {

	public static void main(String[] args) {
		System.out.println("Calcule a area de um quadrado");
		System.out.print("Digite a area de um dos lados: ");
		Scanner entrada = new Scanner (System.in);
		int lado = entrada.nextInt();
		int result = lado * lado;
		System.out.println("O valor do quadrado é " + result);
		entrada.close();
	}

}
