package TD5;

public class Carafe {
    private int currentAmount, maxCapacity;

    public Carafe(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentAmount = 0;
    }

    public void fill() {
        currentAmount = maxCapacity;
    }

    public void empty() {
        currentAmount = 0;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void pour(Carafe otherCarafe) {
        int availableSpace = maxCapacity - currentAmount;
        if (otherCarafe.getCurrentAmount() <= availableSpace) {
            currentAmount += otherCarafe.getCurrentAmount();
            otherCarafe.empty();
        } else {
            otherCarafe.currentAmount -= availableSpace;
            fill();
        }
    }
}
