import java.time.Year;

    public class Vehicle { 
     
        private String brand; 
        private String model; 
        private int year; 
        
    public Vehicle(String brand, String model, int year) { 
        
        this.brand = brand; 
        this.model = model; 
        this.year = year; 
    }

    public void displayInfo() { 
        System.out.println(brand + " " + model + " " + year);
    } 
        public int calculateAge() { 
            
            int currentYear = Year.now().getValue(); 
            return currentYear - year; 
        } 
        
            public boolean isVintage() { 
                return calculateAge() > 25; 
            } 
    }
