import java.util.Scanner;

public class Exercicio_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double popPaisA, popPaisB;
        int anos = 0;

        System.out.println("Digite a população do primeiro país");
        popPaisA = input.nextDouble();

        System.out.println("Digite a população do segundo país");
        popPaisB = input.nextDouble();

        while (popPaisA < popPaisB) {

            popPaisA += (popPaisA * 3) / 100;
            popPaisB += (popPaisB * 1.5) / 100;
            anos++;
        }
        System.out.println(" Vão demorar " + anos + " anos para o país A chegar ou ultrapassar a população do país B");

        input.close();

    }

}
