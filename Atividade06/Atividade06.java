package Atividade06;

import java.util.Locale;
import java.util.Scanner;

public class Atividade06 {
    
    public static void main(String[] args) {
        
        try(Scanner ler = new Scanner(System.in).useLocale(Locale.US)){

            int segundos,h,m,s,resto;

            System.out.println("Digintas um valor em segundo: ");
            segundos = ler.nextInt();

            h = segundos / 3600;
            resto = segundos % 3600;
            m = resto / 60;
            s = resto & 60;

            System.out.println("Hora é: " + h + ":" + m + ":" + s);
        }
    }
}
