import java.util.Scanner;

public class Exercicio_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.println("Digite a hora de inicio do jogo: ");
        horaInicial = input.nextInt();

        System.out.println("Digite a hora de termino do jogo: ");
        horaFinal = input.nextInt();

        if (horaInicial >= horaFinal) {
            duracao = (24 + horaFinal) - horaInicial;
        }

        else {
            duracao = horaFinal - horaInicial;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S) ");

        input.close();

    }

}
