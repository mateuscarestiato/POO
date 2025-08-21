import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor primeira variavel float: ");
        float num1 = teclado.nextFloat();

        System.out.println("Informe o valor segunda variavel float: ");
        float num2 = teclado.nextFloat();

        System.out.println("Soma = " + (num1 + num2));
        System.out.println("Subtração = " + (num1 - num2));
        System.out.println("Multiplicação = " + (num1 * num2));
        System.out.println("Divisão = " + (num1 / num2));
    }
}