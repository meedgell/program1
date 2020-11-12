//Audio.java
//Media application project
package medialib;

import java.util.Scanner;

public class Audio extends Media {
  
  //data members
  private Artist groupMembers[];
  private int numMems;
  private Artist producer; 
  
  //constructors
  public Audio (Artist artist, int numOfPlays, String title, int playTime, Artist[] gMem, int nMem, Artist prod)
  {
    
    super(artist, numOfPlays, title, playTime);
    groupMembers = gMem;
    numMems = nMem;
    producer = prod;
  }
  
  public Audio() //null constructor
  {
    super();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of group members in the band");
    numMems = sc.nextInt();
    System.out.println("Please enter the names of the group members in the band");
    for(int i = 0; i < groupMembers.length; i++) {  
    groupMembers[i] = new Artist();
    }
    System.out.println("Please enter the name of the album producer");
    producer = new Artist();

  }
       
  //accessors 
    public Artist[] getGroupMembers() {return groupMembers;}
    public int getNumMems() {return numMems;}
    public Artist getProducer() {return producer;}
    
    //toString method
    public String toString(){
      return super.toString() + "\nGroup Members: " + groupMembers +
     "\nNumber of Members: " + numMems + "\nProducer" + producer;
  }
    
    //playMedia method
    public void playMedia(){
      super.playMedia();
        System.out.println( 
       "\nGroup Members: " + groupMembers +
     "\nProduced by: " + producer); 
      
    }
    
    //print method
    public void printGroupMembers()
    {
      System.out.println(groupMembers.toString());
    }
    
    public void printNumMems(int numMems)
    {
      numMems=0; 
      for(int i = 0; i < groupMembers.length; i++) {  
      numMems++;  
      }
      System.out.println(numMems);
    }
    
    public void printProducer()
    {
      System.out.println(producer.toString());
    }
}
