package Atividade14;

import java.util.Scanner;
import java.util.Locale;

public class Atividade14 {

    public static void main(String[] args) {

        try (Scanner leia = new Scanner(System.in).useLocale(Locale.US)) {

            int valor;

            System.out.println("Informa um valor");
            valor = leia.nextInt();

            int total = valor % 2;

            if (total == 0) {

                System.out.print(" Este valor Par");

            } else {

                System.out.print("Este valor e Impar");
            }
        }

    }
}
