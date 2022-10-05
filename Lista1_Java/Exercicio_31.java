import java.util.Scanner;

public class Exercicio_31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double nota1, nota2;

        Double media;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        if (nota1 < 0 || nota1 > 10 && nota2 < 0 || nota2 > 10) {

            System.out.println("Nota inválida");

        } else {

            media = (nota1 + nota2) / 2;

            System.out.println("A Média vai ser: %.2f" + media);

            if (media < -3.5) {

                System.out.println("Médiainvalida ");
            }

        }

        sc.close();
    }

}
