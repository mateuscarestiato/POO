import java.util.Scanner;

public class ParesNoIntervalo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número:");
        int a = teclado.nextInt();

        System.out.print("Digite o segundo número:");
        int b = teclado.nextInt();

        int inicio = Math.min(a, b);
        int fim = Math.max(a, b);

        int soma = 0;
        int count = 0;

        System.out.println("Números pares no intervalo " + inicio + " até " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            soma += i;
            count++;
            if (i % 2 == 0) {
                System.out.print(i + "\n");
            }
        }

        double media = (double) soma / count;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        teclado.close();
    }
}
