import java.util.Scanner;

public class Exercicio_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String caracteristica1, caracteristica2, caracteristica3;

        System.out.println("Digite a primeira caracteristica do animal ");
        caracteristica1 = input.next();

        System.out.println("Digite a segunda: ");
        caracteristica2 = input.next();

        System.out.println("Digite a terceira caracteristica do animal ");
        caracteristica3 = input.next();

        if (caracteristica1.equalsIgnoreCase("vertebrado")) {
            if (caracteristica2.equalsIgnoreCase("ave")) {
                if (caracteristica3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("Aguia");
                } else {
                    System.out.println("Pomba");
                }
            }
        }
        if (caracteristica1.equalsIgnoreCase("vertebrado")) {
            if (caracteristica2.equalsIgnoreCase("mamifero")) {
                if (caracteristica3.equalsIgnoreCase("onivoro")) {
                    System.out.println("Homem");
                } else {
                    System.out.println("Vaca");
                }
            }
        }
        if (caracteristica1.equalsIgnoreCase("invertebrado")) {
            if (caracteristica2.equalsIgnoreCase("inseto")) {
                if (caracteristica3.equalsIgnoreCase("hematofago")) {
                    System.out.println("Pulga");
                } else {
                    System.out.println("Lagarta");
                }
            }
        }

        if (caracteristica1.equalsIgnoreCase("invertebrado")) {
            if (caracteristica2.equalsIgnoreCase("anelideo")) {
                if (caracteristica3.equalsIgnoreCase("hematofago")) {
                    System.out.println("Sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }

        input.close();

    }

}
