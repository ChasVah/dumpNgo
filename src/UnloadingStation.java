import java.util.ArrayList;
import java.util.Iterator;

public class UnloadingStation {
    private ArrayList<Vehicle> parkedVehicles = new ArrayList<>();

    // Method to register a new vehicle
    public void registerVehicle(Vehicle vehicle) {
        parkedVehicles.add(vehicle);
        System.out.println("Vehicle registered at the station.");
    }

    // Method to remove a vehicle
    public void removeVehicle(Vehicle vehicle) {
        Iterator<Vehicle> iterator = parkedVehicles.iterator();
        while (iterator.hasNext()) {
            Vehicle v = iterator.next();
            if (v.equals(vehicle)) {
                iterator.remove();
                System.out.println("Vehicle removed from the station.");
                return;
            }
        }
        System.out.println("Vehicle not found at the station.");
    }

    // Method to display parked vehicles
    public void showParkedVehicles() {
        System.out.println("Parked vehicles:");
        for (Vehicle vehicle : parkedVehicles) {
            System.out.println("Dock: " + vehicle.unloadingDock() + ", Type: " + vehicle.type + ", Weight: " + vehicle.weight + " tons");
        }
    }
}





