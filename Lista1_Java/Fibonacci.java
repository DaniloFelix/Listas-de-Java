import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, contador;
        int anterior = 0;
        int atual = 0;
        int proximo = 1;

        System.out.println("Digite um número ");
        numero = input.nextInt();

        for (contador = 1; contador <= numero; contador++) {

            System.out.print(atual + " ");
            anterior = atual + proximo;
            atual = proximo;
            proximo = anterior;

            input.close();

        }

    }

}
