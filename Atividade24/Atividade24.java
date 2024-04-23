package Atividade24;

import java.util.Scanner;
import java.util.Locale;

/*
 * Faça um programa para ler três valores inteiros e escrevê-los em ordem 
   crescente
 * 
 */
public class Atividade24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = scanner.nextInt();

        // Encontrar o menor valor
        int menor = valor1;
        if (valor2 < menor) {
            menor = valor2;
        }
        if (valor3 < menor) {
            menor = valor3;
        }

        // Encontrar o maior valor
        int maior = valor1;
        if (valor2 > maior) {
            maior = valor2;
        }
        if (valor3 > maior) {
            maior = valor3;
        }

        // Encontrar o valor do meio
        int meio = valor1 + valor2 + valor3 - menor - maior;

        // Imprimir os valores em ordem crescente
        System.out.println("Os valores em ordem crescente são:");
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
    }
}
