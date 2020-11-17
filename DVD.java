/*DVD.java
 * Application Project 1 - DVD Component
 * Author: Edward France
 * Date: 11/16/2020
 * Inherits from Video
 */
//package mediali;

import java.util.Scanner;

public class DVD extends Video
{
  private boolean wideScreenFormat;
  private boolean tvFormat;
  private String soundOptions; //Changed type to capital S String
  private String b;
   
  Scanner sc = new Scanner(System.in);
  //Constructor
 
  
  //Null Constructor
  public DVD()
  {
    super();
    
    System.out.println("Is the DVD in Widescreen format?(Y/N):");
    b=sc.next();
    //System.out.println("you said:"+b);
    wideScreenFormat = YNTF(b.substring(0,1));
    
    System.out.println("Is the DVD in TV format?(Y/N):");
    b=sc.next();
    //System.out.println("you said:"+b);
    
    tvFormat = YNTF(b.substring(0,1));
    
    System.out.println("What are the DVD's sound options?");
    soundOptions = sc.next();
    
    System.out.println("Sound options: " + soundOptions);
    
  }
  
  public static boolean YNTF(String in)
  {
      boolean TF;
      
      TF=false;
      
      if (in.equalsIgnoreCase("Y"))
      {TF=true;}
   
      return TF;
  }
  
  //Accessors
  
  public boolean getWideScreenFormat()
  {
    return wideScreenFormat;
  }
  
  public boolean getTVFormat()
  {
    return tvFormat;
  }
  
  public String getSoundOptions() //capital S for return type String
  {
    return soundOptions;
  }
  
  //ToString
  public String toString()
  {
   return "DVD Title: " + title + "\nMajor Artist: " + majorArtist 
                  + "\nDirector: " + director + "\nSupporting Actors("+numActors+"): " + "\n" + artyMethod(supportingArtists)
                  + "\nRating: " + rating+ "\nPlaytime: " + playTime+ "\nSoundO Options: " + soundOptions+ "\nWide Screen: " 
                  + wideScreenFormat + "\nTV format: " + tvFormat+ "\nNumber of Plays: " + numOfPlays;
  }
  
  //PlayMedia
  public void playMedia()
  {
    super.playMedia();
    if(wideScreenFormat)
      System.out.println("in widescreen format. ");
    else if(tvFormat)
      System.out.println("in tv screen format. ");
    System.out.println("Sound options: " + soundOptions);
  }
  
  //Print Methods
  public void printTVFormat()
  {
    System.out.println(tvFormat);
    //removed the toString call because it is a boolean
  }
  
  public void printWidescreenFormat()
  {
    System.out.println(wideScreenFormat);
    //removed toString call
  }
  
  public void printSoundOptions()
  {
    System.out.println(soundOptions);
  }
}
