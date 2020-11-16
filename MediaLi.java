//MediaLi.Java
//Martina Edgell
//11/16/2020

package mediali;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vforrester
 */
public class MediaLi {

  static Media[] mediaLib = new Media [1];
  static Artist[] myArtists = new Artist [1];
  static int mediaCount = 0;
  static int artCount = 0;
  static int input = 0;
  static Scanner sc = new Scanner(System.in);
     
     
    public static void main(String[] args) {
        
        boolean go;
        go=true;
        
        while (go)
        {
        System.out.println("Create CD: " + "\t"+ "\t" + "1" + "\n" + 
                       "Create DVD: " + "\t" +"\t" + "2" + "\n" + 
                       "List all Media: " + "\t" + "3" + "\n" + 
                       "Find title: " + "\t"+ "\t" + "4" + "\n" +
                       "List major Artist: " + "\t" + "5" + "\n" +
                       "Play title: "+ "\t" + "\t" + "6" + "\n" + 
                       "Display Number of Plays: " + "\t" + "7" + "\n" + 
                       "Exit: "+ "\t" + "\t" + "8" + "\n" + 
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
      case 8:
          
          go=false;
        
    }
    }
    }

  /*
   * Creates a new CD and adds it to the mediaLib array.
   */
    
    
  public static void addCD() {
      
   
      
    mediaLib=Arrays.copyOf(mediaLib, mediaLib.length+1);
    mediaLib[mediaCount] = new CD(); //pass artist array and have CD class search artist array before adding -> use Vince's method in CD instead of MediaLib
    
    if (checkArtist(mediaLib[mediaCount].majorArtist))
            {
                addArtist(mediaLib[mediaCount].majorArtist);
            }
    
    
    Artist[] tArtists = ((Audio)mediaLib[mediaCount]).getGroupMembers();
    
    for (int i=0;i<((Audio)mediaLib[mediaCount]).getGroupMembers().length;i++)
  
    {
        
        
    if (checkArtist(tArtists[i]))
            {
                addArtist(tArtists[i]);
            }    
    
    }
   
  }
  
  /*
   * Creates a new DVD and adds it to the mediaLib array.
   */
  public static void addDVD() {
    mediaLib=Arrays.copyOf(mediaLib, mediaLib.length+1);
    mediaLib[mediaCount] = new DVD(); //pass artist array and have CD class search artist array before adding -> use Vince's method in CD instead of MediaLib
    
    if (checkArtist(mediaLib[mediaCount].majorArtist))
            {
                addArtist(mediaLib[mediaCount].majorArtist);
            }
    
    
    Artist[] tArtists = ((Video)mediaLib[mediaCount]).getSupportingArtists();
    
    for (int i=0;i<((Video)mediaLib[mediaCount]).getSupportingArtists().length;i++)
  
    {
        
        
    if (checkArtist(tArtists[i]))
            {
                addArtist(tArtists[i]);
            }    
    
    }
  }
  
  /*
   * Prints out the media's fields based on the title, given by the user. 
   * Uses searchLib method.
   * Uses Media's toString().
   */
  public static void findTitle() {
    System.out.println("Enter title: ");
    String title = sc.next();
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
  public static void listMedia() {
    for(int i = 0; i < mediaLib.length-1; i++) {
      System.out.println(mediaLib[i].toString() + "\n");
    }
  }
  
  /*
   * Prints the major artist's info based on the title(given by user input) associated with them.
   * Uses Artist's toString(). //enter the title and print out major artist
   */
  public static void getArtistFromTitle() {
    System.out.println("Enter the title: ");
    String title = sc.next();
    for(int i = 0; i < mediaLib.length-1; i++) {
        if(mediaLib[i].getTitle().equals(title)){ 
        System.out.println("The artist of the title " + title + " is " + mediaLib[i].getMajorArtist() + "\n");
      }
    }
  }
  
  /*
   * Plays media of a certain title, given by the user. 
   * Uses the searchLib method.
   */
  public static void playMedia() {
    
    String title;
    System.out.println ("Enter the title: ");
    title = sc.next();
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
  public static void getPlays() {
    String title;
    System.out.println("Enter the title: " );
    title = sc.next();
    int index = searchLib(title);
    if(index == -1) {
      System.out.println("Title not found.");
    }
    else {
    System.out.println("Number of plays for " + title + " is " + mediaLib[index].getNumOfPlays());
    }
  }
  
  /*
   * Takes in a title, searches the mediaLib array and returns the index of that title
   * @params String title
   * @return int index
   */
  public static int searchLib(String title) {
    int index = 0;
    for(int i = 0; i<mediaLib.length-1; i++) {
      if(title.equals(mediaLib[i].getTitle())) {
        index = i;
      }
      else{
        index = -1; //title not found
      }
    }
    return index;
  }
    

  
  
public static boolean checkArtist(Artist a1)
  {
    boolean unique;
    int i;
    unique = true;
    i = 0;
    
    while (unique && i < myArtists.length-1 && 1<myArtists.length)
       {
          System.out.println(i); 
           System.out.println(myArtists[i].toString()); 
         unique=!a1.aEquals(myArtists[i]);
         i++;
       }
    
    return unique;
      
  }    

    public static void addArtist(Artist a)
{//System.out.println(myArtists.length);
    myArtists[myArtists.length-1]=a;
    myArtists=Arrays.copyOf(myArtists, myArtists.length+1);  
}
    
    
}
