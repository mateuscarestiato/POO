import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {

        //Leia o raio de um circulo. Em seguida imprima o perimetro (2*Pi*R)
        //e a area (Pi*R**2) do circulo com esse raio

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o raio do circulo: ");
        double raio = teclado.nextDouble();
        final float PI =3.14f;
        System.out.println("O perimetro do circulo é igual a " + (2*Math.PI*raio));
        System.out.println("A area do circulo é igual a " + (Math.PI*raio*(Math.pow(raio,2))));
    }
}