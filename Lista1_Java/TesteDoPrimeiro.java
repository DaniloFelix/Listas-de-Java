import java.util.Scanner;

public class TesteDoPrimeiro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a primeira nota ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota ");
        nota2 = entrada.nextDouble();

        media = (((nota1 * 3.5) + (nota2 * 7.5)) / 11);

        System.out.println("MÉDIA " + media);

        entrada.close();

    }

}
