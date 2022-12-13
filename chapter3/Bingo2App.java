package gr.aueb.cf.chapter3;

import java.util.Scanner;

public class Bingo2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int KEY = 10;
        int num = 0;
        boolean keyIsFound = false;

        System.out.println("Δώστε έναν αριθμό");
        while(true) {
            num = in.nextInt();

            if (num == KEY) {
                //keyIsFound = true;
                break;
            } else {
                System.out.println("Παρακαλώ ξαναπροσπαθήστε");
            }
        }
        System.out.println("Συγχαρητήρια!");
    }
}
