import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        //Leia o salario e o percentual de aumento em seguida aplique
        //o percentual de aumento sobre o salario e imprima o novo salario

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor salarial base: ");
        float salario = teclado.nextFloat();

        System.out.println("Informe o percentual de aumento (em decimal): ");
        float aumento = teclado.nextFloat();

        System.out.println("O salário reajustado é de: " + ((salario + salario * aumento)));
    }
}
