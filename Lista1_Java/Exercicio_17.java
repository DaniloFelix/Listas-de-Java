import java.util.Scanner;

public class Exercicio_17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, a, b, d;
        int cont;

        System.out.println("Digite o primeiro número: ");
        n = sc.nextInt();

        for (a = 0; a < n; a++) {

            cont = 1;

            System.out.println("Digite o segundo número: ");
            b = sc.nextInt();

            for (d = 2; d < b; d++) {

                if (b % d == 0) {

                    cont++;
                }
            }

            if (cont == 1 && b != 1) {

                System.out.println(b + " é primo");

            } else {

                System.out.println(b + " não é primo");
            }
        }
    }

}
