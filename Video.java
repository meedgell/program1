/* Video.java
 * Application Project 1 - Video Component
 * Author: Edward France
 * Date: 11/16/2020
 * Inherits from Media.
 */
//package mediali;

//import java.util.Arrays;
//import java.util.Scanner;
import java.util.*;//"Professor Tanner wont like this" - Martina
        
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
    System.out.println("Enter the details of the director: ");
    director = new Artist();
    
    //System.out.println();
   boolean go;
go=false;

//while (!go)
//{try
//{
    System.out.println("Enter the MPA rating(1-10):");
    rating = sc.nextInt();
 /*   System.out.println(sc.nextInt());
    
    go=true;
}
    catch (NumberFormatException ex)//|InputMismatchException
{
    
    sc.close();
    sc = new Scanner(System.in);
    System.out.println(ex.getMessage());
    System.err.println(ex);
    go=false;
    System.out.println("The values you entered were invalid. Please reenter the MPA rating(1-10):");
    
}
}  
    */
    
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
  
  public int getRating()
  {
    return rating;
  }
  
  //ToString
  public String toString()
  { 
    return "404 Error:VideoTostring";//We liked calling it a 404 error.
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
    System.out.println("Featuring: ");
    
    for (int i=0;i<numActors;i++)
        {System.out.println(supportingArtists[i].toString());}          
               
    System.out.println("Directed by: " + director.toString());
    System.out.println("MPA rating: " + rating);
  }
}
