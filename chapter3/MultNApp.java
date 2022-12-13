package gr.aueb.cf.chapter3;

import java.util.Scanner;

/**
 * υπολογίζει το 1*2*3*...*n
 * όπου n ένας ακέραιος που δίνει ο χρήστης
 *
 * @author papad
 */

public class MultNApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mult = 1;
        int i = 1;
        int n = 0;


        System.out.println("Εισάγετε έναν αριθμό μεγαλύτερο του μηδενός");
        n = in.nextInt();
        while (i<=n){
            mult = mult*i;
            i++;
        }

        System.out.println("Το γινόμενο είναι: " + mult);

    }
}
