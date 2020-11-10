/* Video.java
 * Application Project 1 - Video Component
 * Author: Edward France
 * Date: 11/4/2020
 * Inherits from Media.
 */

public class Video extends Media
{
  private Artist[] supportingArtists;
  private int numActors;
  private Artist director;
  private String rating;
  
  //Constructors
  
  public Video (String title, Artist majorArtist, int playTime, int numPlays, Artist[] sa, int na, Artist dir, String rate)
  {
    super (majorArtist, numPlays, title, playTime); //rearranged params to match Media's constructor params
    supportingArtists = sa;
    numActors = na;
    director = dir;
    rating = rate;
  }
  
  public Video()
    //Null Constructor
  {
    super();
    //supportingArtists = new Artist[];
    //numActors = 0;
    //director = new Artist();
    //rating = " ";
  }
  
  //Accessors
  public Artist[] getSupportingArtists()
  {
    return supportingArtists;
  }
  
  public int getNumActors()
  {
    return numActors;
  }
  
  public Artist getDirector()
  {
    return director;
  }
  
  public String getRating()
  {
    return rating;
  }
  
  //ToString
  public String toString()
  {
    return super.toString() + "\nSupporting Artists: " + supportingArtists.toString() + 
      "\nNumber of Actors: " + numActors + 
      "\nDirector: " + director.toString() + 
      "\nRating: " + rating;
  }
  
  //Print Methods
  
  public void printSupportingArtists()
  {
    System.out.print(supportingArtists.toString());
  }
  
  public void printNumActors() //add parens for all methods
  {
    System.out.print(numActors);
  }
  
  public void printDirector()
  {
    System.out.print(director.toString());
  }
  
  public void printRating()
  {
    System.out.print(rating);
  }
  
  //PlayMedia
  public void playMedia()
  {
    super.playMedia();
    System.out.println("Featuring: " + supportingArtists.toString());
    System.out.println("Directed by: " + director.toString());
    System.out.println("MPA rating: " + rating);
  }
}
