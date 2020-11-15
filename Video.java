/* Video.java
 * Application Project 1 - Video Component
 * Author: Edward France
 * Date: 11/4/2020
 * Inherits from Media.
 */
package mediali;

import java.util.Arrays;
import java.util.Scanner;

public class Video extends Media
{
  protected Artist[] supportingArtists=new Artist[1];
  protected int numActors;
  protected Artist director;
  protected int rating;
  private boolean go;
  private Integer i;
  private String c;
  
  
  
  //Constructors
  public Video()
          
    //Null Constructor
  {
    super();
    
   Scanner sc = new Scanner(System.in);
   
    supportingArtists = multiArtistPrompt("supporting artist");    

    numActors = supportingArtists.length;
    System.out.println("Who is the Director?:");
    director = new Artist();
    
    //System.out.println();
            
    System.out.println("What is the rating?:");
    rating = sc.nextInt();
    
  }
  
  
  /*public Video (String title, Artist majorArtist, int playTime, int numPlays, Artist[] sa, int na, Artist dir, int rate)
  {
    super (); //rearranged params to match Media's constructor params
    
    supportingArtists = sa;
    numActors = na;
    director = dir;
    rating = rate;
  }*/
  
  
  
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
  
  public int getRating()
  {
    return rating;
  }
  
  //ToString
  public String toString()
  {

      
    return "404 Error:VideoTostring";
            
            /*super.toString()+"\nSupporting Artists: " + Arty + 
      "\nNumber of Actors: " + numActors + 
      "\nDirector: " + director.toString() + 
      "\nRating: " + rating;*/
   
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
