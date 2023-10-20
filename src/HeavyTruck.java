// HeavyTruck
public class HeavyTruck extends Vehicle {
    // Constructor
    public HeavyTruck(double weight) {
        super("Heavy Truck", weight);
    }

    // Implementation of abstract method from Vehicle class
    @Override
    String unloadingDock() {
        if (weight < 9) {
            return "D or E";
        } else {
            return "E";
        }
    }
}


