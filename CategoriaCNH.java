import java.util.Scanner;

public class CategoriaCNH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de rodas do veículo: ");
        int quantidadeRodas = input.nextInt();

        System.out.print("Digite o peso bruto do veículo em kg: ");
        double pesoBruto = input.nextDouble();

        System.out.print("Digite a quantidade de pessoas no veículo: ");
        int quantidadePessoas = input.nextInt();

        String categoria = "";

        if (quantidadeRodas == 2 || quantidadeRodas == 3) {
            categoria = "A";
        } else if (quantidadeRodas == 4 && quantidadePessoas <= 8 && pesoBruto <= 3500) {
            categoria = "B";
        } else if (quantidadeRodas >= 4 && pesoBruto > 3500 && pesoBruto <= 6000) {
            categoria = "C";
        } else if (quantidadeRodas >= 4 && quantidadePessoas > 8) {
            categoria = "D";
        } else if (quantidadeRodas >= 4 && pesoBruto > 6000) {
            categoria = "E";
        } else {
            System.out.println("Não foi possível determinar a categoria para o veículo informado.");
            input.close();
            return;
        }

        System.out.println("A categoria necessária para dirigir/pilotar o veículo é: " + categoria);
        input.close();
    }
}
