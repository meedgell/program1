/*
Artist.Java
Vince Forrester
Artist Class of Media Library Application
11/16/2020
 */

package mediali;

import java.util.Scanner;
import java.io.IOException;

public class Artist {
    
private String first;
private String last;
private Date birthDate=new Date();
private String twitterHandle;
private String url;

private Boolean go;

Scanner sc1 = new Scanner(System.in);


public Artist ()
{
    
    
    
    
    
System.out.println("Artist Entry");

System.out.print("Enter the Artist's First Name:");  
first=sc1.nextLine();


Date dai = new Date(03,06,2008);	
last="hhhhh";	
birthDate=dai;	
twitterHandle="";	
url="";


/*


System.out.print("Enter the Artist's Last Name:");
last=sc1.nextLine();

go=false;

while (!go)
{try
{
    System.out.println("Enter the Artist's date of birth (mm/dd/yyyy):");
    birthDate.getDate();
    go=true;
}
    catch (Exception ex)
{
    System.out.println(ex.getMessage());
    System.err.println(ex);
    go=false;
    System.out.println("The values you entered were invalid. Please reenter the Artist's date of birth:");
}
}                 
                   
                   
                   
                   
System.out.print("Twitt Handle:");
twitterHandle=sc1.next();

System.out.print("Enter the Artist's URL:");
url=sc1.next();
        
*/      
}


        
//accessors

public String getFirst()
{
    return first;
}
        
        
public String getLast()
{
    return last;
}


        
public Date getBirthDate()
{
    return birthDate;
}

public String getTwitterHandle()
{
    return twitterHandle;
}
        
public String getUrl()
{
    return url;
}

public String toString()
{
    return "Name: " + first + " " + last + "\nBirthdate: " + birthDate +"\ntwitterHandle: "+twitterHandle+"\nURL: "+url + "\n\n";
}
  
//make equals on last & first name and dob so user won't have to enter in everything every time 
public boolean aEquals(Artist a1)
    {
        System.out.print(a1.getFirst());//last+" "+a1.getLast()+" "+first+" "+a1.getFirst());
     return ( last.equals(a1.getLast()) && first.equals(a1.getFirst()));
    }
    
}
