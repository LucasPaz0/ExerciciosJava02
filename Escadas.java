import java.util.Scanner;

public class Escadas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de níveis da escada: ");
        int niveis = input.nextInt();

        System.out.println("Escada com " + niveis + " níveis:");

        for (int i = 1; i <= niveis; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
