package td4;

public class TD4_EX_3 {
    public static void main(String[] args) {
        String[] prenoms = {"Christian", "Karen", "Victoria", "Agatha", "Philippe", "Djamé"};
        int imin = 0;
        for (int i = 1; i < prenoms.length; i++) {
            if (prenoms[i].compareTo(prenoms[imin]) < 0) {
                imin = i; 
            }
        }
        System.out.println(imin);
    }
}

