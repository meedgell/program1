/* Media.java
 * @author Solomon Tsehay
 * @since 11/1/20
 */
import java.util.Scanner;
import java.util.Collection;
public class Media
{
  //Changed type from String to Artist
 public Artist majorArtist; //change type to Artist
 public int numOfPlays;
 public String title;
 public int playTime;
 public int numItems;
 
Scanner sc = new Scanner(System.in);
 public Media(Artist[] myArtists, int artCount)
 {
   System.out.println("Artist Entry");

   System.out.print("First Name:");  
   String first=sc.nextLine();

   System.out.print("Last Name:");
   String last=sc.nextLine();
   
   if(checkArtist(first, last, myArtists)) {
     Artist artist = new Artist(first, last); 
     myArtists[artCount] = artist;
     artCount++;
   }
  numOfPlays = 0;
  System.out.println("Enter the title: "); 
  title = sc.nextLine();
  System.out.println("Enter the playtime in seconds: ");
  playTime = Integer.valueOf(sc.next()); //parse as int
  
 }

 public Media(String aTitle, Artist aMajorArtist, int aNumOfPlays, int aPlayTime)
 {
  majorArtist = aMajorArtist;
  numOfPlays = aNumOfPlays;
  title = aTitle;
  playTime = aPlayTime;
 }

 public Artist getMajorArtist() { 
   return majorArtist;
 }
 public void setMajorArtist(Artist aMajorArtist) 
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

     /*
   * Checks if the given artist is already in the myArtists array.
   * @return boolean unique
   */
  public boolean checkArtist(String first, String last, Artist[] myArtists)
  {
    boolean unique; //removed private
    int i;
    unique = true;
    i = 0;
    
    while (unique && i <= myArtists.length) //remove brackets
       {
         unique=!(first.equals(myArtists[i].getFirst()) && last.equals(myArtists[i].getLast()));
         i++;
       }
    return unique;
  }
}