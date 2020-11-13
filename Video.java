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
  
  public Video(Artist[] myArtists, int artCount)
    //Null Constructor
  {
    super(myArtists, artCount);
    supportingArtists = fillSupportingArtists();
    System.out.println("Enter the number of actors: ");
    numActors = sc.nextInt();
    for(int i = 0; i < numActors; i++) {
      System.out.println("Enter first name of Actor");
      String first = sc.nextLine();
      System.out.println("Enter last name");
      String last = sc.nextLine();
      addArtist(first, last, myArtists, artCount);
    }
    System.out.println("Enter the director: ");
    System.out.println("Director's first name: ");
    String dFirst = sc.nextLine();
    System.out.println("Director's last name");
    String dLast = sc.nextLine();
    if(checkArtist(dFirst, dLast, myArtists)) {
    director = new Artist();
    myArtists[artCount] = director;
    artCount++;
    }
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
     public void addArtist(String first, String last, Artist[] myArtists, int artCount) {
     boolean unique = checkArtist(first, last, myArtists);
     if(unique == true) {
       Artist artist = new Artist();
       myArtists[artCount] = artist;
       artCount++;
     }
   }
         /*
   * Checks if the given artist is already in the myArtists array.
   * @return boolean unique
   */
  public boolean checkArtist(String first, String last, Artist[] myArtists)
  {
    boolean unique; 
    int i;
    unique = true;
    i = 0;
    
    while (unique && i <= myArtists.length) 
       {
         unique=!(first.equals(myArtists[i].getFirst()) && last.equals(myArtists[i].getLast()));
         i++;
       }
    return unique;
  }
}