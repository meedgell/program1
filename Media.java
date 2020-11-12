/* Media.java
 * @author Solomon Tsehay
 * @since 11/1/20
 */
import java.util.Scanner;
import java.util.Collection;
public class Media
{
  //Changed type from String to Artist
 public String majorArtist;
 public int numOfPlays;
 public String title;
 public int playTime;
 public int numItems;
 
Scanner sc = new Scanner(System.in);
 public Media()
 {
  //artist = "";
  //numOfPlays = 0;
  //title = "";
  //playTime =0;
 }

 public Media(String aMajorArtist, int aNumOfPlays, String aTitle, int aPlayTime)
 {
  majorArtist = aMajorArtist;
  numOfPlays = aNumOfPlays;
  title = aTitle;
  playTime = aPlayTime;
 }

 public String getMajorArtist() 
   return majorArtist;
 }
 public void setMajorArtist(String aMajorArtist) 
 {
  majorArtist = aMajorArtist;
 }

 public int getNumOfPlays()
 {
  return numOfPlays;
 }
public void setNumOfPlays(int aNumOfPlays)
{
 numOfPlays = aNumOfPlays;

}
 public void setPlayTime(int aPlayTime)
 {
  playTime = aPlayTime;
 }

 public String getTitle()
 {
  return title;
 }

 public void setTitle(String aTitle)
 {
  title = aTitle;
 }

public void playMedia()
  { 
    String title, majorArtist, mediaType; 
      
    System.out.print("Enter artist: ");
    majorArtist = sc.nextLine();
    System.out.println ("Enter the title: ");
    title = sc.nextLine();
    System.out.println("Enter the media type: ");
    mediaType = sc.nextLine();
  
  }
  
public String toString() {
String result =
 "Title: " + title + 
 "\nArtist: " + majorArtist +
 "\nTime: " + playTime + 
 "\nNumber of plays: " + numOfPlays;
 return result;
}

// equals
public boolean equals(Object o)
    {   boolean eq;
      if (o instanceof Media)
      {
        Media other = (Media) o;
        eq = super.equals(other) &&
          other.numOfPlays == numOfPlays && other.playTime == playTime && other.numItems == numItems
          && other.majorArtist.equals(majorArtist)
          && other.title.equals(title);
 }
        else eq = false;
 return eq;
}
}