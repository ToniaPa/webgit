package gr.aueb.cf.chapter3;

/**
 * εκτυπώνει αστεράκια σε φθίνουσα μορφή
 * για 10 γραμμές συνολικά
 *
 * ΔΕΝ ΔΟΥΛΕΥΕΙ
 * Η ΛΎΣΗ ΕΙΝΑΙ ΣΤΗΝ 1 ώρα ΤΟΥ ΒΙΝΤΕΟ
 *
 * @author papad
 */
public class StarsDescApp {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i<=10){
            j = 1;
            while (j<=10){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
