import java.util.Scanner;

public class Exercicio_14 {

    public static void main(String[] args) {

        int contador, numero;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = input.nextInt();

        contador = 0;

        while (contador < 6) {

            if (numero % 2 != 0) {

                contador++;

                System.out.println(numero);
            }
            numero++;
        }

        input.close();
    }

}
