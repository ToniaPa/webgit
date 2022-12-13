package gr.aueb.cf.chapter3;

import java.util.Scanner;

/**
 * διαβάζει από τον χρήστη έναν ακέραιο Ν
 * και βρίσκει το άθροισμα από 1 έως Ν
 *
 * @author papad
 */
public class SumNApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        int n = 0;


        System.out.println("Εισάγετε έναν αριθμό");
        n = in.nextInt();
        while (i<=n){
            sum+=i;
            i++;
        }

        System.out.println("Το άθροισμα είναι: " + sum);

    }
}
