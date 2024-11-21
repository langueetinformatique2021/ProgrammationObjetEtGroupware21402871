package td4;

public class TD4_EX_2 {
    public static void main(String[] args) {
        String s1 = "daidalus";
        String s2 = "suladiad";
        
        boolean flagPostTest = true;
        boolean flagPreTest = true; 

        // ** do-while **
        int i1 = 0, i2 = s2.length() - 1;
        do {
            if (s1.charAt(i1) != s2.charAt(i2)) {
                flagPostTest = false;
                break;
            }
            i1++;
            i2--;
        } while (i1 < s1.length() && i2 >= 0);

        System.out.println("sont miroirs (do-while): " + flagPostTest);

        // ** while **
        i1 = 0;
        i2 = s2.length() - 1;
        while (i1 < s1.length() && i2 >= 0) {
            if (s1.charAt(i1) != s2.charAt(i2)) {
                flagPreTest = false;
                break;
            }
            i1++;
            i2--;
        }

        System.out.println("sont miroirs (while): " + flagPreTest);
    }
}
