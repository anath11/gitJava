/**
 * Part1 - Classes and Objects 
 */
/**
 *
 * @author: Ashok Nath
 * @date: 30/07/2019
 * @studentID: 22645069
 */
public class Vehicle {
    private String make;
    private String model;
    private String colour;
    private String fuelType;
    
    /**
     * declaring a default constructor 
     */
    public Vehicle()
    {
        
    }
    
    /**
     * 
     * @param make
     * @param model
     * @param colour
     * @param fuelType 
     */
    public Vehicle(String make, String model, String colour, String fuelType) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.fuelType = fuelType;
    }
    
    /**
     * Getter method for instance variables 
     * @return 
     */
    public String getMake ()
    {
        return make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public String getColour()
    {
        return colour;
    }
    
    public String geetFuelType()
    {
        return fuelType;
    }
    
    /**
     * Setter method for above instance variable 
     * @param make 
     */
    public void setMake(String make) {
        this.make = make;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    /**
     * Printing details of a vehicle
     */
    public void printDetails() {
        System.out.println("The vehicle details are: ");
        System.out.println("Make:" + make);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Fuel Type: " + fuelType);
    }
}
