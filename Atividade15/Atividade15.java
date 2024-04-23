package Atividade15;

import java.util.Locale;
import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {

        try (Scanner leia = new Scanner(System.in).useLocale(Locale.US)) {

            double quatidade;
            double valor = 1.30;
            double valorP = 1.00;

            System.out.println("Qualtidade de maçao voçe comprou");
            quatidade = leia.nextDouble();

            if (quatidade >= 12) {

                double resposta = quatidade * valorP;
                System.out.println("Valor total é: " + resposta);

            } else {

                double resposta = quatidade * valor;
                System.out.println("Valor total é: " + resposta);
            }
        }

    }
}
