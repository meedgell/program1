/*DVD.java
 * Application Project 1 - DVD Component
 * @Author: Edward France
 * @Version: 11/5/2020
 * Inherits from Video
 */

public class DVD extends Video
{
  private boolean wideScreenFormat;
  private boolean tvFormat;
  private String soundOptions; 
  private int artCount; //added for artist methods
  
  //Constructor
  public DVD (String title, Artist majorArtist, int playTime, int numPlays, Artist[] sa, int na, Artist dir, String rate, boolean widescreen, boolean tv, String so)
  {
    super(title, majorArtist, playTime, numPlays, sa, na, dir, rate);
    wideScreenFormat = widescreen;
    tvFormat = tv;
    soundOptions = so;
  }
  
  //Null Constructor
  public DVD(Artist[] myArtists, int artCount) 
  {
    super(myArtists, artCount); 
    char ws = ' ', tv = ' ';
    System.out.println("Is the DVD formatted to widescreen? Y/N ");
    ws = sc.next().charAt(0);
    ws = Character.toUpperCase(ws);
    if(ws == 'Y')
      wideScreenFormat = true;
    else
      wideScreenFormat = false;
    System.out.println("Is the DVD formatted for TV screens? Y/N ");
    tv = sc.next().charAt(0); 
    tv = Character.toUpperCase(tv);
    if(tv == 'Y')
      tvFormat = true;
    else
      tvFormat = false;
    System.out.println("Enter the selected sound options: ");
    soundOptions = sc.next();
    
   //need to have user enter in the artists
    //this is where you call addArtist and checkArtist
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
  
  public String getSoundOptions() //capital S String
  {
    return soundOptions;
  }
  
  //ToString
  public String toString()
  {
    return super.toString() + "\nWidescreen Format: " + wideScreenFormat + "\nTV Format: " + tvFormat + "\nSound Options: " + soundOptions; //removed toString on boolean values
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
    System.out.println(tvFormat); //removed toString call bc boolean value
  }
  
  public void printWidescreenFormat()
  {
    System.out.println(wideScreenFormat); //removed toString call bc boolean value
  }
  
  public void printSoundOptions()
  {
    System.out.println(soundOptions);
  }
  
  
  /*
   * Checks if the given artist is already in the myArtists array.
   * @return boolean unique
   */
  //Vince's method 
  public boolean checkArtist(Artist a1, Artist[] myArtists)
  {
    boolean unique; //removed private
    int i;
    unique = true;
    i = 0;
    
    while (unique && i <= myArtists.length) //remove brackets
       {
         unique=!a1.equals(myArtists[i]);
         i++;
       }
    return unique;
  }
   //adding these methods to this class per professor's recommendation
   /*
   * Adds a new artist to the myArtists array.
   * Checks if the artist already exists in the collection before appending.
   * Uses checkArtist method.
   */
  
  public void addArtist(Artist[] myArtists) {
     Artist artist = new Artist();
     boolean unique = checkArtist(artist, myArtists);
     if(unique == true) {
       myArtists[artCount] = artist;
       artCount++;
     }
  }
  
}