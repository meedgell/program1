//Audio.java
//Media application project
//Michelle Frankot
//11/16/2020
//package mediali;

import java.util.Arrays;
import java.util.Scanner;

public class Audio extends Media {
  
  //data members
  public Artist[] groupMembers=new Artist[1];
  protected int numMems;
  protected Artist producer; 
  private boolean go;
  private Integer i;
  private String c;
  
  //constructors
  
  
  public Audio() //null constructor
  {
    super();
    Scanner sc = new Scanner(System.in);
    
   groupMembers= multiArtistPrompt("Group Members");
    
    
    
    System.out.println("Enter the details of the album's producer:");
    producer = new Artist();

  }
       
  //accessors 
    public Artist[] getGroupMembers() {return groupMembers;}
    public int getNumMems() {return numMems;}
    public Artist getProducer() {return producer;}
    
    //toString method
    public String toString(){
        
      return "404 Error:AudioTostring";//We liked calling it a 404 error.
 
    }
    
    //playMedia method
    public void playMedia(){
      super.playMedia();

        System.out.println("\nGroup Members: ") ;
                
      for (int i=0;i<numMems;i++)
        {System.out.println(groupMembers[i].toString());}          
               
     System.out.println("\nProduced by: " + producer); 
      
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

