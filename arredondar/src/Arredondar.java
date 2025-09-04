import java.util.Scanner;

public class Arredondar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor a ser arrendondado: ");
        double valor = teclado.nextDouble();
        double decimal = valor % 1;
        if (decimal>=0.5)
            valor = valor - decimal + 1;
        else
            valor = valor - decimal;

        System.out.println("Valor arredondado: " + valor);
    }
}
