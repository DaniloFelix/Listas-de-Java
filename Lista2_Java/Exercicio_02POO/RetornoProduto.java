package Lista2_Java.Exercicio_02POO;

import java.util.Scanner;

public class RetornoProduto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto p = new Produto();

        System.out.println("Informe o id do Produto: ");
        Produto.setId(sc.nextInt());

        System.out.println(Produto.getId());

        sc.close();

    }

}
