public class Main {

    // DEMO 2: One method accepts different Vehicle subclasses
    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        Car car = new Car("Tesla", "Roadster", 2026, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Nmax v3", 2026, "155cc");
        Truck truck = new Truck("Isuzu", "Giga", 2025, 6);
        Printer printer = new Printer();

        System.out.println("=== Serviceable Array ===");
        Serviceable[] serviceItems = { car, motorcycle, truck, printer };
        for (Serviceable item : serviceItems) {
            performService(item);
        }
        
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
