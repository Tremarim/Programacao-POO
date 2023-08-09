package Aula03;

import java.util.Scanner;

public class NotasAlunos {

	public static void main(String[] args) {
		System.out.println("Calcular notas do aluno utilizando o sistema Tri-Mestral");
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		float n1 = entrada.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float n2 = entrada.nextFloat();
		System.out.print("Digite a terceira nota: ");
		float n3 = entrada.nextFloat();
		notas(n1,n2,n3); //chama função//
		String notas = notas(n1,n2,n3);
		System.out.println(notas);
		entrada.close();
	}
	public static String notas(float nota1,float nota2,float nota3) {
		float media = (nota1+nota2+nota3)/3;
		if (media>=7) {
			return "Parabéns voce está aprovado, sua nota é " + media;
		}
		else if (media>=5 && media<7) {
			return "Voce está em recuperação, sua nota é " + media;
		}
		else {
			return ("Voce esta reprovado na matéria " + media);
		}
	}

}