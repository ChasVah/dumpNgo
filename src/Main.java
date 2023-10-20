import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnloadingStation station = new UnloadingStation();

        // Main program loop
        while (true) {
            // Display the main menu and get user input
            System.out.println(" --Welcome to DumpNgo station-- ");
            System.out.println("   Parked Vehicles: Press 1");
            System.out.println("   Register new Vehicle: Press 2");
            System.out.println("   Remove Vehicle: Press 3");
            System.out.println("   Exit: Press 4");

            int choice = scanner.nextInt();
            scanner.nextLine(); // newline

            // user choice
            switch (choice) {
                case 1:
                    station.showParkedVehicles();
                    break;
                case 2:
                    registerNewVehicle(scanner, station);
                    break;
                case 3:
                    removeVehicle(scanner, station);
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to register a new vehicle
    private static void registerNewVehicle(Scanner scanner, UnloadingStation station) {
        // Implementation of registering a new vehicle
        System.out.println("----Choose type of vehicle----");
        System.out.println("1.  Van (Skåpbil)");
        System.out.println("2.  Small-Truck (Lätt Lastbil)");
        System.out.println("3.  Heavy-Truck (Tung Lastbil)");

        int typeChoice = scanner.nextInt();
        scanner.nextLine(); // newline

        String vehicleType;
        switch (typeChoice) {
            case 1:
                vehicleType = "Van";
                break;
            case 2:
                vehicleType = "Small Truck";
                break;
            case 3:
                vehicleType = "Heavy Truck";
                break;
            default:
                System.out.println("Invalid choice. Vehicle registration canceled.");
                return;
        }

        System.out.print("Enter weight of the vehicle: ");
        double weight = scanner.nextDouble();
        scanner.nextLine(); // newline

        Vehicle newVehicle;
        switch (typeChoice) {
            case 1:
                newVehicle = new Van(weight);
                break;
            case 2:
                newVehicle = new SmallTruck(weight);
                break;
            case 3:
                newVehicle = new HeavyTruck(weight);
                break;
            default:
                System.out.println("Invalid vehicle type.");
                return;
        }

        station.registerVehicle(newVehicle);
    }

    // Method to remove a vehicle
    private static void removeVehicle(Scanner scanner, UnloadingStation station) {
        // Implementation of removing a vehicle
        System.out.print("Enter the type of vehicle you want to remove (Van/Small Truck/Heavy Truck): ");
        String vehicleType = scanner.nextLine();
        System.out.print("Enter the weight of the vehicle you want to remove: ");
        double vehicleWeight = scanner.nextDouble();
        scanner.nextLine(); // newline

        Vehicle vehicleToRemove = null;
        switch (vehicleType.toLowerCase()) {
            case "van":
                vehicleToRemove = new Van(vehicleWeight);
                break;
            case "small truck":
                vehicleToRemove = new SmallTruck(vehicleWeight);
                break;
            case "heavy truck":
                vehicleToRemove = new HeavyTruck(vehicleWeight);
                break;
            default:
                System.out.println("Invalid vehicle type.");
                return;
        }
    }
}