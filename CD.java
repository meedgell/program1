//CD.java
//Media application project

public class CD extends Audio {
  
  //data members
  private String songTitles[];
  private int numTitles;
  private int playTime;
  
  //constructors
  public CD(Artist artist, int numOfPlays, String title, int playTime, Artist gMem, int nMem, 
               Artist prod, String st, int nt, int pt, String sTitle[], int nTitle, int pTime)
  {
  super(artist, numOfPlays, title, playTime, gMem, nMem, prod);
     songTitles = sTitle[];
     numTitles = nTitle;
     playTime = pTime;
  }
  
  public CD() //null constructor
  {
    super();
    songTitles[] = " ";
    numTitles = 0;
    playTime = 0;
  }
    
  //accessors
    public Artist getArtist(){return Artist;} 
    public int getnumOfPlays(){return numOfPlays;} 
    public double getplayTime(){return playTime;} 
    public String getTitle(){return Title;} 
    
    //toString method
    //contains all data members
    public string toString(){
      return super.toString() + "\nSong Title: " + songTitles +
     "\nPlay Time: " + playTime + "\nNumber of Titles:" + numTitles;
  }
    
    //playMedia method
    public void playMedia(){
      return super.playMedia() + "/nNow playing CD:" + 
      + "\nSong Title: " + songTitles +
     "\nPlay Time: " + playTime;
    }
}