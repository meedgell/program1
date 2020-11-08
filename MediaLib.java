/**
 * @(#)MediaLib.java
 * @author Martina Edgell
 * @version 11/1/2020
 * @Uses Audio/CD, Video/DVD, Artist and Media classes 
 */
 
import java.util.Scanner;

public class MediaLib {
  
  Media [] mediaLib = new Media [100];
  Artist [] myArtists = new Artist [50];
  int mediaCount = 0;
  int artCount = 0;
  int input = 0;
  Scanner sc = new Scanner(System.int);
  
  public void main(String[] args) {
    
    System.out.println("Create CD: " + "\t" + "1" + "\n" + 
                       "Create DVD: " + "\t" + "2" + "\n" + 
                       "List all Media: " + "\t" + "3" + "\n" + 
                       "Find title: " + "\t" + "4" + "\n" +
                       "List major Artist: " + "\t" + "5" + "\n" +
                       "Play title: " + "\t" + "6" + "\n" + 
                       "Display Number of Plays: " + "\t" + "7" + "\n" + 
                       "Exit: " + "\t" + "8" + "\n" + 
                       "Enter Choice: ");
    input = sc.netInt();
    
    switch(input) {
      case 1:
        addCD();
        break;
      case 2:
        addDVD();
        break;
      case 3:
        listMedia();
        break;
      case 4: 
        findTitle(); //add method
      case 5:
        listArtists(); 
        break;
      case 6:
        playMedia();
        break;
      case 7:
        getNumOfPlays(); 
        break;
      case 8: 
        //exit
        break;
    }                
   }

  public void addCD() {
    System.out.println("Enter the title of the song.");
    String title = sc.nextLine();
    System.out.println("Enter the artist's first name.");
    String first = sc.next();
    System.out.println("Enter the artist's last name.");
    String last = sc.next();
    
    //addArtist();
      
    mediaLib[mediaCount] = new CD();
    mediaCount++;
  }
  
  public void addDVD() {
    myArtists[mediaCount] = new DVD();
    mediaCOunt++;
  }
  
  public void addArtist(Artist artist) {
    boolean artistIn = false;
    for(int i=0; i < myArtists.length; i++) {
      if(myArtists[i] == artist) {
        artistIn = true;
      }
      else {
        artistIn = false;
      }
    }
    
    if(artistIn==false) {
      myArtists[artCount] = new Artist() //add artist params
      artCount++;
    }
  }
  
  public void listMedia() {
    for(int i = 0; i < mediaLib.length; i++) {
      System.out.println(mediaLib[i].toString() + "\n");
    }
  }
  
  public void listArtists() {
    for(int i = 0; i < myArtists.length; i++`) {
      System.out.println(myArtists[i].toString() + "\n");
    }
  }
  
  public void getArtist(Media media) {
    System.out.println("Artist: " + media.getArtist());
  }
  
  public void play(Media media) {
    media.playMedia();
    
  }
  
  public void getNumOfPlays(Media media) {
    media.getNumOfPlays();
  }
  
}
