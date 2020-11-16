//Audio.java
//Media application project
package mediali;

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
  /*public Audio (Artist artist, int numOfPlays, String title, int playTime, Artist[] gMem, int nMem, Artist prod)
  {
    
    super();
    groupMembers = gMem;
    numMems = nMem;
    producer = prod;
  }*/
  
  public Audio() //null constructor
  {
    super();
    Scanner sc = new Scanner(System.in);
    
    /*go=true;
    i=0;
    
    while (go)
    {
        System.out.println("A to add Supporting artist or X when complete:");
        c=sc.next();

        if (c.equals("A"))
        {
            groupMembers[i] = new Artist(); 
            groupMembers=Arrays.copyOf(groupMembers, groupMembers.length+1);
            i++;
        }else
        {
        go=false;
        }
    }*/  
    
   groupMembers= multiArtistPrompt("Group Members");
    
    
    
    System.out.println("Please enter the name of the album producer");
    producer = new Artist();

  }
       
  //accessors 
    public Artist[] getGroupMembers() {return groupMembers;}
    public int getNumMems() {return numMems;}
    public Artist getProducer() {return producer;}
    
    //toString method
    public String toString(){
        
      return "404 Error:AudioTostring";

//super.toString() + "\nGroup Members: " + groupMembers + "\nNumber of Members: " + numMems + "\nProducer" + producer;
  
    
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

