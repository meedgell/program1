import java.util.Scanner;

//CD.java
//Media application project

public class CD extends Audio {
  
  //data members
  private String songTitles[];
  private int numTitles;
  private int playTime; 
  private int artCount; //added for artist methods
  
  //constructors
  public CD(Artist artist, int numOfPlays, String title, int playTime, Artist[] gMem, int nMem, 
               Artist prod, String[] st, int nt, int pt, String sTitle[], int nTitle, int pTime) 
  {
  super(artist, numOfPlays, title, playTime, gMem, nMem, prod);
     songTitles = st;
     numTitles = nTitle;
     playTime = pTime;
  }
  
  public CD(Artist[] myArtists) //null constructor -added the artist array per professor Tanner's recommendation
  {
    super();
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the numer of song titles");
    numTitles = sc.nextInt();
    System.out.println("Please enter the song title you wish to play");
    for(int i = 0; i < numTitles; i++) { //don't need .length  //continue asking for titles until number of titles is reached
    songTitles[i] = sc.nextLine();
    }
    System.out.println("Please enter the song's playtime in number of seconds");
    playTime = sc.nextInt();
    
    //need to have user enter in the artists
    //this is where you call addArtist and checkArtist
  }
    
  //accessors
    public Artist getArtist(){return artist;} //doesn't recognize artist as a variable for some reason? 
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
      System.out.println(numTitles); //don't need toString
    }
    
    public void printPlayTime()
    {
      System.out.println(playTime); //don't need toString 
    }
    
    
    
    //adding these methods to this class per professor's recommendation
   /*
   * Adds a new artist to the myArtists array.
   * Checks if the artist already exists in the collection before appending.
   * Uses checkArtist method.
   */
  
  public void addArtist(Artist[] myArtists) {
     Artist artist = new Artist();
     boolean unique = checkArtist(artist, myArtists);
     if(unique == true) {
       myArtists[artCount] = artist;
       artCount++;
     }
  }
  
  /*
   * Checks if the given artist is already in the myArtists array.
   * @return boolean unique
   */
  //Vince's method 
  public boolean checkArtist(Artist a1, Artist[] myArtists)
  {
    boolean unique; //removed private
    int i;
    unique = true;
    i = 0;
    
    while (unique && i <= myArtists.length) //remove brackets
       {
         unique=!a1.equals(myArtists[i]);
         i++;
       }
    return unique;
  }
}
