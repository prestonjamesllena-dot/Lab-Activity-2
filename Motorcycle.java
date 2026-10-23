public class Motorcycle extends Vehicle {

    private String Engine;

    public Motorcycle(String brand, String model, int year, String Engine) {
        super(brand, model, year);
        this.Engine = Engine;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + Engine);
    }
}