package gr.aueb.cf.chapter3;

import java.util.Scanner;

/**
 * case στην θέση των nested if
 * η εντολή είναι switch-case
 */
public class CaseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int modulesCount = 0;
        int totalMarks = 0;
        int average = 0;

        System.out.println("Please give number of Modules and total Marks");
        modulesCount = in.nextInt();
        totalMarks = in.nextInt();

        if(modulesCount <= 0){
            System.out.println("number of Modules must be more than zero");
        } else {
            average = totalMarks / modulesCount;

            /**
             * switch(number){
             *     //Case statements
             *     case 10: System.out.println("10");
             *     break;
             *     case 20: System.out.println("20");
             *     break;
             *     case 30: System.out.println("30");
             *     break;
             *     //Default case statement
             *     default:System.out.println("Not in 10, 20 or 30");
             *     }
             */

            System.out.println("Average Marks: " + average);

        }

    }

}
