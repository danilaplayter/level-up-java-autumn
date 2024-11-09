package by.bsuir.levelup.lesson01;

import java.util.Scanner;

/**
 * Write a program that solves simple quadratic equations. The correctness of the data is guaranteed. Roots can only be integers.
 * Possible answers:
 * <br>
 * if 2 roots: <1 root> <2 root>
 * <br>
 * if 1 root: <1 root>
 * <br>
 * if there are no roots: No roots
 */
public class QuadraticEquation {

    public static void main(String[] args) {
        // DON'T TOUCH START.

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // first
        int b = scanner.nextInt(); // middle
        int c = scanner.nextInt(); // free

        scanner.close();

        // DON'T TOUCH END.

        /*
        Implement the algorithm for solving a quadratic equation here.
         */

        int d = b*b - 4 * a * c;
         if (d == 0){
             System.out.println("There is one root = " + (-b/(2*a)) + " .");
         }
         if(d > 0){
             System.out.println("There are two roots.\n root_1 = " + ((-b - sqrt(d))/(2*a)) + "\n root_2 = " + ((-b + sqrt(d))/(2*a)));
         }
         if(d < 0){
             System.out.println("There are no roots.");
         }
        
    }

}
