//CD.java
//Media application project

public class CD extends Audio {
  
  //data members
  private String songTitles[];
  private int numTitles;
  private int playTime;
  
  //constructors
  public CD(Artist artist, int numOfPlays, String title, int playTime, Artist[] gMem, int nMem, //changed Artist gMem -> Artist[] gMem
               Artist prod, String[] st, int nt, int pt, String sTitle[], int nTitle, int pTime) //changed String st -> String[] st
  {
  super(artist, numOfPlays, title, playTime, gMem, nMem, prod);
     songTitles = st;
     numTitles = nTitle;
     playTime = pTime;
  }
  
  public CD() //null constructor
  {
    //I don't think we need to declare other data members in null constructor
    super();
    //songTitles[] = "";
    //numTitles = 0;
    //playTime = 0;
  }
    
  //accessors
    public Artist getArtist(){return artist;} //changed from return Artist -> return artist
    public int getnumOfPlays(){return numOfPlays;} 
    public double getplayTime(){return playTime;} 
    public String getTitle(){return title;} //changed from return Title -> return title
    
    //toString method
    //contains all data members
    public String toString(){ //changed return type to upper case S String
      return super.toString() + "\nSong Title: " + songTitles +
     "\nPlay Time: " + playTime + "\nNumber of Titles:" + numTitles;
  }
    
    //playMedia method
    public void playMedia(){
      super.playMedia();
        System.out.println("/nNow playing CD:" + 
       "\nSong Title: " + songTitles +
     "\nPlay Time: " + playTime); //changed to prints rather than returns
      
    }
}
