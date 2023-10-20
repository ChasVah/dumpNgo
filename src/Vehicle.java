// Vehicle
public abstract class Vehicle {
    String type;
    double weight; // Weight in tons

    // Constructor
    public Vehicle(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    // Abstract method to be implemented by subclasses
    abstract String unloadingDock();
}

