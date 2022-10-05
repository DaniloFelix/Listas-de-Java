import java.util.Scanner;

public class Exercicio_34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X;
        int Y;

        System.out.println("Digite um valor para N: ");
        X = sc.nextInt();

        System.out.println("Digite um valor para Y: ");
        Y = sc.nextInt();

        for (int i = 1; i < Y; i++) {

            System.out.println(i);

            if (i % X == 0) {

                System.out.println(" ");

            } else {

                System.out.println(" ");
            }
        }
        sc.close();
    }

}
