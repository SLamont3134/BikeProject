package bikeproject;

public interface RoadParts {

  //Create a RoadParts interface that has a constant named terrain that will store the
  // String value “track_racing”.
  public final String TERRAIN = "track_racing";

  //The interface will define two methods that accept a String argument name newValue and two that
  // will return the current value of an instance field.  The methods are to be named:
  // getTyreWidth, setTyreWidth, getPostHeight, setPostHeight.

  public int getTyreWidth();

  public void setTyreWidth(int newValue);

  public int getPostHeight();

  public void setPostHeight(int newValue);
}
