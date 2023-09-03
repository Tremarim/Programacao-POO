package ativAula06;

public class testeativ06 {

public static void main(String[] args) {
        
        // Instanciando o segundo objeto com os 3 parâmetros
        ativ06 aluno1 = new ativ06("João", 8.5f, 7.0f);
        System.out.println("Aluno 1 - Nome: " + aluno1.getNomeAluno());
        aluno1.statusAluno();
        
        // Instanciando o primeiro objeto usando o construtor padrão e setters
        ativ06 aluno2 = new ativ06();
        aluno2.setNomeAluno("Maria");
        aluno2.setNota1(6.0f);
        aluno2.setNota2(7.5f);
        System.out.println();
        System.out.println("Aluno 2 - Nome: " + aluno2.getNomeAluno());
        aluno2.statusAluno();
    }
}
