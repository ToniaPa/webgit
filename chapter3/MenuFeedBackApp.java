package gr.aueb.cf.chapter3;

import java.util.Scanner;

/**
 * implements a menu feedback
 * if-then-else
 */
public class MenuFeedBackApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Refresh");
            System.out.println("5. Exit");

            choice = in.nextInt();

            if(choice ==1) {
                System.out.println("sucessfull Insert");
            } else if(choice == 2) {
                System.out.println("successfull Search");
            } else if (choice ==3){
                System.out.println("successfull Delete");
            } else if(choice == 4){
                System.out.println("successfull Refresh");
            } else if(choice == 5){
                System.out.println("you gave Exit");
            } else {
                System.out.println("wrong menu item");
            }

        } while (choice != 5);
        System.out.println("Bye");
    }
}
