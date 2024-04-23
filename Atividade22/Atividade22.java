package Atividade22;

import java.util.Scanner;
import java.util.Locale;

public class Atividade22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitar o salário fixo e o valor das vendas
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor das vendas efetuadas pelo vendedor: ");
        double valorVendas = scanner.nextDouble();

        // Calcular a comissão
        double comissao;
        if (valorVendas <= 1500) {
            comissao = valorVendas * 0.03; // 3% sobre o total das vendas até R$ 1.500,00
        } else {
            comissao = 1500 * 0.03 + (valorVendas - 1500) * 0.05; // 3% até R$ 1.500,00 e 5% sobre o que ultrapassar
        }

        // Calcular o salário total
        double salarioTotal = salarioFixo + comissao;

        // Exibir o salário total
        System.out.println("O salário total do vendedor é: R$" + salarioTotal);
    }
}