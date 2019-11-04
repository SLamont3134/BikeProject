package bikeproject;

public interface MountainParts {

  //Create an interface named MountainParts that has a constant named TERRAIN that will
  // store the String value “off_road”.
  public final BikeUses TERRAIN = BikeUses.off_road;

  //The interface will define two methods that accept a String argument name newValue and
  // two that will return the current value of an instance field.  The methods are to be named:
  // getSuspension, setSuspension,  getType , setType.

  public String getSuspension();

  public void setSuspension(String newValue);

  public String getType();

  public void setType(String newValue);

}
