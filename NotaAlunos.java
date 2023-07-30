package Aula01;

import java.util.Scanner;

public class NotaAlunos {

	public static void main(String[] args) {
		System.out.println("Calcular notas do aluno utilizando o sistema Tri-Mestral");
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		float n1 = entrada.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float n2 = entrada.nextFloat();
		System.out.print("Digite a terceira nota: ");
		float n3 = entrada.nextFloat();
		
		float media = (n1+n2+n3) /3;
		if (media>=7) {
			System.out.print("Parabéns voce está aprovado, sua nota é " + media);
		}
		else if (media>=5 && media<7) {
			System.out.print("Voce está em recuperação, sua nota é " + media);
		}
		else {
			System.out.print("Voce esta reprovado na matéria");
		}
		entrada.close();
	}

}
