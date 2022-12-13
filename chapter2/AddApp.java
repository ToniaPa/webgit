package gr.aueb.cf.chapter2;

/**
 * εμφανίζει το άθροισμα δύο αριθμών
 * @aveMoiTonia
 */
public class AddApp {
    public static void main(String[] args) {
        //δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5, num2 = 1298468;
        int result = 0;

        //εντολές
        result = num1 + num2;

        //εκτύπωση αποτελέσματος
        System.out.print("Tο άθροισμα των " + num1 + " και " + num2 + " είναι = " + result);
        System.out.println();
        System.out.printf("Το αποτέλεσμα των %d και %d είναι %,d\n", num1, num2, result);
        System.out.println("Ave Moi, Tonia");
    }
}
