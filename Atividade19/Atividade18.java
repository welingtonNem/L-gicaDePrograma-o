package Atividade19;

import java.util.Scanner;
import java.util.Locale;

public class Atividade18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Professor 1 (Mestre):");
        System.out.print("Digite a quantidade de horas-aula dadas: ");
        int horasAulaMestre = scanner.nextInt();
        System.out.print("Digite o valor por hora: ");
        double valorHoraMestre = scanner.nextDouble();

        System.out.println("\nProfessor 2 (Doutor):");
        System.out.print("Digite a quantidade de horas-aula dadas: ");
        int horasAulaDoutor = scanner.nextInt();
        System.out.print("Digite o valor por hora: ");
        double valorHoraDoutor = scanner.nextDouble();

        double salarioTotalMestre = horasAulaMestre * valorHoraMestre;
        double salarioTotalDoutor = horasAulaDoutor * valorHoraDoutor;

        // Determinar qual professor tem o salário total maior e exibir na tela
        if (salarioTotalMestre > salarioTotalDoutor) {
            System.out.println("\nO professor mestre tem o salário total maior.");
        } else if (salarioTotalMestre < salarioTotalDoutor) {
            System.out.println("\nO professor doutor tem o salário total maior.");
        } else {
            System.out.println("\nAmbos os professores têm o mesmo salário total.");
        }

    }
}
