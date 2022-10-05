import java.util.Scanner;

public class Exercicio_33 {

    // JOGO DO SILVIO SANTOS
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 1, i, j, n;

        System.out.println("Digite um número inteiro ");
        n = leitor.nextInt();

        for (i = 0; i < n; i++) {
            for (j = 0; j < 3; j++) {

                System.out.print(contador + " ");
                contador++;
            }
            System.out.println("PUM");
            contador++;
        }

        leitor.close();

    }
}
