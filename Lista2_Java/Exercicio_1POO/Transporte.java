package Lista2_Java.Exercicio_1POO;

import java.util.Scanner;

public class Transporte {

    private int id;
    private static int ano;
    private static String modelo;
    private double carga_maxima;
    private double potencia;

    public void leiaModeloAno() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano do carro: ");
        ano = sc.nextInt();

        System.out.println("Digite o modelo do carro: ");
        modelo = sc.next();

    }

    public void consumo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a potência do carro: ");
        potencia = sc.nextDouble();

        System.out.println("Digite a carga máxima do carro: ");
        carga_maxima = sc.nextDouble();

    }

    public void gravaModeloAno() {

        System.out.println("O Modelo do Carro é: " + modelo);
        System.out.println("O Ano do Carro é: " + ano);
    }

    public void calculo_consumo() {

        double total = (potencia * carga_maxima) / 100;

        System.out.println("O total é: " + total);

    }

}
