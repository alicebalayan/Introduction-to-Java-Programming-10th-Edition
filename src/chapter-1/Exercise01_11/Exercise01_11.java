/*Population projection

*  The U.S. Census Bureau projects population based on the
following assumptions:

 1 birth every 7 seconds
 1 death every 13 seconds
 1 new immigrant every 45 seconds

 Write a program to display the population for each of the next five years. Assume the
current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
integers perform division, the result is an integer. The fractional part is truncated.
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
the fractional part, one of the values involved in the division must be a number with a
decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.*/

public class Exercise01_11 {

    public static void main (String [] args) {

        System.out.println("Population Projection for 5 years: ");

        System.out.println("Current population +((births per year)-(deaths per year)+(new immigrants per year *year))");
        System.out.println("Current population is 312,032,486");
        System.out.println("1 year has 365 days");
        System.out.println("1 birth every 7 seconds");
        System.out.println("1 death every 13 seconds");
        System.out.println("1 new immigrant every 45 seconds");

        System.out.println("Year 1 projection: ");
        System.out.println(312032486 + (((31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0)) * 1));//1 for year 1
        System.out.println("Year 2 projection: ");
        System.out.println(312032486 + (((31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0)) * 2));//2 for year 2
        System.out.println("Year 3 projection: ");
        System.out.println(312032486 + (((31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0)) * 3));//3 for year 3
        System.out.println("Year 4 projection: ");
        System.out.println(312032486 + (((31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0)) * 4));//4 for year 4
        System.out.println("Year 5 projection: ");
        System.out.println(312032486 + (((31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0)) * 5));//5 for year 5
    }


}