import java.util.Scanner;

public class Exercicio_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, anterior = 0, atual = 1, proximo = 1, contador;

        System.out.println("Digite um numero ");
        numero = input.nextInt();

        for (contador = 0; contador < numero; contador++) {

            System.out.print(proximo + " ");
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;

            input.close();

        }

        System.out.println(numero);

    }

}
