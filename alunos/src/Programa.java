import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        // Criando o objeto teclado para ler dados do teclado
        Scanner teclado = new Scanner(System.in);

        // Leitura de dados para o primeiro aluno
        System.out.println("Informe a matricula, nome e curso do aluno 1: ");
        String matricula1 = teclado.next();
        String nome1 = teclado.next();
        String curso1 = teclado.next();

        // Leitura de dados para o primeiro aluno
        System.out.println("Informe a matricula, nome e curso do aluno 2: ");
        String matricula2 = teclado.next();
        String nome2 = teclado.next();
        String curso2 = teclado.next();

        // Leitura de dados para o terceiro aluno
        System.out.println("Informe a matricula, nome e curso do aluno 3: ");
        String matricula3 = teclado.next();
        String nome3 = teclado.next();
        String curso3 = teclado.next();

        // Exibindo a lista de alunos matriculados
        System.out.println("Lista de alunos matriculados:");
        System.out.println(nome1);
        System.out.println(nome2);
        System.out.println(nome3);

        // Fechando o scanner
        teclado.close();
    }
}
