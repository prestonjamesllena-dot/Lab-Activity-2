package App;
import vehicles.Vehicle;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Truck;
import contracts.Serviceable;
import devices.Printer;

public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        // One object of each class (fixed values, no Scanner)
        Car car = new Car("Tesla", "Roadster", 2026, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Nmax v3", 2026, "155cc");
        Truck truck = new Truck("Isuzu", "Giga", 2025, 6);
        Printer printer = new Printer();

        // Serviceable[] array: one loop calling performService()
        System.out.println("=== Serviceable Array ===");
        Serviceable[] serviceItems = { car, motorcycle, truck, printer };
        for (Serviceable item : serviceItems) {
            performService(item);
        }

        // Vehicle[] array: another loop for displayInfo() and the move methods
        System.out.println("\n=== Vehicle Array ===");
        Vehicle[] vehicles = { car, motorcycle, truck };
        for (Vehicle v : vehicles) {
            v.displayInfo();
            v.moveForward();
            v.moveBackwards();
            v.moveLeft();
            v.moveRight();
            System.out.println();
        }
    }
}