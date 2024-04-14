package Atividade12;

import java.util.Scanner;
import java.util.Locale;

public class Atividade12 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.print("Digite o custo de fábrica do carro: ");
            double custoFabrica = scanner.nextDouble();

            double percentualDistribuidor = 0.28; // 28%
            double percentualImpostos = 0.45; // 45%

            double custoDistribuidor = custoFabrica * percentualDistribuidor;
            double custoImpostos = custoFabrica * percentualImpostos;

            double custoTotal = custoFabrica + custoDistribuidor + custoImpostos;

            System.out.println("O custo total do carro novo é: " + custoTotal);

        }

    }
}
