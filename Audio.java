//Audio.java
//Media application project

public class Audio extends Media {
  
  //data members
  private Artist groupMembers[];
  private int numMems;
  private Artist producer[]; 
  
  //constructors
  public Audio (Artist artist, int numOfPlays, String title, int playTime, Artist gMem, int nMem, Artist prod)
  {
  super(artist, numOfPlays, title, playTime);
    groupMembers = gMem;
    numMems = nMem;
    producer = prod;
  }
  
  public Audio() //null constructor
  {
    super();
    groupMembers = new Artist[];
    numMems = 0;
    producer = new Artist[];
  }
       
  //accessors 
    public Artist getGroupMembers() {return groupMembers;}
    public int getNumMems() {return numMems;}
    public Artist getProducer() {return producer;}
    
    //toString method
    public String toString(){
      return super.toString() + "\nGroup Members: " + groupMembers +
     "\nNumber of Members: " + numMems + "\nProducer" + producer;
  }
    
    //playMedia method
    public void playMedia(){
      return super.playMedia();
      System.out.println("Group members include" + groupMembers);
      System.out.println("Produced by" + producer);
    }
}