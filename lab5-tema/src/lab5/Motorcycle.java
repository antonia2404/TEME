package lab5;

public class Motorcycle extends Vehicle {
    private boolean hasFairing;

    public Motorcycle(String brand, String model, boolean hasFairing) {
        super(brand, model);
        this.hasFairing = hasFairing;
    }

    public boolean isHasFairing() {
        return hasFairing;
    }

    public void setHasFairing(boolean hasFairing) {
        this.hasFairing = hasFairing;
    }
}
