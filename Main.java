public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Toyota", "Corolla", 2020);
        
        Vehicle v2 = new Vehicle("Honda", "Civic", 1995);

        Vehicle v3 = new Vehicle("Ford", "Mustang", 2010);

        displayVehicle(v1);
        displayVehicle(v2);
        displayVehicle(v3);
    }
        public static void displayVehicle(Vehicle vehicle){
        vehicle.displayInfo(); 
        System.out.println("Age: " + vehicle.calculateAge());
        System.out.println("Vintage: " + vehicle.isVintage()); 
        System.out.println();
    }
}
