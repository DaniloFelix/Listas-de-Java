import java.util.Scanner;

public class Exercicio_5 {

    // EXIBIR NÚMEROS INTEIROS EM ORDEM CRESCENTE
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite o primeiro número: ");
        num1 = lerValor.nextInt();
        System.out.println("Digite o segundo valor: ");
        num2 = lerValor.nextInt();
        System.out.println("Digite o terceiro valor: ");
        num3 = lerValor.nextInt();

        if (num1 > num2 && num2 > num3) {

            System.out.println(num3 + "\n" + num2 + "\n" + num1);

        } else if (num2 > num1 && num1 > num3) {

            System.out.println(num3 + "\n" + num1 + "\n " + num2);

        } else if (num3 > num2 && num2 > num1) {

            System.out.println(num1 + "\n" + num2 + "\n" + num3);

        }

        lerValor.close();

    }

}
