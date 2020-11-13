/*DVD.java
 * Application Project 1 - DVD Component
 * Author: Edward France
 * Date: 11/5/2020
 * Inherits from Video
 */
package mediali;

import java.util.Scanner;

public class DVD extends Video
{
  private boolean wideScreenFormat;
  private boolean tvFormat;
  private String soundOptions; //Changed type to capital S String
  private String b;
   
  Scanner sc = new Scanner(System.in);
  //Constructor
  public DVD (String title, Artist majorArtist, int playTime, int numPlays, Artist[] sa, int na, Artist dir, String rate, boolean widescreen, boolean tv, String so)
  {
    super(title, majorArtist, playTime, numPlays, sa, na, dir, rate);
    wideScreenFormat = widescreen;
    tvFormat = tv;
    soundOptions = so;
  }
  
  //Null Constructor
  public DVD()
  {
    super();
    
    System.out.println("wideScreenFormat?(Y/N):");
    b=sc.next();
    System.out.println("you said:"+b);
    wideScreenFormat = YNTF(b);
    
    System.out.println("tvFormat?(Y/N):");
    b=sc.next();
    System.out.println("you said:"+b);
    
    tvFormat = YNTF(b);
    
    
    
    System.out.println("soundOptions?:");
    soundOptions = sc.nextLine();
    
    
    
    
  }
  
  public static Boolean YNTF(String in)
  {
      Boolean TF;
      
      TF=false;
      
      System.out.println("Y "+in+" "+(in=="Y"));
      
      if (in=="Y")
      {TF=true;}
      //else if (in=="N")
      //{TF=false;}
          
          
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
    return super.toString() + "\nWidescreen Format: " + wideScreenFormat + "\nTV Format: " + tvFormat + "\nSound Options: " + soundOptions;
    //removed toString call on wideScreenFormat and tvFormat because they are booleans (True or False)
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
