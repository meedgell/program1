package mediali;

import java.util.Arrays;
import java.util.Scanner;

//CD.java
//Media application project

public class CD extends Audio {
  
  //data members
  private String[] songTitles=new String[1];
  private int numTitles;
  private int playTime;
  private boolean go;
  private Integer i;
  private String c;
  
  //constructors
  public CD(Artist artist, int numOfPlays, String title, int playTime, Artist[] gMem, int nMem, 
               Artist prod, String[] st, int nt, int pt, String sTitle[], int nTitle, int pTime) 
  {
  super(artist, numOfPlays, title, playTime, gMem, nMem, prod);
     songTitles = st;
     numTitles = nTitle;
     playTime = pTime;
  }
  
  public CD() //null constructor
  {
    super();
    Scanner sc = new Scanner(System.in);
   // System.out.println("Please enter the numer of song titles");
    //numTitles = sc.nextInt();
   //System.out.println("Please enter the song title you wish to play");
    //for(int i = 0; i < numTitles; i++) {  //continue asking for titles until number of titles is reached
    //songTitles[i] = sc.nextLine();
    //}
    
    go=true;
    i=0;
    while (go)
    {
        System.out.println("A to add track Info or X when complete:");
        c=sc.next();

        if (c.equalsIgnoreCase("A"))
        {
            
            System.out.println("track title:");
            songTitles[i] = sc.nextLine(); 
            songTitles=Arrays.copyOf(songTitles, songTitles.length+1);
            i++;
          
            
        }else
        {
        go=false;
        }
    } 
    
    numTitles=i;
    
    System.out.println("Please enter the album's playtime in number of seconds");
    playTime = sc.nextInt();
    
  }
    
  //accessors
    //public Artist getArtist(){return artist;} 
    public int getnumOfPlays(){return numOfPlays;} 
    public double getplayTime(){return playTime;} 
    public String getTitle(){return title;} 
    
    //toString method
    public String toString(){ 
      return super.toString() + "\nSong Title: " + songTitles +
     "\nPlay Time: " + playTime + "\nNumber of Titles:" + numTitles;
  }
    
    //playMedia method
    public void playMedia(){
      super.playMedia();
        System.out.println("/nNow playing on CD:" + 
       "\nSong Title: " + songTitles +
     "\nPlay Time: " + playTime); 
      
    }
    
    //print methods
    public void printSongTitles()
    {
      System.out.println(songTitles.toString());
    }
    
    public void printNumTitles(int numTitles)
    {
      numTitles=0; 
      for(int i = 0; i < songTitles.length; i++) { //iterate through songTitles array 
      numTitles++;  //keeps count of song titles
      }
      System.out.println(numTitles);
    }
    
    public void printPlayTime()
    {
      System.out.println(playTime);
    }
}