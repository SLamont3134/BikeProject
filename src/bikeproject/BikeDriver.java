package bikeproject;

public class BikeDriver {

  public static void main(String[] args) {

    RoadBike bike1 = new RoadBike();
    RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip",
        "comfort", 14, 25, 18);
    MountainBike bike3 = new MountainBike();

    //bike1.printDescription();
    System.out.println(bike1.toString());

    //bike2.printDescription();
    System.out.println(bike2.toString());

    //bike3.printDescription();
    System.out.println(bike1.toString());

    bike1.setPostHeight(20);
    //bike1.printDescription();
    System.out.println(bike1.toString());

    Bike myBikes[] = {bike1, bike2, bike3};

    //virtual method invocation
    for (Bike myBike : myBikes) {
      System.out.println(myBike.toString());
    }
  }//end method main

}//end class BikeDriver
