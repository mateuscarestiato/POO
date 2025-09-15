import java.util.Scanner;

public class ContagemCaracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vogais = 0, digitos = 0, outros = 0;
        char c;

        System.out.println("Digite caracteres (termine com '.'): ");
        while (true) {
            c = teclado.next().charAt(0);

            if (c == '.') break;

            if ("AEIOUaeiou".indexOf(c) != -1) {
                vogais++;
            } else if (Character.isDigit(c)) {
                digitos++;
            } else {
                outros++;
            }
        }

        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de dígitos: " + digitos);
        System.out.println("Quantidade de outros caracteres: " + outros);

        teclado.close();
    }
}
