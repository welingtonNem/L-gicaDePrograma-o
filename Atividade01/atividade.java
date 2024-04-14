package Atividade01;

import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {

        try (Scanner leia = new Scanner(System.in)) {

            int A = 0;
            int B;
            int C;

            System.out.println("Diginta um valor");
            A = leia.nextInt();

            B = A + 1;
            C = A - 1;
            System.out.println("Sucessor " + B);
            System.out.println("Antecessor " + C);

        }

    }
}