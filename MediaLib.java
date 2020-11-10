/**
 * @(#)MediaLib.java
 * @author Martina Edgell
 * @version 11/1/2020
 * @Uses Audio/CD, Video/DVD, Artist and Media classes 
 */
 

//each class either needs to prompt the user for the data fields 
//OR each person needs to supply the code to get the fields

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
                       "Enter Choice: ");
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
        listArtists(); 
        break;
      case 6:
        playMedia();
        break;
      case 7:
        getNumOfPlays(); 
        break;
    }                
   }

  public void addCD() {
    System.out.println("Enter the title of the CD.");
    String title = sc.nextLine();
    System.out.println("Enter the artist's first name.");
    String first = sc.next();
    System.out.println("Enter the artist's last name.");
    String last = sc.next();
    
    //addArtist(); need method to determine if artist is already in the array 
    //by writing an equals in Artist and then calling the equals (in MediaLib)
      
    mediaLib[mediaCount] = new CD();
    mediaCount++;
  }
  
  public void findTitle() {
    System.out.println("Enter title: ");
    String title = sc.nextLine();
    int index = searchLib(title);
    System.out.println(mediaLib[index].toString()); 
  }
  
  public void addDVD() {
    mediaLib[mediaCount] = new DVD();
    mediaCount++;
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
      String first;
      String last;
      Date dob = new Date();;
      String th;
      String url;
      System.out.println("Enter the artist's first name: ");
      first = sc.next();
      System.out.println("Enter last name: ");
      last = sc.next();
      System.out.println("Enter the date of birth: ");
      dob.getDate();
      System.out.println("Enter the twitter handle: ");
      th = sc.next();
      System.out.println("Enter the artist's url: ");
      url = sc.next();
      myArtists[artCount] = new Artist(first, last, dob, th, url); 
      artCount++;
    }
  }
  
  public void listMedia() {
    for(int i = 0; i < mediaLib.length; i++) {
      System.out.println(mediaLib[i].toString() + "\n");
    }
  }
  
  public void listArtists() {
    for(int i = 0; i < myArtists.length; i++) {
      System.out.println(myArtists[i].toString() + "\n");
    }
  }
  
  public void getArtist(Media media) {
    System.out.println("Artist: " + media.getArtist());
  }
  
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
    
     //mediaLib[index].playMedia
    //search mediaLib for title and when it's found ^
    //write method to search mediaLib
 
    
  }
  
  public void getNumOfPlays() {
    String mediaType;
    String title;
    System.out.println("Enter the media type: " );
    mediaType = sc.nextLine();
    System.out.println("Enter the title: " );
    title = sc.next();
    
    getNumOfPlays();
  }
  
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
