package gr.aueb.cf.chapter3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * ελέγχουμε αν ένας ακέραιος που δίνει ο user
 * είναι άρτιος
 *
 * @author aveMoi
 */
public class EvenApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        boolean isEven = false;

        System.out.println("Παρακαλώ δώστε έναν αριθμό");
        num1 = in.nextInt();

        isEven = (num1%2) == 0;
        System.out.println(num1 + " είναι άρτιος: " + isEven);

    }
}
