import java.util.Scanner;

class SalarioDoFuncionario {

    public static void main(String[] args) {

        Scanner funcionario = new Scanner(System.in);
        int NumeroFunci, HorasTrabalhadas;
        double salario, salarioRecebido;

        System.out.println("Digite o número do funcionário: ");
        NumeroFunci = funcionario.nextInt();

        System.out.println("Digite o total de horas trabalhadas:  ");
        HorasTrabalhadas = funcionario.nextInt();

        System.out.println("Digite o salário do funcionário: ");
        salario = funcionario.nextDouble();

        salarioRecebido = salario * HorasTrabalhadas;

        System.out.println("NÚMERO: " + NumeroFunci);
        System.out.println("SALÁRIO: R$ " + salarioRecebido);

        funcionario.close();
    }

}
