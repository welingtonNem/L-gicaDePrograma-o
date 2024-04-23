package Atividade23;

import java.util.Scanner;
import java.util.Locale;

public class Atividade23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitar ao usuário para inserir um valor
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        // Verificar se o valor é positivo, negativo ou zero
        if (valor > 0) {
            System.out.println("O valor é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é zero.");
        }
    }
}
