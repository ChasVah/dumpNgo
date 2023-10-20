// SmallTruck
public class SmallTruck extends Vehicle {
    // Constructor
    public SmallTruck(double weight) {
        super("Small Truck", weight);
    }

    // Implementation of abstract method from Vehicle class
    @Override
    String unloadingDock() {
        if (weight < 5) {
            return "A, C, or D";
        } else {
            return "C or D";
        }
    }
}


