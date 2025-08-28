import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o numero a ser jogado: ");
        int num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " é um número par.");
        } else {
            System.out.println(num + " é um número ímpar.");
        }
        teclado.close();
    }
}