package Atividade04;

import java.util.Scanner;

public class atividade {

    public static void main(String[] args) {

        try (Scanner leia = new Scanner(System.in)) {

            double n1, n2, n3, media;

            System.out.println("Infoema o primeiro valor ");
            n1 = leia.nextDouble();

            System.out.println("Infoema o sengundo valor ");
            n2 = leia.nextDouble();

            System.out.println("Infoema o terceiro valor ");
            n3 = leia.nextDouble();

            media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

            System.out.println("Media " + media);

        }

    }
}
