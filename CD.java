//CD.java
//Media application project
//Michelle Frankot
//11/16/2020


//package mediali;

import java.util.Arrays;
import java.util.Scanner;



public class CD extends Audio {
  
  //data members
  private String[] songTitles=new String[1];
  private int numTitles;
  //private int playTime;
  private boolean go;
  private Integer i;
  private String c;
  
  //constructors
  
  public CD() //null constructor
  {
    super();
    Scanner sc = new Scanner(System.in);
    
    go=true;
    i=0;
    while (go)
    {
        System.out.println("Enter 'A' to add a song or enter 'X' if you have finished entering songs");
        
        c=sc.next();

        if (c.equalsIgnoreCase("A"))
        {
            
            System.out.println("Enter the song's title(underscore \"_\" for space \" \"):");
            songTitles[i] = sc.next(); //this will only get the first word. We know.
            songTitles=Arrays.copyOf(songTitles, songTitles.length+1);
            i++;
          
            
        }else
        {
        go=false;
        }
    } 
    
    songTitles=Arrays.copyOf(songTitles, songTitles.length-1);
    
    numTitles=i;
    
  }
    
  //accessr
    public int getnumOfPlays(){return numOfPlays;} 
    public double getplayTime(){return playTime;} 
    public String getTitle(){return title;} 
    
    //toString method
    public String toString(){ 
     
        String titles;
        titles="";
        for (int i=0; i<numTitles; i++)
        {titles=titles+"\n"+songTitles[i];}
        
        return "CD Title: " + title + "\nMajor Artist: " + majorArtist 
                  + "\nproducer: " + producer + "\nTracks("+numTitles+"): " + titles +"\n\n\nGroup Members: \n" + artyMethod(groupMembers)
                  + "\nPlaytime: " + playTime +  "\nNumber of Plays: " + numOfPlays;
      
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
