package TD5;

public class Date_Test {
    public static void main(String[] args) {
        Date today = new Date();  
        Date targetDate = new Date(14, 7, 2016); 

        today.Afficher();
        targetDate.Afficher();

        int daysRemaining = 0;
        
        while (today.CompareTo(targetDate)) {
            today.Incrementer();
            daysRemaining++;
        }
        
        System.out.println("Nb dejours restants avant le 14 juillet 2016: " + daysRemaining);

        Date dfin = new Date(); 
        today.Afficher(); 
        dfin.Afficher(); 

        do {
            today.Incrementer();
            today.Afficher();
        } while (today.CompareTo(dfin));  
    }
}
