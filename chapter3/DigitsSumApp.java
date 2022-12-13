package gr.aueb.cf.chapter3;

import java.util.Scanner;

/**
 * μετράει το άθροισμα των ψηφίων ενός ακεραίου
 * αν έχουμε 123 το άθροισμα είναι 6
 *
 * @author papad
 */

public class DigitsSumApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int digit = 0;
        int inputNum = 0;
        int digitsCount = 0;

        System.out.println("Παρακαλώ δώστε έναν ακέραιο αριθμό");
        num = in.nextInt();

        inputNum = num;
        do{
            digit = num%10;
            digitsCount++;
            sum += digit;
            num = num / 10;
        } while (num != 0);

        System.out.printf("To άθροισμα είναι %d κι έχει %d ψηφία",sum, digitsCount);
    }
}
