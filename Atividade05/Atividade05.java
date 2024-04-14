package Atividade05;


import java.util.Scanner;

public class Atividade05{

    public static void main(String[] args) {

        try(Scanner ler = new Scanner(System.in)){


            int mes;
            int dias;
            int anos;


            System.out.println("Diginta seu anos idades");
            anos = ler.nextInt();

            System.out.println("Diginta seu mes");
            mes = ler.nextInt();

            System.out.println("Diginta seu dias");
            dias = ler.nextInt();


            int anosPradias =  anos * 365 + mes * 30 + dias;

            System.out.println("Dias " + anosPradias);
        }
        

        
    }
}