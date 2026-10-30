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
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + engineType);
    }

    @Override
    public void moveForward() {
        System.out.println("A motorcycle moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A motorcycle moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A motorcycle moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A motorcycle moves right");
    }
}
