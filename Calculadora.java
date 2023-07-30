package Aula01;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		System.out.println("Calculadora");
		System.out.print("Digite o primeiro numero: ");
		Scanner entrada = new Scanner (System.in);
		double num1 = entrada.nextDouble();
		if (num1 > 1000) {
            System.out.println("Valor inválido. O primeiro número não pode ser maior que 1000.");
            entrada.close();
            return;
        }
		System.out.print("Digite o operador (+, -, *, /): ");
		char operador = entrada.next().charAt(0);
		System.out.print("Digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		if (num2 > 1000) {
            System.out.println("Valor inválido. O primeiro número não pode ser maior que 1000.");
            entrada.close();
            return;
        }
		if (operador == '/' && num2 == 0) {
            System.out.println("Não é possível dividir por 0.");
            entrada.close();
            return;
		}
		double resultado = calcularOperacao(num1, num2, operador);
		System.out.println("O resultado é: " + resultado);
		entrada.close();
	}
	public static double calcularOperacao(double num1, double num2, char operador) {
		if (operador == '+') {
			return  num1 + num2;
		}
		else if (operador == '-'){
			return num1 - num2;
		}
		else if (operador == '/') {
			return num1 / num2;
		}
		else if (operador == '*') {
			return num1 * num2;
		}
		else {
			System.out.println("Operador invalido, digite um operador valido.");
			return Double.NaN; // Valor especial que representa "Not a Number" (não é um número) //
		}		
	}

}
