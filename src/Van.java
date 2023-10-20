// Van
public class Van extends Vehicle {
    // Constructor
    public Van(double weight) {
        super("Van", weight);
    }

    // Implementation of abstract method from Vehicle class
    @Override
    String unloadingDock() {
        return "A or B";
    }
}

