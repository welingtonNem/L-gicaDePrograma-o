package Atividade10;

import java.util.Scanner;
import java.util.Locale;

public class Atividade10 {

    public static void main(String[] args) {

        try (Scanner leia = new Scanner(System.in).useLocale(Locale.US)) {

            int totaldeeleitores;
            int votosbrancos;
            int votosnulos;
            int votosvalidos;

            System.out.println("Diginta valor total de leitores");
            totaldeeleitores = leia.nextInt();

            System.out.println("Diginta votos brancos");
            votosbrancos = leia.nextInt();

            System.out.println("Diginta votos nulos");
            votosnulos = leia.nextInt();

            System.out.println("Diginta votos validos");
            votosvalidos = leia.nextInt();

            double validos = votosvalidos / (double) totaldeeleitores * 100;
            double bracos = votosbrancos / (double) totaldeeleitores * 100;
            double nulos = votosnulos / (double) totaldeeleitores * 100;

            System.out.println("Percentual de votos brancos: " + bracos + "%");
            System.out.println("Percentual de votos nulos: " + nulos + "%");
            System.out.println("Percentual de votos válidos: " + validos + "%");

        }

    }
}
