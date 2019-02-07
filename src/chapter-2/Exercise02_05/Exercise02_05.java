//Financial application

import java.util.Scanner;

public class Exercise02_05{

    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double rate = subtotal * (gratuityRate /100);
        double total = subtotal + rate;
        System.out.print("The total is " + total);

    }
}
