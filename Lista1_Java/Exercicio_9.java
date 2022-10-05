import java.util.Scanner;

public class Exercicio_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int duracaoEvento, qtdHoras, qtdMinutos, qtdSegundos;

        System.out.println("Digite o tempo total da duração do evento em segundos ");
        duracaoEvento = input.nextInt();

        qtdHoras = duracaoEvento / 3600;
        duracaoEvento = duracaoEvento % 3600;

        qtdMinutos = duracaoEvento / 60;
        duracaoEvento = duracaoEvento % 60;

        qtdSegundos = duracaoEvento;

        System.out.println(qtdHoras + ":" + qtdMinutos + ":" + qtdSegundos);

        input.close();

    }

}
