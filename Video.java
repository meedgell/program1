/* Video.java
 * Application Project 1 - Video Component
 * @Author: Edward France
 * @Version: 11/11/2020
 * Inherits from Media.
 */

//Unsure if this needs to be imported here or higer up in the hierarchy.
import java.util.Scanner;

public class Video extends Media
{
  static Scanner sc = new Scanner(System.in);
  
  private Artist[] supportingArtists;
  private int numActors;
  private Artist director;
  private String rating;
  
  //Constructors
  
  public Video (String title, Artist majorArtist, int playTime, int numPlays, Artist[] sa, int na, Artist dir, String rate)
  {
    super (title, majorArtist, playTime, numPlays);
    supportingArtists = sa;
    numActors = na;
    director = dir;
    rating = rate;
  }
  
  public Video()
    //Null Constructor
  {
    super();
    supportingArtists = fillSupportingArtists();
    System.out.println("Enter the number of actors: ");
    numActors = sc.nextInt();
    System.out.println("Enter the director: ");
    director = new Artist();
    System.out.println("Enter the MPA rating: ");
    rating = sc.next();
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
  
  public void printNumActors() //add parens
  {
    System.out.print(numActors);
  }
  
  public void printDirector ()
  {
    System.out.print(director.toString());
  }
  
  public void printRating ()
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
  //Other Methods
  public Artist[] fillSupportingArtists()
  {
    int numArray;
    Artist[] supportingArtists = new Artist[50]; //initialize to 50?
    System.out.println("Please enter the number of supporting Artists: ");
    numArray = sc.nextInt();
    for(int i = 0; i < numArray; i++)
    {
      supportingArtists[i] = new Artist();
    }
    return supportingArtists;
}
}