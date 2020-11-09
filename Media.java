// Media.java
import java.util.Scanner;
import java.util.Collection;
public class Media
{
 private String artist;
 private int numOfPlays;
 private String title;
 private int playTime;
  private int numItems;
 
Scanner sc = new Scanner(System.in);
 public Media()
 {
  artist = "";
  numOfPlays = 0;
  title = "";
  playTime =0;
 }

 public Media(String aArtist, int aNumOfPlays, String aTitle, int aPlayTime)
 {
  artist = aArtist;
  numOfPlays = aNumOfPlays;
  title = aTitle;
  playTime = aPlayTime;
 }


 public String getArtist()
 {
   return artist;
 }
 public void setArtist(String aArtist)
 {
  artist = aArtist;
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
      String title, artist, mediaType; 
      
    System.out.print("Enter artist: ");
    artist = sc.nextLine();
    System.out.println ("Enter the title: ");
    title = sc.nextLine();
    System.out.println("Enter the media type: ");
    mediaType = sc.nextLine();
  
  }
  
public String toString() {
String result =
 "Title: " + title + 
 "\nArtist: " + artist +
 "\nTime: " + playTime + 
 "\nNumber of plays: " + numOfPlays;
 return result;
}
}