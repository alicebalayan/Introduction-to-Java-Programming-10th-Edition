/*Convert feet into meters

Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter.

*/

import java.util.*;

public class Exercise02_03 {

    public static void main (String [] args) {

        Scanner input = new Scanner (System.in);

        final double METERS_PER_FOOT = 0.305;

        System.out.print("Enter a value for feet: ");

        double feet = input.nextDouble();

        double meters = feet * METERS_PER_FOOT;

        System.out.println(feet + " feet is " + meters + " meters");

    }

}