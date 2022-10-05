import java.util.Scanner;

public class Exercicio_4 {

    // ESCREVAR O MAIOR E O MENOR VALOR NA TELA
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);

        int num1, num2, num3, maior, menor;

        System.out.println("Digite o primeiro número: ");
        num1 = lerValor.nextInt();
        System.out.println("Digite o segundo valor: ");
        num2 = lerValor.nextInt();
        System.out.println("Digite o terceiro valor: ");
        num3 = lerValor.nextInt();

        if (num1 > num2 && num1 > num3) {
            maior = num1;
            System.out.println("MAIOR: " + num1);

        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
            System.out.println("MAIOR: " + num2);

        } else {
            maior = num3;
            System.out.println("maior: " + num3);
        }

        if (num1 < num2 && num1 < num3) {
            menor = num1;
            System.out.println("MENOR: " + num1);

        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
            System.out.println("MENOR: " + num2);

        } else {
            menor = num3;
            System.out.println("MENOR: " + num3);
        }

        lerValor.close();
    }

}
