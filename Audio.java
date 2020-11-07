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
    //contains all data members
    public String toString(){
      return super.toString() + "\nGroup Members: " + groupMembers +
     "\nNumber of Members: " + numMems + "\nProducer" + producer;
  }
    
    //print method
    public void printGroupMembers()
    {
      System.out.println(groupMembers.toString());
    }
    
    public void printNumMems()
    {
      System.out.println(numMems.toString());
    }
    
    public void printProducer()
    {
      System.out.println(producer.toString());
    }
}