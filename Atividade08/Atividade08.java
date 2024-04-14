package Atividade08;

import java.util.Locale;
import java.util.Scanner;

public class Atividade08{

    public static void main(String[] args) {
       
            try(Scanner ler = new Scanner(System.in).useLocale(Locale.US)){

              
              
                String c;
                
                System.out.println("Diginta um caractere maiúsculo de A a Z,");
                c = ler.nextLine().toLowerCase();

                System.out.println("caractere minúsculo: " + c);
            }
       
    }
}