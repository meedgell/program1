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
  private Artist[] supportingArtists=new Artist[1];
  private int numActors;
  private Artist director;
  private String rating;
  private boolean go;
  private Integer i;
  private String c;
  
  Scanner sc = new Scanner(System.in);
  
  //Constructors
  public Video()
          
    //Null Constructor
  {
    super();
    go=true;
    i=0;
    while (go)
    {
        System.out.println("A to add Supporting artist or X when complete:");
        c=sc.next();

        if (c.equals("A"))
        {
            supportingArtists[i] = new Artist(); 
            supportingArtists=Arrays.copyOf(supportingArtists, supportingArtists.length+1);
            i++;
        }else
        {
        go=false;
        }
    }  
    
    supportingArtists=Arrays.copyOf(supportingArtists, supportingArtists.length-1);            

    numActors = i;
    System.out.println("Who is the Director?:");
    director = new Artist();
    
    //System.out.println();
            
    System.out.println("What is the rating?:");
    rating = sc.nextLine();
    System.out.println(rating);
    
    
    
    String g = sc.next();
    
    
   System.out.println(rating);
    
  }
  
  
  public Video (String title, Artist majorArtist, int playTime, int numPlays, Artist[] sa, int na, Artist dir, String rate)
  {
    super (); //rearranged params to match Media's constructor params
    
    supportingArtists = sa;
    numActors = na;
    director = dir;
    rating = rate;
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
      String Arty;
      Arty="";
      for  (int i =0; i<supportingArtists.length;i++)
          
      {Arty=Arty+supportingArtists[i].toString();}
      
    return super.toString()  +"\nSupporting Artists: " + Arty + 
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
