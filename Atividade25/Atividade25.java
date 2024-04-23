package Atividade25;

import java.util.Scanner;
import java.util.Locale;

public class Atividade25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ler os nomes dos times e o número de gols marcados
        System.out.println("Digite o nome do primeiro time:");
        String time1 = scanner.nextLine();
        System.out.println("Digite o número de gols marcados pelo primeiro time:");
        int golsTime1 = scanner.nextInt();

        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite o nome do segundo time:");
        String time2 = scanner.nextLine();
        System.out.println("Digite o número de gols marcados pelo segundo time:");
        int golsTime2 = scanner.nextInt();

        // Determinar o vencedor ou se houve empate
        String vencedor;
        if (golsTime1 > golsTime2) {
            vencedor = time1;
        } else if (golsTime2 > golsTime1) {
            vencedor = time2;
        } else {
            vencedor = "EMPATE";
        }

        // Imprimir o resultado
        System.out.println("O vencedor da partida é: " + vencedor);
    }
}
