package Atividade09;

import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class Atividade09 {

    public static void main(String[] args) {

        try (Scanner ler = new Scanner(System.in).useLocale(Locale.US)) {

            double x, a, b, c, d, e;

            System.out.println("Digita um valor");
            x = ler.nextDouble();

            a = Math.pow(3, x) + 5 * Math.pow(x, 7) + 2 * Math.pow(2, 9);
            System.out.println("Resposta A: " + a);

            b = Math.sin(x) / x;
            System.out.println("Resposta B: " + b);

            c = Math.pow((1 + 1 / x), x);
            System.out.println("Resposta C: " + c);

            d = Math.sqrt(Math.log(Math.abs(x) + 1)) + Math.log(Math.abs(x) + 1) / Math.log(2);
            System.out.println("Resposta D: " + d);

            e = Math.asin(x) + Math.acos(x);
            System.out.println("Resposta E: " + e);

        }
    }
}
