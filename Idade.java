import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idadeMaisVelha = Integer.MIN_VALUE;
        int idadeMaisNova = Integer.MAX_VALUE;

        System.out.println("Digite as idades de 12 pessoas:");

        for (int i = 1; i <= 12; i++) {
            System.out.print("Pessoa " + i + ": ");
            int idade = input.nextInt();

            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
            }

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
            }
        }

        System.out.println("Idade mais velha: " + idadeMaisVelha);
        System.out.println("Idade mais nova: " + idadeMaisNova);

        input.close();
    }
}
