package gr.aueb.cf.chapter2;

import java.math.BigInteger;

/**
 * κάνουμε import μία έτοιμη class, την BigInteger
 * η Java ΔΕΝ φορτώνει την class
 * αλλά ανοίγει ένα κανάλι αναφοράς στην class
 *
 */
public class BigIntegerApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("214748364787923487985266678785166842654584567487465456");
        BigInteger bigNum2 = new BigInteger("21474836478975");
        BigInteger result;

        result = bigNum1.add(bigNum2);

        System.out.printf("Αποτέλεσμα πρόσθεσης: %,d", result);

    }
}
