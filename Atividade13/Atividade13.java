package Atividade13;

import java.util.Scanner;
import java.util.Locale;

public class Atividade13 {

    public static void main(String[] args) {

        try (Scanner leia = new Scanner(System.in).useLocale(Locale.US)) {

            int valor;

            System.out.println("Informa um valor");
            valor = leia.nextInt();

            if (valor > 10) {

                System.out.println("MAIOR QUE 10! ");
            } else {
                System.out.println("NAO E MAIOR QUE 10!");
            }
        }

    }
}
