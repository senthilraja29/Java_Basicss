package Day_two;

public class C_lass {

    /*
     * 	in class means type of the content
    	example 
    	- student is the class and student bio details are thier entities
    	- employee is the class and employee details are thier entities
    	- bike is the class and bike properties are the entities 
    */
    
    // Properties of the bike class
    String owner;
    String nameOfBike;
    int petrolCapacity;
    int mileage;
    int power;
    
    // Constructor to initialize the bike properties
    
    public C_lass(String owner, String nameOfBike, int petrolCapacity, int mileage, int power) {
        this.owner = owner;
        this.nameOfBike = nameOfBike;
        this.petrolCapacity = petrolCapacity;
        this.mileage = mileage;
        this.power = power;    
    }
    
    // Getters and setters for the bike properties
    public String getOwner() {
        return owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public String getNameOfBike() {
        return nameOfBike;
    }
    
    public void setNameOfBike(String nameOfBike) {
        this.nameOfBike = nameOfBike;
    }
    
    public int getPetrolCapacity() {
        return petrolCapacity;
    }
    
    public void setPetrolCapacity(int petrolCapacity) {
        this.petrolCapacity = petrolCapacity;
    }
    
    public int getMileage() {
        return mileage;
    }
    
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    
    public int getPower() {
        return power;
    }
    
    public void setPower(int power) {
        this.power = power;
    }
    
    // Main method to test the class
    public static void main(String[] args) {
        // Create an instance of the bike class
        C_lass bike01 = new C_lass("Senthil", "Rolls Roy", 25, 10, 900); 
        C_lass bike02 = new C_lass("Raja", "BMW", 35, 13, 1200);
        // Print the details of the bike
        System.out.println(bike01.toString());
        System.out.println(bike02.toString());
    }
    
    // Method to print the details of the bike
    
    @Override
    public String toString() {
        return "Bike Details: [Owner: " + owner + ", Name: " + nameOfBike + ", Petrol Capacity: " + petrolCapacity + ", Mileage: " + mileage + ", Power: " + power + "]";
    }
}
