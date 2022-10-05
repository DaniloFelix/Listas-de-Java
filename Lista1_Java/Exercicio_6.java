import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {

        Scanner consumo = new Scanner(System.in);
        int distancia;
        double combustivelGasto, consumoDoCarro;

        System.out.println("Digite a distância: ");
        distancia = consumo.nextInt();

        System.out.println("Digite a quantidade de combustível gasto: ");
        combustivelGasto = consumo.nextDouble();

        consumoDoCarro = distancia / combustivelGasto;

        System.out.println("O consumo médio do automóvel foi de: " + consumoDoCarro + " Km/l");

        consumo.close();
    }

}
