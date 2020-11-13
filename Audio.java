//Audio.java
//Media application project

import java.util.Scanner;

public class Audio extends Media {
  
  //data members
  private Artist groupMembers[];
  private int numMems;
  private Artist producer; 
  
  //constructors
  public Audio (Artist artist, int numOfPlays, String title, int playTime, Artist[] gMem, int nMem, Artist prod)
  {
    
    super(title, artist, numOfPlays, playTime);
    groupMembers = gMem;
    numMems = nMem;
    producer = prod;
  }
  
  public Audio(Artist[] myArtists, int artCount) //null constructor
  {
    super(myArtists, artCount);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of group members in the band");
    numMems = sc.nextInt();
    System.out.println("Please enter the names of the group members in the band");
    for(int i = 0; i < numMems; i++) { //need to check if the artsit already exists //add method to check artist -> same thing for DVD 
      System.out.println("First name");
      String first = sc.next();
      System.out.println("Last name");
      String last = sc.next();
      addArtist(first, last, myArtists, artCount);
    }
      System.out.println("Please enter the name of the album producer");
      System.out.println("First");
      String pFirst = sc.nextLine();
      System.out.println("Last");
      String pLast = sc.nextLine();
      if(checkArtist(pFirst, pLast, myArtists)) {
      producer = new Artist();
      myArtists[artCount] = producer;
      artCount++;
      }
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
    
   public void addArtist(String first, String last, Artist[] myArtists, int artCount) {
     boolean unique = checkArtist(first, last, myArtists);
     if(unique == true) {
       Artist artist = new Artist();
       myArtists[artCount] = artist;
       artCount++;
     }
   }
       /*
   * Checks if the given artist is already in the myArtists array.
   * @return boolean unique
   */
  public boolean checkArtist(String first, String last, Artist[] myArtists)
  {
    boolean unique; 
    int i;
    unique = true;
    i = 0;
    
    while (unique && i <= myArtists.length) 
       {
         unique=!(first.equals(myArtists[i].getFirst()) && last.equals(myArtists[i].getLast()));
         i++;
       }
    return unique;
  }
  }
 