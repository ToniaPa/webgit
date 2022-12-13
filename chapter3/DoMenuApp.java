package gr.aueb.cf.chapter3;

/**
 * η do while εκτελείται τουλάχιστον μία φορά
 *
 * @author papad
 */

import java.util.Scanner;

public class DoMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("Επιλέξτε ένα από τα παρακάτω");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3. exit");

            choice = in.nextInt();
        }while (choice !=3);

        System.out.println("Bye");
    }
}
