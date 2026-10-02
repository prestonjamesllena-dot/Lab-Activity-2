public class Vehicle {

    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;

        if (year >= 1886 && year <= 2026) {
            this.yea = year;
        } else { 
            this.year = 2026;
        }
}   public String getBrand() {
        return brand;
}   
    public String getModel() {
        return model;
}   public String getYear() {
        return year;
}
    public boolean setYear(int year) {
        if (year >= 1886 && year <= 2026) {
            this.year = year;
            return true;
        }
        return false;
    }
    public int calculateAge() {
        return 2026 - this.year;
    }
    public boolean isVintage() {
        return calculateAge() > 25;
    }
    public void displayInfo() {
        System.out.println("Brand :" + brand);
        System.out.println("Model :" + model);
        System.out.println("Year :" + year);
        System.out.println("Age :" + calculateAge());
        System.out.println("Vintage :" + isVIntage());
    }
}