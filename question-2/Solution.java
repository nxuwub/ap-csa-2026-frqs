public class Bottle {
    private double capacity;
    private double amount;

    public Bottle(double cap) {
        capacity = cap;
        amount = cap; 
    }

    public double updateAmount(double remove) {
        amount = amount - remove; 
        if (amount < capacity * 0.25) {
            amount = capacity; 
        }
        return amount;
    }
}
