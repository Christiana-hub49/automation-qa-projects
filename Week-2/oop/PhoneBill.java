public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBill() {
        this.id = 0;
        this.baseCost = 50.0;
        this.allottedMinutes = 100;
        this.minutesUsed = 100;
    }

    public PhoneBill(int id) {
        this.id = id;
        this.baseCost = 50.0;
        this.allottedMinutes = 100;
        this.minutesUsed = 100;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage() {
        if (minutesUsed > allottedMinutes) {
            return (minutesUsed - allottedMinutes) * 0.25;
        }
        return 0;
    }

    public double calculateTax() {
        return (baseCost + calculateOverage()) * 0.15;
    }

    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printBill() {
        System.out.println("Bill ID: " + id);
        System.out.println("Base Cost: $" + baseCost);
        System.out.println("Overage Fee: $" + calculateOverage());
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Total: $" + calculateTotal());
    }
}
