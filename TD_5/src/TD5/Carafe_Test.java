package TD5;

public class Carafe_Test {
    public static void main(String[] args) {
        Carafe grandeCarafe = new Carafe(7);
        Carafe petiteCarafe = new Carafe(4); 

        grandeCarafe.fill();
        System.out.println("Grande Carafe après remplir: " + grandeCarafe.getCurrentAmount());
        grandeCarafe.pour(petiteCarafe);
        System.out.println("Grande Carafe après transvaser: " + grandeCarafe.getCurrentAmount());
        System.out.println("Petite Carafe après transvaser: " + petiteCarafe.getCurrentAmount());

        petiteCarafe.empty(); 
        System.out.println("Petite Carafe après vider: " + petiteCarafe.getCurrentAmount());

        grandeCarafe.pour(petiteCarafe); 
        System.out.println("Grande Carafe après second transvaser: " + grandeCarafe.getCurrentAmount());
        System.out.println("Petite Carafe après second transvaser: " + petiteCarafe.getCurrentAmount());
    }
}
