package by.bsuir.levelup.lesson01part2;
import java.util.Scanner;
import static java.lang.Math.sqrt;

/*
 * Check the validity of triangle (a, b, c)
 * If triangle exists - print their area
 * Else - print "Invalid triangle"
 *
 * ALARAM! Area - INTEGER
 */
public class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();

        /*
        Implement your logic here
         */

        if((a + b > c) || (a + c > b) || (c + b > a)){
            System.out.println("triangle area is " + (sqrt( (a+b+c)/2*((a+b+c)/2 - a)*((a+b+c)/2 - b) *((a+b+c)/2 - c ) )));
        }
        else{
            System.out.println("this triangle isn't exist.");
        }
    }

}
