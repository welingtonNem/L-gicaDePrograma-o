
package Atividade17;

import java.util.Scanner;
import java.util.Locale;

public class Atividade17 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in).useLocale(Locale.US);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {

            System.out.print("Digite o " + (i + 1) + "º valor inteiro: ");

            int valor = leia.nextInt();

            if (valor > maior) {
                maior = valor;

            }
            if (valor < menor) {
                menor = valor;
            }
        }

        // Exiba o maior e o menor valores
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

    }
}