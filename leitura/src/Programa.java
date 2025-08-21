import java.util.Scanner;

//declaracao da classe Programa
public class Programa {

    //declaracao padrao do metodo main
    public static void main(String[] args) {

        //instanciacao da classe Scanner
        Scanner teclado = new Scanner(System.in);

        //imprimindo mensagem no console
        System.out.println("Informe sua idade: ");
        //declaracao e atribuicao da variavel idade, recebendo
        //o conteudo informado pelo usuario via teclado
        byte idade = teclado.nextByte();

        //imprimindo mensagem no console
        System.out.println("Informe seu nome: ");
        //declaracao e atribuicao da variavel nome, recebendo
        //o conteudo informado pelo usuario via teclado
        String nome = teclado.next();

        //imprimindo a mensagem no console, concatenando
        //com o valor das vars. idade e nome
        System.out.println(nome + " sua idade informada é: " + idade);

    }
}
