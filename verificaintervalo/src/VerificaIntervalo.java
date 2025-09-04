import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = teclado.nextInt();
        System.out.println("Informe o limite inferior: ");
        int inferior = teclado.nextInt();
        System.out.println("Informe o limite superior: ");
        int superior = teclado.nextInt();
        if ((numero < inferior) && (numero < superior))
            System.out.println("O número informado está antes do intervalo");
        else if ((numero > inferior) && (numero > superior))
            System.out.println("O número informado está depois do intervalo");
        else if ((numero >= inferior) && (numero <= superior))
            System.out.println("O número informado está dentro do intervalo");
    }
}
