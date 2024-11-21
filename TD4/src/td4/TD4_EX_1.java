package td4;

public class TD4_EX_1 {
    public static void main(String[] args) {
        int p1 = 25, p2 = 14, p3 = -4;

        // ** max **
        int max;
        if (p1 >= p2 && p1 >= p3) {
            max = p1;
        } else if (p2 >= p1 && p2 >= p3) {
            max = p2;
        } else {
            max = p3;
        }
        System.out.println("maximum est: " + max);

        // ** min **
        int min;
        if (p1 <= p2 && p1 <= p3) {
            min = p1;
        } else if (p2 <= p1 && p2 <= p3) {
            min = p2;
        } else {
            min = p3;
        }
        System.out.println("minimum est: " + min);

        // ** median **
        int med;
        if ((p1 > p2 && p1 < p3) || (p1 < p2 && p1 > p3)) {
            med = p1;
        } else if ((p2 > p1 && p2 < p3) || (p2 < p1 && p2 > p3)) {
            med = p2;
        } else {
            med = p3;
        }
        System.out.println("médiane est: " + med);
    }
}

