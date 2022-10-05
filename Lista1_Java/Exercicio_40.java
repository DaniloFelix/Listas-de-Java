import java.util.Scanner;

public class Exercicio_40 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int v1, v2, v3, local = 0;
        System.out.print("Digite o primeiro valor: ");
        v1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        v2 = input.nextInt();
        System.out.print("Digite o terceiro valor: ");
        v3 = input.nextInt();

        if (v1 > v2 && v1 > v3) // o numero 1 maior que o 2 e 3 ,senão o numero maior é 2 ou 3
            local = v1; // depois compara o numero 2 e 3 pra saber qual o maior
        else if (v2 > v3) // o maior valor é gravado em local
            local = v2;
        else
            local = v3;
        System.out.print("O maior valor é o valor: " + local);
        input.close();
    }

}
