import java.util.Scanner;

public class ConversorBinario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        String binario = converterBinario(numero);
        System.out.println("O número " + numero + " em binário é: " + binario);

        input.close();
    }

    public static String converterBinario(int numero) {
        StringBuilder binario = new StringBuilder();

        while (numero > 0) {
            int resto = numero % 2;
            binario.insert(0, resto);
            numero = numero / 2;
        }

        return binario.toString();
    }
}