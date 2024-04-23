package Atividade16;

import java.util.Locale;
import java.util.Scanner;

public class Atividade16 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in).useLocale(Locale.US);

        double X = 0;
        double Y = 0;

        System.out.println("Digite as coordenadas (x, y): ");
        X = leia.nextDouble();
        Y = leia.nextDouble();

        if (X > 0 && Y > 0) {

            System.out.println("O ponto está no primeiro quadrante.");

        } else {

            if (X < 0 && Y > 0) {

                System.out.println("O ponto está no segundo quadrante.");

            } else {

                if (X < 0 && Y < 0) {

                    System.out.println("O ponto está no terceiro quadrante.");
                } else {

                    if (X > 0 && Y < 0) {

                        System.out.println("O ponto está no quarto quadrante.");
                    } else {

                        if (X == 0 && Y == 0) {

                            System.out.println("O ponto está na origem.");
                        } else {
                            if (X == 0) {

                                System.out.println("O ponto está sobre o eixo y.");
                            } else {

                                System.out.println("O ponto está sobre o eixo x.");
                            }
                        }
                    }
                }
            }
        }

    }
}
