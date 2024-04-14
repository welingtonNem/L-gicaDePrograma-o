package Atividade11;

import java.util.Scanner;
import java.util.Locale;

public class Atividade11 {

    public static void main(String[] args) {

        try (Scanner leia = new Scanner(System.in).useLocale(Locale.US)) {

            double salario;
            double percentual;
            double reajuste;

            System.out.println("Informa seu salario");
            salario = leia.nextDouble();

            System.out.println("Informa seu salario");
            percentual = leia.nextDouble();

            reajuste = (salario * percentual) + salario;

            System.out.println("Valor do novo salário: " + reajuste);

        }

    }
}
