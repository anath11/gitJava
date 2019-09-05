/**
 * Part1 - Classes and Objects 
 */
/**
 * 
 * /**
 *
 * @author: Ashok Nath
 * @date: 30/07/2019
 * @studentID: 22645069
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creating a two vehicle from the default and the other constructor that
        // initialise all the instance variables in vehicle class
        // Vehicle v1 = new Vehicle();
        Vehicle v2;
        v2 = new Vehicle("Toyota", "Camry", "Golden", "Petrol");

        // getter method by printing its variable
        v2.getMake();
        System.out.println("The make of the car is: " + v2.getMake());

        // Setter method to set the model of the vehicle v2
        System.out.println("The initial  model of vehicle is: " + v2.getModel());
        v2.setModel("HiAce ");
        System.out.println("The model of vehicle after setter is: " + v2.getModel());

        // To print the datail of the vehicle
        v2.printDetails();

    }
}
