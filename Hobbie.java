package SemTempoIrmão;

import java.util.Scanner;

public class Hobbie {
	private static double salario;
    private static String nomeCliente;
    private static double emprestimo;
	
    public static void main(String[] args) {
		System.out.println("Aqui vamos testar algumas coisas");
		System.out.println("Vamos fazer uma coisa interessante aqui");
		System.out.print("Digite um numero entre 1 a 5 >>> ");
		Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();
		switch (opcao){
			case 1:
				System.out.println("A opção 1 é uma calculadora");
				calculadora(opcao);	
				encerra(opcao);
				break;
			
			case 2:
				System.out.println("A opção 2 é calculo de raiz quadrada");
				raizquadrada(opcao);
				encerra(opcao);
				break;
			case 3:
				System.out.println("A opção 3 é qual o maior numero digitado");
				ler2variaveis(opcao);
				encerra(opcao);
				break;
			case 4:
				System.out.println("A opção 4 é numeros pares ou impares.");
				ParesImpares(opcao);
				encerra(opcao);
				break;
			case 5:
				System.out.println("A opção 5 é um sistema basico bancario.");
				banco(opcao);
				encerra(opcao);
				break;
			default:
                System.out.println("Opção inválida.");
                encerra(opcao);
                break;
		}
		entrada.close();
		encerra(opcao);
	}



	public static void raizquadrada(int opcao){
	System.out.print("Digite o valor que gostaria de saber sobre sua raiz quadrada: ");
	Scanner entrada = new Scanner(System.in);
	float numero = entrada.nextFloat();
	double resultadoRaiz = calcularRaizQuadrada(numero);
	System.out.println();
	System.out.print("A raiz quadrada do numero digitado é: " + resultadoRaiz);
	entrada.close();
}
// Função que calcula a raiz quadrada de um número e retorna o resultado //
	public static double calcularRaizQuadrada(float numero) {
    return Math.sqrt(numero);
}
	public static void calculadora (int entrada) {
		System.out.println("Calculadora");
		System.out.println("Não é permitido numeros maiores que 1000.");
		System.out.print("Digite o primeiro numero: ");
		Scanner entrada1 = new Scanner (System.in);
		double num1 = entrada1.nextDouble();
		if (num1 > 1000) {
            System.out.println("Valor inválido. O primeiro número não pode ser maior que 1000.");
            entrada1.close();
            return;
        }
		System.out.print("Digite o operador (+, -, *, /): ");
		char operador = entrada1.next().charAt(0);
		System.out.print("Digite o segundo numero: ");
		double num2 = entrada1.nextDouble();
		if (num2 > 1000) {
            System.out.println("Valor inválido. O primeiro número não pode ser maior que 1000.");
            entrada1.close();
            return;
        }
		if (operador == '/' && num2 == 0) {
            System.out.println("Não é possível dividir por 0.");
            entrada1.close();
            return;
		}
		double resultado = calcularOperacao(num1, num2, operador);
		System.out.println("O resultado é: " + resultado);
		entrada1.close();
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
	public static void encerra(int opcao) {
		System.out.println("Deseja voltar ao menu anterior?");
		System.out.println("1 - Sim\n2 - Não");
		System.out.print("Digite o numero");
		Scanner retorno = new Scanner(System.in);
	    int escolha = retorno.nextInt();
	    retorno.close();
		if (escolha == 1) 
			main(null);
		
		else if (escolha == 2) 
			System.exit(0);
		
		else {
			System.out.print("Opção Invalida");
			main(null);
		}
	}
	public static void ler2variaveis(int opcao){
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
	public static void ParesImpares (int opcao) {
		
			System.out.println("Impressão dos numeros");
			System.out.println();
			System.out.println("Mostrando os numeros Pares: ");
			for (int x=2;x<=100;x+=2) {
				System.out.println("Numero Par: " + x);
			}
			System.out.println();
			System.out.println("Mostrando os numeros Impares: ");
			for (int y=1;y<=100;y+=2) {
				System.out.println("Numero Impar: " + y);
			}
	}

	public static void banco (int opcao) {		    
	        Scanner scanner = new Scanner(System.in);
	        int opcao1;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1 - Cadastrar cliente");
	            System.out.println("2 - Realizar empréstimo");
	            System.out.println("3 - Listar cliente");
	            System.out.println("4 - Sair");
	            System.out.print("Digite a opção desejada: ");
	            opcao1 = scanner.nextInt();

	            switch (opcao1) {
	                case 1:
	                    cadastrarCliente(scanner);
	                    break;
	                case 2:
	                    realizarEmprestimo();
	                    break;
	                case 3:
	                    listarCliente();
	                    break;
	                case 4:
	                    System.out.println("Encerrando a aplicação...");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }

	        } while (opcao1 != 4);

	        scanner.close();
	}
	    private static void cadastrarCliente(Scanner scanner) {
	        System.out.print("Digite o nome do cliente: ");
	        nomeCliente = scanner.next();
	        
	        System.out.print("Digite o salário do cliente: ");
	        salario = scanner.nextDouble();

	        if (salario < 0) {
	            System.out.println("Salário inválido. Não é permitido valor negativo.");
	        } else {
	            System.out.println("Cliente cadastrado com sucesso!");
	        }
	    }

	    private static void realizarEmprestimo() {
	        if (salario > 500) {
	            emprestimo = salario * 0.05;
	            System.out.println("Crédito liberado. Valor do empréstimo: " + emprestimo);
	        } else {
	            System.out.println("Empréstimo não liberado.");
	        }
	    }

	    private static void listarCliente() {
	        System.out.println("\nInformações do cliente:");
	        System.out.println("Nome: " + nomeCliente);
	        System.out.println("Salário: " + salario);

	        if (emprestimo > 0) {
	            System.out.println("Valor do empréstimo: " + emprestimo);
	        }
	}
}