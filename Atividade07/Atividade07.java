package Atividade07;

import java.util.Locale;
import java.util.Scanner;

public class Atividade07 {
    
    public static void main(String[] args) {
        

        try(Scanner ler = new Scanner(System.in).useLocale(Locale.US)){

            char c;
            int numeros;
            int antecessor;
            int sucessor;

            System.out.println("Diginta seu um caracter");
            c = ler.next().charAt(0);

            numeros = (int) c;

            antecessor = numeros - 1;
            sucessor = numeros + 1;

            System.out.println("Seu antecessor e seu sucessor " + antecessor + "  " + sucessor);
            System.out.println("Seu antecessor e seu sucessor " + (char) antecessor + "  " + (char) sucessor);



        }
    }
}
