package lab5;

public class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, String model, int numOfDoors) {
        super(brand, model);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }
}
