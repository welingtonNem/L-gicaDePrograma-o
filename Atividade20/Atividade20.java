package Atividade20;

import java.util.Scanner;
import java.util.Locale;

public class Atividade20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7.0) {

            System.out.println("Aprovado");
        } else {

            System.out.print("Digite a nota do exame final: ");
            double notaExameFinal = scanner.nextDouble();

            double mediaFinal = (media + notaExameFinal) / 2;

            if (mediaFinal >= 7.0) {

                System.out.println("Aprovado com a nota fixa 6");
            } else {

                System.out.println("Reprovado");
            }
        }
    }
}
