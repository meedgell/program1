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
  Scanner sc = new Scanner(System.in);
  
  public void main(String[] args) {
    
    System.out.println("Create CD: " + "\t" + "1" + "\n" + 
                       "Create DVD: " + "\t" + "2" + "\n" + 
                       "List all Media: " + "\t" + "3" + "\n" + 
                       "Find title: " + "\t" + "4" + "\n" +
                       "List major Artist: " + "\t" + "5" + "\n" +
                       "Play title: " + "\t" + "6" + "\n" + 
                       "Display Number of Plays: " + "\t" + "7" + "\n" + 
                       "Exit: " + "\t" + "8" + "\n" + 
                       "Enter Choice(1-8): " + "\n");
    
    input = sc.nextInt();
    
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
        findTitle();  
        break;
      case 5:
        getArtistFromTitle(); 
        break;
      case 6:
        playMedia();
        break;
      case 7:
        getPlays(); 
        break;
    }                
   }

  /*
   * Creates a new CD and adds it to the mediaLib array.
   */
  public void addCD() {    
    mediaLib[mediaCount] = new CD(myArtists); //pass artist array and have CD class search artist array before adding -> use Vince's method in CD instead of MediaLib
    mediaCount++;
    //addArtist();
  }
  
  /*
   * Creates a new DVD and adds it to the mediaLib array.
   */
  public void addDVD() {
    mediaLib[mediaCount] = new DVD(myArtists); //same thing for DVD 
    mediaCount++;
    //addArtist();
  }
  
  /*
   * Prints out the media's fields based on the title, given by the user. 
   * Uses searchLib method.
   * Uses Media's toString().
   */
  public void findTitle() {
    System.out.println("Enter title: ");
    String title = sc.nextLine();
    int index = searchLib(title);
    if(index == -1) {
      System.out.println("Title not found.");
    }
    else{
    System.out.println(mediaLib[index].toString()); 
    }
  }
  
  /*
   * Lists all the media, including all of its fields, in the mediaLib array.
   * Uses Media's toString().
   */
  public void listMedia() {
    for(int i = 0; i < mediaLib.length; i++) {
      System.out.println(mediaLib[i].toString() + "\n");
    }
  }
  
  /*
   * Prints the major artist's info based on the title(given by user input) associated with them.
   * Uses Artist's toString(). //enter the title and print out major artist
   */
  public void getArtistFromTitle() {
    System.out.println("Enter the title: ");
    String title = sc.next();
    for(int i = 0; i < mediaLib.length; i++) {
        if(mediaLib[i].getTitle().equals(title)){ 
        System.out.println("The artist of the title " + title + " is " + mediaLib[i].getMajorArtist() + "\n");
      }
    }
  }
  
  /*
   * Plays media of a certain title, given by the user. 
   * Uses the searchLib method.
   */
  public void playMedia() {
    
    String title;
    System.out.println ("Enter the title: ");
    title = sc.nextLine();
    int index = searchLib(title);
    if(index == -1) {
      System.out.println("Title not found.");
    }
    
    else {
     mediaLib[index].playMedia();
    } 
  }
  
  /*
   * Prints out the number of plays for a certain title, given by the user. 
   * Uses the searchLib method.
   */
  public void getPlays() {
    String title;
    System.out.println("Enter the title: " );
    title = sc.next();
    int index = searchLib(title);
    if(index == -1) {
      System.out.println("Title not found.");
    }
    else {
    System.out.println("Number of plays for title " + title + " is " + mediaLib[index].getNumOfPlays());
    }
  }
  
  /*
   * Takes in a title, searches the mediaLib array and returns the index of that title
   * @params String title
   * @return int index
   */
  public int searchLib(String title) {
    int index = 0;
    for(int i = 0; i<mediaLib.length; i++) {
      if(title == mediaLib[i].getTitle()) {
        index = i;
      }
      else{
        index = -1; //title not found
      }
    }
    return index;
  }
}
