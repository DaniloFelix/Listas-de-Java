
import java.util.Scanner;

public class Exercicio_8 {
    // < 900 NÃO TEM
    // 900.01 ATE 1500 → 0.10
    // 1500.01 ATÉ 2500 → 0.15
    // > 2500 → 0.25
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner impostoRenda = new Scanner(System.in);
        double IR = 0.00, RH, RM, RC, RL;

        System.out.println("Digite o salário do homem ");
        RH = impostoRenda.nextDouble();

        System.out.println("Digite o salário da mulher ");
        RM = impostoRenda.nextDouble();

        if ((RH + RM) < 900) {
            System.out.println("ISENTO");
        }

        else if ((RH + RM) > 2500.01) {
            RC = RH + RM;
            IR = (RC * 0.25);
            RL = RC - IR;

            System.out.println("RENDA CONJUNTA R$: " + RC);
            System.out.println(" ALÍQUOTA: 25% ");
            System.out.println(" IMPOSTO DE RENDA R$: " + IR);
            System.out.println(" RENDA LIQUIDA R$: " + RL);

        }

        else if ((RH + RM) > 900.01 && (RH + RM) < 1500) {
            RC = RH + RM;
            IR = (RC * 0.10);
            RL = RC - IR;

            System.out.println("RENDA CONJUNTA R$: " + RC);
            System.out.println(" ALÍQUOTA: 10% ");
            System.out.println(" IMPOSTO DE RENDA R$: " + IR);
            System.out.println(" RENDA LIQUIDA R$: " + RL);

        }

        else if ((RH + RM) > 1500.01 && (RH + RM) < 2500) {
            RC = RH + RM;
            IR = (RC * 0.15);
            RL = RC - IR;

            System.out.println("RENDA CONJUNTA R$: " + RC);
            System.out.println(" ALÍQUOTA: 15% ");
            System.out.println(" IMPOSTO DE RENDA R$: " + IR);
            System.out.println(" RENDA LIQUIDA R$: " + RL);

        }

        impostoRenda.close();

    }
}
