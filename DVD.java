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
  private string soundOptions;
  
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
    char ws = ' ', tv = ' ';
    super();
    System.out.println("Is the DVD formatted to widescreen? Y/N ");
    ws = sc.next().charAt(0);
    ws = Character.toUpperCase(ws);
    if(ws == 'Y')
      wideScreenFormat = true;
    else
      wideScreenFormat = false;
    System.out.println("Is the DVD formatted for TV screens? Y/N ");
    tv = sc.next().chatAt(0);
    tv = Character.toUpperCase(tv);
    if(tv == 'Y')
      tvFormat = true;
    else
      tvFormat = false;
    System.out.println("Enter the selected sound options: ");
    soundOptions = sc.next();
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
  
  public string getSoundOptions()
  {
    return soundOptions;
  }
  
  //ToString
  public String toString()
  {
    return super.toString() + "\nWidescreen Format: " + toString(wideScreenFormat) + "\nTV Format: " + toString(tvFormat) + "\nSound Options: " + soundOptions;
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
    System.out.println(tvFormat.toString());
  }
  
  public void printWidescreenFormat()
  {
    System.out.println(wideScreenFormat.toString());
  }
  
  public void printSoundOptions()
  {
    System.out.println(soundOptions);
  }
}