package gr.aueb.cf.chapter3;

/**
 * εκτυπώνει αστεράκια σε αύξουσα μορφή
 * για 10 γραμμές συνολικά
 *
 * @author papad
 */

public class StarsAscApp {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i<=10){
            j = 1;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
