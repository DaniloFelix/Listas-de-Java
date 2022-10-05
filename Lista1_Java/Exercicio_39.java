import java.util.Scanner;

public class Exercicio_39 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int entrada;
        System.out.println("Informar um número: ");
        entrada = input.nextInt();

        int multiplicador = 1;
        while (multiplicador <= 10) {
            int resultado = entrada * multiplicador;
            System.out.println(resultado);
            multiplicador++;
        }

        input.close();
    }

}
