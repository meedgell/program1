/* Media.java
 * @author Solomon Tsehay
 * @since 11/1/20
 */

package mediali;
 
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
public class Media
{
  //Changed type from String to Artist
 public Artist majorArtist; //change type to Artist
 public int numOfPlays;
 public String title;
 public int playTime;
 //public int numItems;
 
Scanner sc = new Scanner(System.in);
 public Media()
 {
     
  System.out.println("Who is the major Artist?");   
  majorArtist = new Artist(); //call artist's new constructor 
  numOfPlays = 0;
  System.out.println("Enter the title: "); //needs to prompt for title and playtime
  title = sc.nextLine();
  System.out.println("Enter the playtime in minutes: ");
  playTime = Integer.valueOf(sc.next()); //parse as int
 }

 public Media(String aTitle, Artist aMajorArtist, int aNumOfPlays, int aPlayTime)
 {
  majorArtist = aMajorArtist;
  numOfPlays = aNumOfPlays;
  title = aTitle;
  playTime = aPlayTime;
 }

 public Artist getMajorArtist() { //need to change return type needs to be Artist
   return majorArtist;
 }
 public void setMajorArtist(Artist aMajorArtist) //need param type to be Artist
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
String result = "404 Error";
// "Title: " + title + 
// "\nArtist: " + majorArtist.toString() +
// "\nTime: " + playTime + 
// "\nNumber of plays: " + numOfPlays;
 return result;
}

// equals
public boolean equals(Object o)
    {   boolean eq;
      if (o instanceof Media)
      {
        Media other = (Media) o;
        eq = super.equals(other) &&
          other.numOfPlays == numOfPlays && other.playTime == playTime //&& other.numItems == numItems
          && other.majorArtist.equals(majorArtist)
          && other.title.equals(title);
 }
        else eq = false;
 return eq;
}

public Artist[] multiArtistPrompt(String memT) {
	 boolean go=true;
	 Artist[] art = new Artist[1];
	 String u; //user input
	    int i=0;
	    while (go)
	    {
	        System.out.println("A to add " + memT + " or X when complete:");
	        u=sc.next();

	        if (u.equalsIgnoreCase("A"))
	        {
	             art[i] = new Artist(); 
	             art=Arrays.copyOf(art, art.length+1);
	             //System.out.println("\n" + art[i] + "\n");
	            i++;
	        }else
	        {
	        go=false;
	        }
	    }
	    
	    art=Arrays.copyOf(art, art.length-1);   
	    
	    //System.out.println("\n" + "art length " + art[0].toString());
	    
	    return art;
}

public String artyMethod(Artist[] artists) { //arty Takes artist array, calls artist to string, concatenates
String arty;
arty="";
for  (int i =0; i<artists.length;i++)
	  
 
{arty=arty+ artists[i].toString();}

return arty;
		
}
}
