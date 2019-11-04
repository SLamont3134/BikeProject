package bikeproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//Create a new driver class named BikeList that contains a main method.
public class BikeList {

  public static void main(String[] arg) {
    //You will be required to store both Mountain and Road bikes so create an
    // ArrayList named bikes that is based on the Superclass.
    ArrayList<Bike> bikes = new ArrayList<Bike>();

    //Add two integer local variables named mountainBikeSales and roadBikeSales that
    // are both initialized to zero.
    int mountainBikeSales = 0;
    int roadBikeSales = 0;

    //Call the fillArray method from main under the local variable declarations.
    fillArray(bikes);

    //Call the displayStock() method from main under the fillArray() method call.
    displayStock(bikes);

    //Call the displayBikeNumbers() method as the last method call in main.
    displayBikeNumbers(bikes);


  }

  //Create a fillArray method that takes the bikes ArrayList as a parameter.
  // The method should generate a random number between 0 and 1.
  // If the random number is less than one then add a mountain bike to the list otherwise
  // add a roadbike.  The method should add 10 bikes to the ArrayList.

  public static void fillArray(ArrayList<Bike> bikes) {
    Random rand = new Random();
    for (int i = 0; i < 10; i++) {
      int randInt = rand.nextInt(2);
      if (randInt < 1) {
        bikes.add(new MountainBike());
      } else {
        bikes.add(new RoadBike());
      }
    }

  }

  //Create a displayStock method that takes the bikes ArrayList as a parameter.
  // Use an enhanced for to display the bikes to the console.
  public static void displayStock(ArrayList<Bike> bikes) {
    for (Bike bike : bikes) {
      System.out.println(bike.toString());
    }
  }

  //Create a method named calculateStock that takes the bikes ArrayList as a parameter and
  // returns an int value.  Declare a local int variable named bikesSold that is initialized to
  // zero and will hold the number of mountain bikes in stock.  Use an enhanced for loop to go
  // through the bikes list.  Use an if statement to check if each bike in the array is an instance
  // of a mountain bike, increment the bikesSold variable if the if statement returns true.
  // Return the value held in bikesSold.

  public static int calculateStock(ArrayList<Bike> bikes) {
    int bikesSold = 0;
    for (Bike bike : bikes) {
      if (bike instanceof MountainBike) {
        bikesSold++;
      }
    }
    return bikesSold;
  }

  //Create a method named displayBikeNumbers that takes the bikes ArrayList as a parameter and
  // returns an int value.  Declare two local int variables named mb(mountain bikes) and rb
  // (road bikes).  Get the value for the mb variable by calling the calculateStock() method.
  // Get the value of rb by subtracting the number of mountain bikes from the number of bikes
  // in the ArrayList.  Your ouptput should look like the following:
  //Stock Levels
  // We have 4 Mountain Bikes in stock
  // We have 6 Road Bikes in stock

  public static int displayBikeNumbers(ArrayList<Bike> bikes) {
    int mb;
    int rb;
    mb = calculateStock(bikes);
    rb = bikes.size() - mb;
    System.out.println("\nStock Levels");
    System.out.println("\nWe have " + mb + " Mountain Bikes in stock");
    System.out.println("\nWe have " + rb + " Road Bikes in stock");
    return rb;
  }

}
