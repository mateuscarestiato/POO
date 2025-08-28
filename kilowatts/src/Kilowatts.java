import java.util.Scanner;

public class Kilowatts {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de kilowatts consumidos na casa: ");
        int qtdKilowatt = teclado.nextInt();
        System.out.println("Informe o valor do kilowatt: ");
        int valKilowatt = teclado.nextInt();

        if (qtdKilowatt < 150) {
            System.out.println("Valor a ser pago: " + (qtdKilowatt * valKilowatt * 0.90));
        }
        else{
            System.out.println("Valor a ser pago: " + (qtdKilowatt*valKilowatt));
        }
    }
}
