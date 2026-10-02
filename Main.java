public class Main {

    public static void main(String[] args) {

        Vehicle car = new Vehicle("toyota", "Corolla", 2015);
        Vehicle car = new Vehicle("Ford", "Mustang", 1967);
        Vehicle car = new Vehicle("Honda", "Civic", 2020);

      System.out.println("--- VEHICLE 1 DETAILS ---");
      car1.displayInfo();
      System.out.println("Getters -> Brand: " + car1.getBrand() + ", Model: " + car1.getModel() + ", Year: " + car1.getYear());
      System.out.println();

      System.out.println("--- VEHICLE 2 DETAILS ---");
      car2.displayInfo();
      System.out.println("Getters -> Brand: " + car2.getBrand() + ", Model: " + car2.getModel() + ", Year: " + car2.getYear());
      System.out.println();
      
      System.out.println("--- VEHICLE 3 DETAILS ---");
      car3.displayInfo();
      System.out.println("Getters -> Brand: " + car3.getBrand() + ", Model: " + car3.getModel() + ", Year: " + car3.getYear());
      System.out.println();

      System.out.println("--- TESTING setYear() BEHAVIOR ---");
        
      boolean res1 = car1.setYear(2000);
      System.out.println("setYear(2000) result: " + res1 + "; year is " + car1.getYear() + "; age: " + car1.calculateAge() + "; vintage: " + car1.isVintage());

      boolean res2 = car1.setYear(1885);
      System.out.println("setYear(1885) result: " + res2 + "; year remains " + car1.getYear());

      boolean res3 = car1.setYear(2027);
      System.out.println("setYear(2027) result: " + res3 + "; year remains " + car1.getYear()); 
      System.out.println();

      System.out,prinln("--- TESTING CONSTRUCTOR VALIDATION ---");
      Vehicle invalidCar1 = new Vehicle("Tesla", "Model 3", 1885);
      System.out.println("New vehicle with year 1885 -> Initial year is " + invalidCar1.getYear()); 

      Vehicle invalidCar2 = new Vehicle("BMW", "M 3", 2027);
      System.out.println("New vehicle with year 2027 -> Initial year is " + invalidCar2.getYear());
    }
 }

      



      
