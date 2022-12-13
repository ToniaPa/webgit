package gr.aueb.cf.chapter3;

/**
 * εκτυπώνει 10 γραμμές, όπου κάθε γραμμή έχει 10 αστεράκια
 *
 * @author aveMoi
 */
public class Stars10x10 {

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
