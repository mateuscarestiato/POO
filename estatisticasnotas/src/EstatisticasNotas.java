import java.util.Scanner;

public class EstatisticasNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int count = 0;
        double soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        while (true) {
            System.out.print("Digite a nota do aluno (ou -1 para sair): ");
            double nota = teclado.nextDouble();

            if (nota == -1) break;

            soma += nota;
            count++;

            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;
        }

        if (count > 0) {
            double media = soma / count;
            System.out.println("Quantidade de alunos: " + count);
            System.out.println("Média da turma: " + media);
            System.out.println("Maior nota: " + maior);
            System.out.println("Menor nota: " + menor);
        } else {
            System.out.println("Nenhuma nota foi informada.");
        }

        teclado.close();
    }
}

