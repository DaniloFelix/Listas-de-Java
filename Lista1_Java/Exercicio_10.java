import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade, mes, ano, dia;

        System.out.println("Informe quantos dias de vida coce tem: ");
        idade = input.nextInt();

        ano = idade / 365;
        idade = idade % 365;

        mes = idade / 30;
        idade = idade % 30;

        dia = idade % 30;

        System.out.println(ano + " ano (s) \n" + mes + " mês (es) \n" + dia + " dia (s) \n");

        input.close();

    }
}
