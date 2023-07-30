package Aula01;

import java.util.Scanner;

public class SistemaBancario {
    private static String nomeCliente;
    private static double salario;
    private static double emprestimo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Realizar empréstimo");
            System.out.println("3 - Listar cliente");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
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

        } while (opcao != 4);

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
