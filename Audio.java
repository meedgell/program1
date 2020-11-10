//Audio.java
//Media application project

public class Audio extends Media {
  
  //data members
  private Artist groupMembers[];
  private int numMems;
  private Artist producer; //changed from Artist producer[] -> Artist producer (I'm guessing there is only 1 producer?)
  
  //constructors
  public Audio (Artist artist, int numOfPlays, String title, int playTime, Artist[] gMem, int nMem, Artist prod)
  {
    //changed from Artist gMem -> Artist[] gMem in params
    
    super(artist, numOfPlays, title, playTime);
    groupMembers = gMem;
    numMems = nMem;
    producer = prod;
  }
  
  public Audio() //null constructor
  {
    //I think you don't need the other data member declarations in a null constructor
    super();
    //groupMembers = new Artist[];
    //numMems = 0;
    //producer = new Artist[];
  }
       
  //accessors 
    public Artist[] getGroupMembers() {return groupMembers;} //changed return type from Artist -> Artist[]
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
      int memCount=0; //added variable to keep count
      for(int i = 0; i < groupMembers.length; i++) { //added this loop to iterate through groupMember array 
        memCount++;  //keeps count of groupMembers
      }
      System.out.println(memCount);
      //System.out.println(numMems.toString());
    }
    
    public void printProducer()
    {
      System.out.println(producer.toString());
    }
}
