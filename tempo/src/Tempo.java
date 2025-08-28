import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o tempo, em segundos: ");
        int t = teclado.nextInt();
        int hora = t/3600;
        int min = t/60;
        System.out.println("Tempo em segundo(s): " + t);
        System.out.println("Tempo em minuto(s): " + min);
        System.out.println("Tempo em hora(s): " + hora);

    }
}
