import java.util.Scanner;

public class Kilowatts {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de kilowatts consumidos na casa: ");
        double qtdKilowatt = teclado.nextDouble();
        System.out.println("Informe o valor do kilowatt: ");
        double valKilowatt = teclado.nextDouble();
        double valorPago = qtdKilowatt*valKilowatt;

        if (qtdKilowatt < 150.0) {
            valorPago = valorPago * 0.9;
        }
        System.out.println("Valor a ser pago: " + valorPago);
    }
}
