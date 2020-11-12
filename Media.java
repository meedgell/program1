// Media.java

package medialib;

import java.util.Scanner;
import java.util.Collection;
public class Media
{
  //Changed type from String to Artist
 public Artist artist; //changed these to public so thay are visible by other classes
 public int numOfPlays;
 public String title;
 public int playTime;
 public int numItems;
 
Scanner sc = new Scanner(System.in);
 public Media()
 {
     System.out.println("Title of work:");
  //artist = new Artist();
  numOfPlays = 0;
  title = sc.nextLine();
  //playTime =0;
 }

 public Media(Artist aArtist, int aNumOfPlays, String aTitle, int aPlayTime)
 {
   //changed from String aArtist -> Artist aArtist in params
  artist = aArtist;
  numOfPlays = aNumOfPlays;
  title = aTitle;
  playTime = aPlayTime;
 }


 public Artist getArtist() //Changed return type from String to Artist
 {
   return artist;
 }
 public void setArtist(Artist aArtist) //Changed param type from String to Artist
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

//needs an equals
//equals for title for getNumOfPlays
}