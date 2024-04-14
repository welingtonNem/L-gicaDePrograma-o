package Atividade02;

import java.util.Scanner;

public class atividade {

    public static void main(String[] args) {

        try (Scanner leia = new Scanner(System.in)) {

            double base = 0;
            double altura = 0;
            double total;

            System.out.println("Informa valor da base");
            base = leia.nextDouble();

            System.out.println("Informa o valor da altura");
            altura = leia.nextDouble();

            total = base * altura;

            System.out.println("Àrea do Retângulo " + total + "CM");
        }
    }

}
