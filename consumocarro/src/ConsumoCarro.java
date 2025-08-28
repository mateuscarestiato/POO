import java.util.Scanner;

public class ConsumoCarro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a distancia percorrida (em km): ");
        double distancia = teclado.nextDouble();
        System.out.println("Informe o tempo gasto (em horas): ");
        double tempo = teclado.nextDouble();
        System.out.println("Informe a quantidade de gasolina consumida (em litros): ");
        double gasolina = teclado.nextDouble();
        System.out.println("Velocidade média (km/h): " + distancia/tempo);
        System.out.println("Consumo de combustível(km/l): " + distancia/gasolina);
    }
}
