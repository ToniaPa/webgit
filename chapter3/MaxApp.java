package gr.aueb.cf.chapter3;

import java.util.Scanner;

/**
 * find max between 2 numbers
 */
public class MaxApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please give 2 integers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        result = (num1 > num2) ? num1 : num2;
        //System.out.printf("Max number is %d", result);
        System.out.printf("Max number is %d", (num1 > num2) ? num1 : num2);


    }
}
