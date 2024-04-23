package Atividade26;

import java.util.Scanner;
import java.util.Locale;

public class Atividade26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ler os dois valores
        System.out.println("Digite o primeiro valor:");
        int primeiro = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int segundo = scanner.nextInt();

        // Comparar os valores e imprimir a mensagem apropriada
        if (primeiro == segundo) {
            System.out.println("Números iguais");
        } else if (primeiro > segundo) {
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo maior");
        }
    }
}
