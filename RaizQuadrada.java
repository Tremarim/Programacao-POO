package Aula01;

import java.util.Scanner;

public class RaizQuadrada {

	public static void main(String[] args) {
		System.out.print("Digite o valor que gostaria de saber sobre sua raiz quadrada: ");
		Scanner entrada = new Scanner(System.in);
		float numero = entrada.nextFloat();
		double resultadoRaiz = calcularRaizQuadrada(numero);
		System.out.println();
		System.out.print("A raiz quadrada do numero digitado é: " + resultadoRaiz);
		entrada.close();
	}
	// Função que calcula a raiz quadrada de um número e retorna o resultado
    public static double calcularRaizQuadrada(float numero) {
        return Math.sqrt(numero);
    }

}
