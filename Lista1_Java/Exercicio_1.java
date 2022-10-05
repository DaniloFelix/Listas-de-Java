import java.util.Scanner;

class CalcularMedia {

    // MÉDIA PONDERADA
    public static void main(String[] args) {

        double nota1, nota2, media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        media = (nota1 * 3.5 + nota2 * 7.5) / 11;

        System.out.println("A média do aluno é: = " + media);

        entrada.close();
    }

}