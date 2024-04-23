package Atividade18;

import java.util.Scanner;

public class Atividade18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para inserir dois valores inteiros
        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = scanner.nextInt();

        // Exibir o menu de opções
        System.out.println("\nMenu:");
        System.out.println("1. Soma");
        System.out.println("2. Diferença");
        System.out.println("3. Produto");
        System.out.println("4. Divisão");
        System.out.println("5. Resto da divisão");
        System.out.println("6. Potência (do primeiro pelo segundo)");
        System.out.println("7. Raiz quadrada do primeiro número");
        System.out.println("8. Raiz quadrada do segundo número");
        System.out.print("\nEscolha uma opção: ");

        int opcao = scanner.nextInt();

        // Realizar a operação conforme a opção escolhida
        switch (opcao) {
            case 1:
                System.out.println("Soma: " + (valor1 + valor2));
                break;
            case 2:
                System.out.println("Diferença: " + (valor1 - valor2));
                break;
            case 3:
                System.out.println("Produto: " + (valor1 * valor2));
                break;
            case 4:
                if (valor2 != 0) {
                    System.out.println("Divisão: " + ((double) valor1 / valor2));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            case 5:
                if (valor2 != 0) {
                    System.out.println("Resto da divisão: " + (valor1 % valor2));
                } else {
                    System.out.println("Não é possível calcular o resto da divisão por zero.");
                }
                break;
            case 6:
                System.out.println("Potência: " + Math.pow(valor1, valor2));
                break;
            case 7:
                System.out.println("Raiz quadrada do primeiro número: " + Math.sqrt(valor1));
                break;
            case 8:
                System.out.println("Raiz quadrada do segundo número: " + Math.sqrt(valor2));
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
