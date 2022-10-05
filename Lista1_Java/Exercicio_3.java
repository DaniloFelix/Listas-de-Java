import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {

        Scanner funcionario = new Scanner(System.in);
        String nomeFuncionario;
        float TotalDeVendas;
        double salario, salarioRecebido;

        System.out.println("Digite o nome do funcionário: ");
        nomeFuncionario = funcionario.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        salario = funcionario.nextDouble();
        System.out.println("Digite o valor vendido pelo o funcionário ");
        TotalDeVendas = funcionario.nextFloat();

        salarioRecebido = (TotalDeVendas * 0.15) + salario;

        System.out.println("O salário TOTAL de " + nomeFuncionario + ", vai ser: R$ " + salarioRecebido);

        funcionario.close();

    }
}
