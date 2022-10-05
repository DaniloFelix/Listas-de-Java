import java.util.Scanner;

public class Exercicio_18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, j, res = 0;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        while (numero > 0) {

            j = numero % 10;
            res = (res * 10) + j;
            numero = numero / 10;

            System.out.print(j);

        }

        sc.close();
    }

}
