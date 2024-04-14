package Atividade03;

import java.util.Scanner;

public class atividade {

    public static void main(String[] args) {

       try(Scanner leia = new Scanner(System.in)){
        
        double fahrenheit = 0;
        double total;


        System.out.println("informa um valor em Fahrenheit");
        fahrenheit = leia.nextDouble();

        total = ((fahrenheit - 32) / 9) * 5;

        System.out.println("Craus Celsius " + total);
    
    }

    
    }
    
}
