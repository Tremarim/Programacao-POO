package Aula01;

import java.util.Scanner;

public class trabalho1 {
	public static void main (String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Meu nome é Victor Hugo Tremarin Mendes ");
		System.out.println("Seu endereço Rua Lucio Machado de Oliveria, 1094 ");
		System.out.print("Seu nome é?: ");
		String nome = entrada.next();
		System.out.print("Sua Idade é?: ");
		String idade = entrada.next();
		System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " anos ");
		entrada.close();
	}
	
}
